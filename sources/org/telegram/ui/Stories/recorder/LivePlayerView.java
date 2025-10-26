package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.PeerStoriesView;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

public class LivePlayerView extends FrameLayout implements RendererCommon.RendererEvents {
    private final TextureView blurRenderer;
    private boolean firstFrameRendered;
    private boolean ignoreLayout;
    private float keyboardOffset;
    private PeerStoriesView.VideoPlayerSharedScope scope;
    public final SurfaceViewRenderer surfaceView;
    public final TextureViewRenderer textureView;

    @Override
    public void onFrameResolutionChanged(int i, int i2, int i3) {
    }

    public LivePlayerView(Context context, boolean z) {
        super(context);
        TextureView textureView = new TextureView(context);
        this.blurRenderer = textureView;
        addView(textureView, LayoutHelper.createFrame(-1, -1, 119));
        if (z) {
            SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(context);
            this.surfaceView = surfaceViewRenderer;
            addView(surfaceViewRenderer, LayoutHelper.createFrame(-1, -1, 119));
            this.textureView = null;
            return;
        }
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.textureView = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, LayoutHelper.createFrame(-1, -1, 119));
        this.surfaceView = null;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            this.textureView.setBackgroundRenderer(this.blurRenderer);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.firstFrameRendered = false;
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
    }

    @Override
    public void onFirstFrameRendered() {
        if (this.firstFrameRendered) {
            return;
        }
        PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope = this.scope;
        if (videoPlayerSharedScope != null && !videoPlayerSharedScope.firstFrameRendered) {
            videoPlayerSharedScope.firstFrameRendered = true;
            videoPlayerSharedScope.invalidate();
        }
        this.firstFrameRendered = true;
    }

    public void setScope(PeerStoriesView.VideoPlayerSharedScope videoPlayerSharedScope) {
        this.scope = videoPlayerSharedScope;
        if (!this.firstFrameRendered || videoPlayerSharedScope == null || videoPlayerSharedScope.firstFrameRendered) {
            return;
        }
        videoPlayerSharedScope.firstFrameRendered = true;
        videoPlayerSharedScope.invalidate();
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public void setSecure(boolean z) {
        SurfaceViewRenderer surfaceViewRenderer = this.surfaceView;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z);
        }
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.ignoreLayout = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.textureView;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.ignoreLayout = false;
        super.onMeasure(i, i2);
        View view = this.textureView;
        if (view == null) {
            view = this.surfaceView;
        }
        this.blurRenderer.getLayoutParams().width = view.getMeasuredWidth();
        this.blurRenderer.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i, i2);
        TextureViewRenderer textureViewRenderer2 = this.textureView;
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.updateRotation();
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.blurRenderer;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), this.blurRenderer.getMeasuredHeight());
        View view = this.textureView;
        if (view == null) {
            view = this.surfaceView;
        }
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        updateTranslations();
    }

    private void updateTranslations() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        View view = this.textureView;
        if (view == null) {
            view = this.surfaceView;
        }
        int measuredWidth2 = this.blurRenderer.getMeasuredWidth();
        int measuredHeight2 = this.blurRenderer.getMeasuredHeight();
        this.blurRenderer.setPivotX(0.0f);
        this.blurRenderer.setPivotY(0.0f);
        float f = measuredWidth;
        float f2 = measuredWidth2;
        float f3 = measuredHeight;
        float f4 = measuredHeight2;
        float max = Math.max(f / f2, f3 / f4);
        this.blurRenderer.setScaleX(max);
        this.blurRenderer.setScaleY(max);
        this.blurRenderer.setTranslationX((f - (f2 * max)) / 2.0f);
        this.blurRenderer.setTranslationY(((f3 - (f4 * max)) / 2.0f) - (this.keyboardOffset / 2.0f));
        float measuredWidth3 = view.getMeasuredWidth();
        float measuredHeight3 = view.getMeasuredHeight();
        float max2 = Math.max(measuredWidth3 / f, measuredHeight3 / f3);
        view.setScaleX(max2);
        view.setScaleY(max2);
        view.setTranslationX((f - (measuredWidth3 * max2)) / 2.0f);
        view.setTranslationY(((f3 - (measuredHeight3 * max2)) / 2.0f) - (this.keyboardOffset / 2.0f));
    }

    public void setKeyboardOffset(float f) {
        this.keyboardOffset = f;
        updateTranslations();
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureViewRenderer textureViewRenderer = this.textureView;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(this.textureView.getX(), this.textureView.getY());
                    canvas.scale((this.textureView.getWidth() * this.textureView.getScaleX()) / bitmap.getWidth(), (this.textureView.getHeight() * this.textureView.getScaleY()) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
            TextureView textureView = this.blurRenderer;
            if (view == textureView) {
                Bitmap bitmap2 = textureView.getBitmap();
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(this.blurRenderer.getX(), this.blurRenderer.getY());
                    canvas.scale((this.blurRenderer.getWidth() * this.blurRenderer.getScaleX()) / bitmap2.getWidth(), (this.blurRenderer.getHeight() * this.blurRenderer.getScaleY()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureView textureView = this.blurRenderer;
            if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
                return;
            }
            canvas.save();
            canvas.translate(this.blurRenderer.getX(), this.blurRenderer.getY());
            canvas.scale((this.blurRenderer.getWidth() * this.blurRenderer.getScaleX()) / bitmap.getWidth(), (this.blurRenderer.getHeight() * this.blurRenderer.getScaleY()) / bitmap.getHeight());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
