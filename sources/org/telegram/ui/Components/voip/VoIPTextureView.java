package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.PremiumPreviewFragment;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;

public class VoIPTextureView extends FrameLayout {
    public int animateFromHeight;
    public float animateFromRendererW;
    public float animateFromThumbScale;
    public int animateFromWidth;
    public float animateFromX;
    public float animateFromY;
    public long animateNextDuration;
    public boolean animateOnNextLayout;
    public final ArrayList animateOnNextLayoutAnimations;
    public boolean animateWithParent;
    public float animationProgress;
    public float aninateFromScale;
    public float aninateFromScaleBlur;
    public final boolean applyRotation;
    public final View backgroundView;
    public final TextureView blurRenderer;
    public final Bitmap cameraLastBitmap;
    public float clipHorizontal;
    public boolean clipToTexture;
    public float clipVertical;
    public ValueAnimator currentAnimation;
    public float currentClipHorizontal;
    public float currentClipVertical;
    public float currentThumbScale;
    public boolean ignoreLayout;
    public final ImageView imageView;
    public View placeholderView;
    public final AnonymousClass1 renderer;
    public float roundRadius;
    public float scaleTextureToFill;
    public float scaleTextureToFillBlur;
    public float scaleThumb;
    public int scaleType;
    public boolean screencast;
    public final ImageView screencastImage;
    public final TextView screencastText;
    public final FrameLayout screencastView;
    public float stubVisibleProgress;
    public Bitmap thumb;

    public VoIPTextureView(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context);
        this.stubVisibleProgress = 1.0f;
        this.animateOnNextLayoutAnimations = new ArrayList();
        this.aninateFromScale = 1.0f;
        this.aninateFromScaleBlur = 1.0f;
        this.animateFromThumbScale = 1.0f;
        this.applyRotation = z2;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        ?? r5 = new TextureViewRenderer(context) {
            @Override
            public final void onFirstFrameRendered() {
                super.onFirstFrameRendered();
                VoIPTextureView.this.onFirstFrameRendered();
            }

            @Override
            public final void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
            }
        };
        this.renderer = r5;
        r5.setFpsReduction(30.0f);
        r5.setOpaque(false);
        r5.setEnableHardwareScaler(true);
        r5.setIsCamera(!z2);
        if (!z && z2) {
            View view = new View(context);
            this.backgroundView = view;
            view.setBackgroundColor(-14999773);
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
            if (z4) {
                TextureView textureView = new TextureView(context);
                this.blurRenderer = textureView;
                addView(textureView, LayoutHelper.createFrame(-1, -2, 17));
            }
            r5.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView((View) r5, LayoutHelper.createFrame(-1, -2, 17));
        } else if (z) {
            if (z4) {
                TextureView textureView2 = new TextureView(context);
                this.blurRenderer = textureView2;
                addView(textureView2, LayoutHelper.createFrame(-1, -2, 17));
            }
            addView(r5);
        } else {
            if (z4) {
                TextureView textureView3 = new TextureView(context);
                this.blurRenderer = textureView3;
                addView(textureView3, LayoutHelper.createFrame(-1, -2, 17));
            }
            addView((View) r5, LayoutHelper.createFrame(-1, -2, 17));
        }
        addView(imageView);
        TextureView textureView4 = this.blurRenderer;
        if (textureView4 != null) {
            textureView4.setOpaque(false);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.screencastView = frameLayout;
        frameLayout.setBackground(new MotionBackgroundDrawable(-14602694, -13935795, -14395293, -14203560, true, 0, false));
        addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
        frameLayout.setVisibility(8);
        ImageView imageView2 = new ImageView(getContext());
        this.screencastImage = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.screencast_big);
        frameLayout.addView(imageView2, LayoutHelper.createFrame(82, 82.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(getContext());
        this.screencastText = textView;
        textView.setText(LocaleController.getString(R.string.VoipVideoScreenSharing));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(15.0f, -1, 1, textView);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 21.0f, 28.0f, 21.0f, 0.0f));
        if (z3) {
            setOutlineProvider(new PremiumPreviewFragment.AnonymousClass3(this, 7));
            setClipToOutline(true);
        }
        if (z && this.cameraLastBitmap == null) {
            try {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg").getAbsolutePath());
                this.cameraLastBitmap = bitmapDecodeFile;
                if (bitmapDecodeFile == null) {
                    this.cameraLastBitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "icthumb.jpg").getAbsolutePath());
                }
                imageView.setImageBitmap(this.cameraLastBitmap);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            } catch (Throwable unused) {
            }
        }
        if (z2) {
            return;
        }
        setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        boolean z = AndroidUtilities.makingGlobalBlurBitmap;
        AnonymousClass1 anonymousClass1 = this.renderer;
        if (z) {
            TextureView textureView = this.blurRenderer;
            if (textureView != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap != null) {
                    canvas.scale(textureView.getWidth() / bitmap.getWidth(), textureView.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
            if (anonymousClass1 != null) {
                canvas.save();
                canvas.translate(anonymousClass1.getX(), anonymousClass1.getY());
                Bitmap bitmap2 = anonymousClass1.getBitmap();
                if (bitmap2 != null) {
                    canvas.scale(anonymousClass1.getWidth() / bitmap2.getWidth(), anonymousClass1.getHeight() / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                canvas.restore();
            }
        }
        ImageView imageView = this.imageView;
        if (imageView.getVisibility() == 0 && anonymousClass1.isFirstFrameRendered()) {
            float f = this.stubVisibleProgress - 0.10666667f;
            this.stubVisibleProgress = f;
            if (f <= 0.0f) {
                this.stubVisibleProgress = 0.0f;
                imageView.setVisibility(8);
            } else {
                invalidate();
                imageView.setAlpha(this.stubVisibleProgress);
            }
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (AndroidUtilities.makingGlobalBlurBitmap && (view == this.renderer || view == this.blurRenderer)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    public View getPlaceholderView() {
        if (this.placeholderView == null) {
            View view = new View(getContext());
            this.placeholderView = view;
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
        }
        return this.placeholderView;
    }

    public void onFirstFrameRendered() {
        invalidate();
        AnonymousClass1 anonymousClass1 = this.renderer;
        if (anonymousClass1.getAlpha() != 1.0f) {
            anonymousClass1.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.blurRenderer;
        if (textureView == null || textureView.getAlpha() == 1.0f) {
            return;
        }
        textureView.animate().setDuration(300L).alpha(1.0f);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float top;
        float left;
        super.onLayout(z, i, i2, i3, i4);
        TextureView textureView = this.blurRenderer;
        if (textureView != null) {
            this.scaleTextureToFillBlur = Math.max(getMeasuredHeight() / textureView.getMeasuredHeight(), getMeasuredWidth() / textureView.getMeasuredWidth());
        }
        boolean z2 = this.applyRotation;
        AnonymousClass1 anonymousClass1 = this.renderer;
        if (!z2) {
            anonymousClass1.updateRotation();
        }
        if (this.scaleType == 3) {
            if (textureView != null) {
                textureView.setScaleX(this.scaleTextureToFillBlur);
                textureView.setScaleY(this.scaleTextureToFillBlur);
                return;
            }
            return;
        }
        if (anonymousClass1.getMeasuredHeight() == 0 || anonymousClass1.getMeasuredWidth() == 0 || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.scaleTextureToFill = 1.0f;
            if (this.currentAnimation == null && !this.animateOnNextLayout) {
                this.currentClipHorizontal = 0.0f;
                this.currentClipVertical = 0.0f;
            }
        } else {
            int i5 = this.scaleType;
            if (i5 == 0) {
                this.scaleTextureToFill = Math.max(getMeasuredHeight() / anonymousClass1.getMeasuredHeight(), getMeasuredWidth() / anonymousClass1.getMeasuredWidth());
            } else if (i5 == 2) {
                if (Math.abs((getMeasuredHeight() / getMeasuredWidth()) - 1.0f) < 0.02f) {
                    this.scaleTextureToFill = Math.max(getMeasuredHeight() / anonymousClass1.getMeasuredHeight(), getMeasuredWidth() / anonymousClass1.getMeasuredWidth());
                } else if (getMeasuredWidth() <= getMeasuredHeight() || anonymousClass1.getMeasuredHeight() <= anonymousClass1.getMeasuredWidth()) {
                    this.scaleTextureToFill = Math.min(getMeasuredHeight() / anonymousClass1.getMeasuredHeight(), getMeasuredWidth() / anonymousClass1.getMeasuredWidth());
                } else {
                    this.scaleTextureToFill = Math.max(getMeasuredHeight() / anonymousClass1.getMeasuredHeight(), (getMeasuredWidth() / 2.0f) / anonymousClass1.getMeasuredWidth());
                }
            } else if (i5 == 1) {
                this.scaleTextureToFill = Math.min(getMeasuredHeight() / anonymousClass1.getMeasuredHeight(), getMeasuredWidth() / anonymousClass1.getMeasuredWidth());
                if (this.clipToTexture && !this.animateWithParent && this.currentAnimation == null && !this.animateOnNextLayout) {
                    this.currentClipHorizontal = (getMeasuredWidth() - anonymousClass1.getMeasuredWidth()) / 2.0f;
                    this.currentClipVertical = (getMeasuredHeight() - anonymousClass1.getMeasuredHeight()) / 2.0f;
                    invalidateOutline();
                }
            }
        }
        if (this.thumb != null) {
            this.scaleThumb = Math.max(getMeasuredWidth() / this.thumb.getWidth(), getMeasuredHeight() / this.thumb.getHeight());
        }
        if (!this.animateOnNextLayout) {
            if (this.currentAnimation == null) {
                anonymousClass1.setScaleX(this.scaleTextureToFill);
                anonymousClass1.setScaleY(this.scaleTextureToFill);
                if (textureView != null) {
                    textureView.setScaleX(this.scaleTextureToFillBlur);
                    textureView.setScaleY(this.scaleTextureToFillBlur);
                }
                this.currentThumbScale = this.scaleThumb;
                return;
            }
            return;
        }
        this.aninateFromScale /= anonymousClass1.getMeasuredWidth() / this.animateFromRendererW;
        this.aninateFromScaleBlur /= anonymousClass1.getMeasuredWidth() / this.animateFromRendererW;
        this.animateOnNextLayout = false;
        if (!this.animateWithParent || getParent() == null) {
            top = this.animateFromY - getTop();
            left = this.animateFromX - getLeft();
        } else {
            View view = (View) getParent();
            top = this.animateFromY - view.getTop();
            left = this.animateFromX - view.getLeft();
        }
        this.clipVertical = 0.0f;
        this.clipHorizontal = 0.0f;
        if (this.animateFromHeight != getMeasuredHeight()) {
            float measuredHeight = (getMeasuredHeight() - this.animateFromHeight) / 2.0f;
            this.clipVertical = measuredHeight;
            top -= measuredHeight;
        }
        final float f = top;
        if (this.animateFromWidth != getMeasuredWidth()) {
            float measuredWidth = (getMeasuredWidth() - this.animateFromWidth) / 2.0f;
            this.clipHorizontal = measuredWidth;
            left -= measuredWidth;
        }
        final float f2 = left;
        setTranslationY(f);
        setTranslationX(f2);
        ValueAnimator valueAnimator = this.currentAnimation;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.currentAnimation.cancel();
        }
        anonymousClass1.setScaleX(this.aninateFromScale);
        anonymousClass1.setScaleY(this.aninateFromScale);
        if (textureView != null) {
            textureView.setScaleX(this.aninateFromScaleBlur);
            textureView.setScaleY(this.aninateFromScaleBlur);
        }
        this.currentClipVertical = this.clipVertical;
        this.currentClipHorizontal = this.clipHorizontal;
        invalidateOutline();
        invalidate();
        final float f3 = this.aninateFromScale;
        final float f4 = this.aninateFromScaleBlur;
        final float f5 = this.animateFromThumbScale;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.currentAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VoIPTextureView voIPTextureView = this.f$0;
                voIPTextureView.getClass();
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f6 = 1.0f - fFloatValue;
                voIPTextureView.animationProgress = f6;
                voIPTextureView.currentClipVertical = voIPTextureView.clipVertical * fFloatValue;
                voIPTextureView.currentClipHorizontal = voIPTextureView.clipHorizontal * fFloatValue;
                voIPTextureView.invalidateOutline();
                voIPTextureView.invalidate();
                float f7 = (voIPTextureView.scaleTextureToFill * f6) + (f3 * fFloatValue);
                VoIPTextureView.AnonymousClass1 anonymousClass2 = voIPTextureView.renderer;
                anonymousClass2.setScaleX(f7);
                anonymousClass2.setScaleY(f7);
                float f8 = (voIPTextureView.scaleTextureToFillBlur * f6) + (f4 * fFloatValue);
                TextureView textureView2 = voIPTextureView.blurRenderer;
                if (textureView2 != null) {
                    textureView2.setScaleX(f8);
                    textureView2.setScaleY(f8);
                }
                voIPTextureView.setTranslationX(f2 * fFloatValue);
                voIPTextureView.setTranslationY(f * fFloatValue);
                voIPTextureView.currentThumbScale = (voIPTextureView.scaleThumb * f6) + (f5 * fFloatValue);
            }
        });
        long j = this.animateNextDuration;
        if (j != 0) {
            this.currentAnimation.setDuration(j);
        } else {
            this.currentAnimation.setDuration(350L);
        }
        this.currentAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.currentAnimation.addListener(new Tooltip.AnonymousClass1(this, 29));
        this.currentAnimation.start();
        ArrayList arrayList = this.animateOnNextLayoutAnimations;
        if (!arrayList.isEmpty()) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ((Animator) arrayList.get(i6)).start();
            }
        }
        arrayList.clear();
        this.animateNextDuration = 0L;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.applyRotation;
        AnonymousClass1 anonymousClass1 = this.renderer;
        if (!z) {
            this.ignoreLayout = true;
            anonymousClass1.setScreenRotation(((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation());
            this.ignoreLayout = false;
        }
        super.onMeasure(i, i2);
        updateRendererSize();
        super.onMeasure(i, i2);
        anonymousClass1.updateRotation();
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public final void saveCameraLastBitmap() {
        Bitmap bitmap = getBitmap(150, 150);
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.blurBitmap(bitmap, 3);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "voip_icthumb.jpg"));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (Throwable unused) {
        }
    }

    public void setAnimateNextDuration(long j) {
        this.animateNextDuration = j;
    }

    public void setAnimateWithParent(boolean z) {
        this.animateWithParent = z;
    }

    public void setIsScreencast(boolean z) {
        this.screencast = z;
        this.screencastView.setVisibility(z ? 0 : 8);
        boolean z2 = this.screencast;
        TextureView textureView = this.blurRenderer;
        AnonymousClass1 anonymousClass1 = this.renderer;
        if (z2) {
            anonymousClass1.setVisibility(8);
            if (textureView != null) {
                textureView.setVisibility(8);
            }
            this.imageView.setVisibility(8);
            return;
        }
        anonymousClass1.setVisibility(0);
        if (textureView != null) {
            textureView.setVisibility(0);
        }
    }

    public void setRoundCorners(float f) {
        if (this.roundRadius != f) {
            this.roundRadius = f;
            invalidateOutline();
        }
    }

    public final void setScreenshareMiniProgress(float f, boolean z) {
        if (this.screencast) {
            float scaleX = ((View) getParent()).getScaleX();
            this.screencastText.setAlpha(1.0f - f);
            float fM = !z ? TextureRenderer$$ExternalSyntheticOutline0.m(0.4f, scaleX, f, 1.0f / scaleX) : 1.0f - (0.4f * f);
            ImageView imageView = this.screencastImage;
            imageView.setScaleX(fM);
            imageView.setScaleY(fM);
            imageView.setTranslationY(AndroidUtilities.dp(60.0f) * f);
        }
    }

    public void setStub(VoIPTextureView voIPTextureView) {
        if (this.screencast) {
            return;
        }
        Bitmap bitmap = voIPTextureView.renderer.getBitmap();
        ImageView imageView = this.imageView;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            imageView.setImageDrawable(voIPTextureView.imageView.getDrawable());
        } else {
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.stubVisibleProgress = 1.0f;
        imageView.setVisibility(0);
        imageView.setAlpha(1.0f);
    }

    public void setThumb(Bitmap bitmap) {
        this.thumb = bitmap;
    }

    public void updateRendererSize() {
        TextureView textureView = this.blurRenderer;
        if (textureView != null) {
            ViewGroup.LayoutParams layoutParams = textureView.getLayoutParams();
            AnonymousClass1 anonymousClass1 = this.renderer;
            layoutParams.width = anonymousClass1.getMeasuredWidth();
            textureView.getLayoutParams().height = anonymousClass1.getMeasuredHeight();
        }
    }
}
