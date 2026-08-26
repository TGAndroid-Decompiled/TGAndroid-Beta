package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;

public class ProfileGalleryBlurView extends View {
    public int actionSize;
    private RenderNode actionsBlurNode;
    private ProfileActionsView actionsView;
    private final AnimatedFloat alpha;
    private RenderNode blurNode;
    private final Runnable blurTask;
    private final ProfileMetaballView.BlurBitmapHolder[] currentFrame;
    private int currentPosition;
    private int frameHeight;
    private int frameWidth;
    private final Runnable invalidateTask;
    private volatile boolean isBluring;
    private final ViewPager.OnPageChangeListener listener;
    private final SizeNotifierFrameLayout.IViewWithInvalidateCallback[] listeners;
    private final Object lock;
    private boolean loopInvalidate;
    private ProfileMusicView musicView;
    private boolean needNewFrame;
    private final ProfileMetaballView.BlurBitmapHolder[] nextFrame;
    private int offset;
    private final Paint[] paints;
    private boolean shouldBlurActions;
    public int size;
    private boolean sizeChanged;
    private ProfileSuggestionView suggestionView;
    private boolean usingRenderNode;
    private ProfileGalleryView view;

    public ProfileGalleryBlurView(Context context) {
        super(context);
        int i = 2;
        int i2 = 1;
        this.usingRenderNode = Build.VERSION.SDK_INT >= 31;
        this.lock = new Object();
        this.nextFrame = new ProfileMetaballView.BlurBitmapHolder[3];
        this.currentFrame = new ProfileMetaballView.BlurBitmapHolder[3];
        this.isBluring = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.paints = paintArr;
        this.blurTask = new ProfileGalleryBlurView$$ExternalSyntheticLambda8(this, i);
        this.invalidateTask = new ProfileGalleryBlurView$$ExternalSyntheticLambda8(this, i2);
        this.currentPosition = -1;
        this.loopInvalidate = false;
        this.sizeChanged = false;
        this.needNewFrame = false;
        this.listeners = new SizeNotifierFrameLayout.IViewWithInvalidateCallback[3];
        AnimatedFloat animatedFloat = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.DEFAULT);
        this.alpha = animatedFloat;
        this.listener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i3) {
            }

            @Override
            public void onPageScrolled(int i3, float f, int i4) {
                if (!ProfileGalleryBlurView.this.usingRenderNode && Math.abs(i3 - ProfileGalleryBlurView.this.currentPosition) == 1) {
                    if (i3 > ProfileGalleryBlurView.this.currentPosition) {
                        ProfileGalleryBlurView.this.swap(0, 1, 1);
                    } else if (i3 < ProfileGalleryBlurView.this.currentPosition) {
                        ProfileGalleryBlurView.this.swap(1, 0, 0);
                        ProfileGalleryBlurView.this.swap(2, 0, -1);
                    }
                }
                int i5 = ProfileGalleryBlurView.this.currentPosition;
                int i6 = ProfileGalleryBlurView.this.offset;
                ProfileGalleryBlurView.this.currentPosition = i3;
                ProfileGalleryBlurView.this.offset = i4;
                if (i5 == ProfileGalleryBlurView.this.currentPosition && i6 == ProfileGalleryBlurView.this.offset) {
                    return;
                }
                ProfileGalleryBlurView.this.updateContent();
            }

            @Override
            public void onPageSelected(int i3) {
            }
        };
        animatedFloat.set(1.0f, true);
        boolean z = this.usingRenderNode & SharedConfig.useNewBlur;
        this.usingRenderNode = z;
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, paintArr[0]);
            setLayerType(1, paintArr[1]);
        }
    }

    private void applyShader(Bitmap bitmap, int i) {
        if (i >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.size / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.size}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.paints[i].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    private void captureActionsBlurRenderNode(float f, ProfileActivity.AvatarImageView avatarImageView, float f2, float f3) {
        initActionsRenderNode();
        if (!this.shouldBlurActions) {
            ProfileActionsView profileActionsView = this.actionsView;
            if (profileActionsView != null) {
                profileActionsView.drawingBlur(false);
            }
            ProfileSuggestionView profileSuggestionView = this.suggestionView;
            if (profileSuggestionView != null) {
                profileSuggestionView.drawingBlur(false);
            }
            ProfileMusicView profileMusicView = this.musicView;
            if (profileMusicView != null) {
                profileMusicView.drawingBlur(false);
                return;
            }
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f2 * 8.0f;
        this.actionsBlurNode.setPosition(0, 0, (int) Math.ceil(f / renderNodeScale), (int) ((this.actionSize + f3) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.actionsBlurNode.beginRecording();
        recordingCanvasBeginRecording.scale(0.125f, 0.125f);
        recordingCanvasBeginRecording.drawRenderNode(this.blurNode);
        this.actionsBlurNode.endRecording();
        this.actionsBlurNode.setAlpha(this.alpha.set(1.0f));
        ProfileActionsView profileActionsView2 = this.actionsView;
        if (profileActionsView2 != null) {
            if (avatarImageView != null) {
                profileActionsView2.drawingBlur(this.actionsBlurNode, avatarImageView, renderNodeScale / f2, -f3);
            } else {
                profileActionsView2.drawingBlur(this.actionsBlurNode, null, renderNodeScale, -f3);
            }
        }
        ProfileSuggestionView profileSuggestionView2 = this.suggestionView;
        if (profileSuggestionView2 != null) {
            if (avatarImageView != null) {
                profileSuggestionView2.drawingBlur(this.actionsBlurNode, avatarImageView, renderNodeScale / f2, -f3);
            } else {
                profileSuggestionView2.drawingBlur(this.actionsBlurNode, null, renderNodeScale, -f3);
            }
        }
        ProfileMusicView profileMusicView2 = this.musicView;
        if (profileMusicView2 != null) {
            if (avatarImageView != null) {
                profileMusicView2.drawingBlur(this.actionsBlurNode, avatarImageView, renderNodeScale / f2, (-f3) + AndroidUtilities.dp(22.0f));
            } else {
                profileMusicView2.drawingBlur(this.actionsBlurNode, null, renderNodeScale, (-f3) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    private boolean captureNextFrame() {
        SizeNotifierFrameLayout.IViewWithInvalidateCallback[] iViewWithInvalidateCallbackArr;
        ProfileGalleryView profileGalleryView = this.view;
        boolean z = false;
        if (profileGalleryView != null && !profileGalleryView.isZooming()) {
            int measuredWidth = (int) (this.view.getMeasuredWidth() / 6.0f);
            int i = (int) (this.size / 6.0f);
            if (measuredWidth > 0 && i > 0) {
                this.frameWidth = measuredWidth;
                this.frameHeight = i;
                int length = (!this.sizeChanged || this.needNewFrame) ? this.nextFrame.length : 1;
                this.sizeChanged = false;
                this.needNewFrame = false;
                for (int i2 = 0; i2 < length; i2++) {
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[i2];
                    if (iViewWithInvalidateCallback != null) {
                        iViewWithInvalidateCallback.listenInvalidate(null);
                    }
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i2];
                    if (blurBitmapHolder == null || !blurBitmapHolder.canUse(measuredWidth, i)) {
                        if (blurBitmapHolder != null) {
                            blurBitmapHolder.recycle();
                        }
                        this.nextFrame[i2] = new ProfileMetaballView.BlurBitmapHolder(measuredWidth, i);
                    }
                    if (this.nextFrame[i2].isBusy) {
                        if (length == 1) {
                            this.sizeChanged = true;
                        } else {
                            this.needNewFrame = true;
                        }
                    }
                }
                View itemViewAt = this.view.getItemViewAt(this.currentPosition);
                drawView(itemViewAt, 0);
                if (length == 1) {
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback2 = this.listeners[0];
                    if (iViewWithInvalidateCallback2 != null) {
                        iViewWithInvalidateCallback2.listenInvalidate(this.invalidateTask);
                    }
                    return !this.sizeChanged;
                }
                View itemViewAt2 = this.view.getItemViewAt(this.currentPosition + 1);
                drawView(itemViewAt2, 1);
                if (this.offset == 0) {
                    drawView(this.view.getItemViewAt(this.currentPosition - 1), 2);
                }
                int i3 = 0;
                while (true) {
                    iViewWithInvalidateCallbackArr = this.listeners;
                    if (i3 >= iViewWithInvalidateCallbackArr.length) {
                        break;
                    }
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback3 = iViewWithInvalidateCallbackArr[i3];
                    if (iViewWithInvalidateCallback3 != null) {
                        iViewWithInvalidateCallback3.listenInvalidate(this.invalidateTask);
                    }
                    i3++;
                }
                if ((itemViewAt != null && iViewWithInvalidateCallbackArr[0] == null) || (this.offset != 0 && itemViewAt2 != null && iViewWithInvalidateCallbackArr[1] == null)) {
                    z = true;
                }
                this.loopInvalidate = z;
                return true;
            }
        }
        return false;
    }

    public void doBlur() {
        ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr;
        int i = 0;
        synchronized (this.lock) {
            ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr2 = this.nextFrame;
            ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr2[0];
            ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr3 = this.currentFrame;
            blurBitmapHolderArr = new ProfileMetaballView.BlurBitmapHolder[]{blurBitmapHolder, blurBitmapHolderArr3[0], blurBitmapHolderArr2[1], blurBitmapHolderArr3[1], blurBitmapHolderArr2[2], blurBitmapHolderArr3[2]};
        }
        boolean z = false;
        for (int i2 = 0; i2 < 6; i2 += 2) {
            ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = blurBitmapHolderArr[i2];
            ProfileMetaballView.BlurBitmapHolder blurBitmapHolder3 = blurBitmapHolderArr[i2 + 1];
            if (blurBitmapHolder2 != null && !blurBitmapHolder2.destroying && blurBitmapHolder2.hasContent) {
                blurBitmapHolder2.lock();
                if (blurBitmapHolder3 == null || !blurBitmapHolder3.canUse(blurBitmapHolder2)) {
                    if (blurBitmapHolder3 != null) {
                        blurBitmapHolder3.recycle();
                    }
                    blurBitmapHolder3 = new ProfileMetaballView.BlurBitmapHolder(blurBitmapHolder2);
                    synchronized (this.lock) {
                        this.currentFrame[indexOf(blurBitmapHolder2)] = blurBitmapHolder3;
                    }
                }
                Bitmap bitmap = blurBitmapHolder2.bitmap;
                Utilities.stackBlurBitmap(bitmap, Math.max(10, bitmap.getWidth() / 180));
                synchronized (this.lock) {
                    blurBitmapHolder3.clear();
                    blurBitmapHolder3.canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    blurBitmapHolder3.ready();
                    applyShader(blurBitmapHolder3.bitmap, indexOf(blurBitmapHolder2));
                }
                blurBitmapHolder2.clear();
                blurBitmapHolder2.unlock();
                z = true;
            }
        }
        if (z && this.isBluring && this.view != null) {
            postInvalidateOnAnimation();
        }
        if (this.isBluring && (this.loopInvalidate || this.needNewFrame)) {
            AndroidUtilities.runOnUIThread(new ProfileGalleryBlurView$$ExternalSyntheticLambda8(this, i));
        } else {
            this.isBluring = false;
        }
    }

    private void drawOpeningImageRenderNode(ImageReceiver imageReceiver, Canvas canvas, float f, float f2) {
        if (imageReceiver == null) {
            return;
        }
        int i = imageReceiver.getRoundRadius()[0];
        imageReceiver.setRoundRadius(0);
        canvas.save();
        canvas.translate(0.0f, f - f2);
        imageReceiver.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.scale(1.0f, -1.0f);
        canvas.translate(0.0f, (-f2) - f);
        canvas.scale(1.0f, 2.0f, 0.0f, f2);
        imageReceiver.draw(canvas);
        canvas.restore();
        imageReceiver.setRoundRadius(i);
    }

    private void drawView(View view, int i) {
        ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i];
        if (view != 0 && !blurBitmapHolder.isBusy) {
            Canvas canvas = blurBitmapHolder.canvas;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.size - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            blurBitmapHolder.ready();
        }
        if (i == 0 || (this.offset != 0 && i == 1)) {
            if (view instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback) {
                this.listeners[i] = (SizeNotifierFrameLayout.IViewWithInvalidateCallback) view;
            } else {
                this.listeners[i] = null;
            }
        }
    }

    private void drawViewWithRenderNode(Canvas canvas, int i) {
        View itemViewAt = this.view.getItemViewAt(this.currentPosition + i);
        if (itemViewAt != 0) {
            int measuredHeight = itemViewAt.getMeasuredHeight();
            canvas.save();
            canvas.translate(0.0f, this.size - measuredHeight);
            itemViewAt.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, (-measuredHeight) - this.size);
            canvas.scale(1.0f, 2.0f, 0.0f, measuredHeight);
            itemViewAt.draw(canvas);
            canvas.restore();
        }
        if (!(itemViewAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback)) {
            this.listeners[i] = null;
            return;
        }
        SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = (SizeNotifierFrameLayout.IViewWithInvalidateCallback) itemViewAt;
        this.listeners[i] = iViewWithInvalidateCallback;
        iViewWithInvalidateCallback.listenInvalidate(this.invalidateTask);
    }

    private float getBlurRadius() {
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 8.0f : 20.0f;
        }
        return 12.0f;
    }

    private float getRenderNodeScale() {
        return AndroidUtilities.dp(1.0f);
    }

    private int indexOf(ProfileMetaballView.BlurBitmapHolder blurBitmapHolder) {
        int i = 0;
        while (true) {
            ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr = this.nextFrame;
            if (i >= blurBitmapHolderArr.length) {
                return 0;
            }
            if (blurBitmapHolderArr[i] == blurBitmapHolder) {
                return i;
            }
            i++;
        }
    }

    private void initActionsRenderNode() {
        if (this.actionsView == null && this.suggestionView == null && this.musicView == null) {
            this.shouldBlurActions = false;
            return;
        }
        if (this.actionsBlurNode == null) {
            this.actionsBlurNode = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m();
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
            this.actionsBlurNode.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
        }
        this.shouldBlurActions = true;
    }

    private void initRenderNode() {
        if (this.blurNode == null) {
            float renderNodeScale = getRenderNodeScale();
            this.blurNode = new RenderNode("profileBlurNode");
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.size / renderNodeScale, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.size}, Shader.TileMode.CLAMP);
            float blurRadius = getBlurRadius();
            RenderNode renderNode = this.blurNode;
            RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(blurRadius, blurRadius, Shader.TileMode.CLAMP);
            RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(linearGradient);
            BlendMode blendMode = BlendMode.DST_IN;
            renderNode.setRenderEffect(RenderEffect.createBlendModeEffect(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect, BlendMode.DST_IN));
        }
    }

    public void lambda$doBlur$0() {
        captureNextFrame();
        ProfileMetaballView.profileBlurQueue.postRunnable(this.blurTask);
    }

    public void swap(int i, int i2, int i3) {
        synchronized (this.lock) {
            try {
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr = this.nextFrame;
                ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr[i];
                blurBitmapHolderArr[i] = blurBitmapHolderArr[i2];
                blurBitmapHolderArr[i2] = blurBitmapHolder;
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr2 = this.currentFrame;
                ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = blurBitmapHolderArr2[i];
                blurBitmapHolderArr2[i] = blurBitmapHolderArr2[i2];
                blurBitmapHolderArr2[i2] = blurBitmapHolder2;
                if (i != 2) {
                    Paint[] paintArr = this.paints;
                    Paint paint = paintArr[i];
                    paintArr[i] = paintArr[i2];
                    paintArr[i2] = paint;
                } else if (blurBitmapHolder2.hasContent) {
                    applyShader(blurBitmapHolder2.bitmap, i2);
                }
                if (i3 != -1) {
                    this.paints[i3].setShader(null);
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder3 = this.nextFrame[i3];
                    if (blurBitmapHolder3 != null && !blurBitmapHolder3.isBusy) {
                        blurBitmapHolder3.clear();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateContent() {
        this.needNewFrame = true;
        postInvalidateOnAnimation();
    }

    public void destroy() {
        ProfileGalleryView profileGalleryView = this.view;
        if (profileGalleryView != null) {
            profileGalleryView.removeOnPageChangeListener(this.listener);
            this.view = null;
        }
        this.isBluring = false;
        ProfileMetaballView.profileBlurQueue.cancelRunnable(this.blurTask);
        if (Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.blurNode;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                this.blurNode = null;
            }
            RenderNode renderNode2 = this.actionsBlurNode;
            if (renderNode2 != null) {
                renderNode2.discardDisplayList();
                this.actionsBlurNode = null;
            }
        }
        this.actionsView = null;
        this.suggestionView = null;
        this.musicView = null;
        synchronized (this.lock) {
            for (int i = 0; i < 3; i++) {
                try {
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i];
                    if (blurBitmapHolder != null) {
                        blurBitmapHolder.recycle();
                        this.nextFrame[i] = null;
                    }
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = this.currentFrame[i];
                    if (blurBitmapHolder2 != null) {
                        blurBitmapHolder2.recycle();
                        this.currentFrame[i] = null;
                    }
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[i];
                    if (iViewWithInvalidateCallback != null) {
                        iViewWithInvalidateCallback.listenInvalidate(null);
                        this.listeners[i] = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.paints[0].setShader(null);
            this.paints[1].setShader(null);
        }
    }

    public void draw(Canvas canvas, ProfileActivity.AvatarImageView avatarImageView, float f, float f2, boolean z, float f3, float f4) {
        ProfileGalleryBlurView profileGalleryBlurView;
        float f5;
        char c;
        Canvas canvas2 = canvas;
        ProfileGalleryView profileGalleryView = this.view;
        if (profileGalleryView != null && profileGalleryView.isAttachedToWindow() && this.view.getVisibility() != 8) {
            if (!this.usingRenderNode || Build.VERSION.SDK_INT < 31) {
                profileGalleryBlurView = this;
            } else if (!canvas2.isHardwareAccelerated()) {
                profileGalleryBlurView = this;
                if (avatarImageView != null || AndroidUtilities.makingGlobalBlurBitmap) {
                    return;
                }
                profileGalleryBlurView.usingRenderNode = false;
                profileGalleryBlurView.setLayerType(1, profileGalleryBlurView.paints[0]);
                profileGalleryBlurView.setLayerType(1, profileGalleryBlurView.paints[1]);
            } else if (avatarImageView == null && getVisibility() == 0 && getAlpha() > 0.0f) {
                drawRenderNode(canvas2, f);
                return;
            } else if (avatarImageView != null) {
                drawOpeningRenderNode(avatarImageView, canvas2, f, f2, f3, f4);
                return;
            }
            ProfileActionsView profileActionsView = profileGalleryBlurView.actionsView;
            if (profileActionsView != null) {
                profileActionsView.drawingBlur(false);
            }
            ProfileSuggestionView profileSuggestionView = profileGalleryBlurView.suggestionView;
            if (profileSuggestionView != null) {
                profileSuggestionView.drawingBlur(false);
            }
            ProfileMusicView profileMusicView = profileGalleryBlurView.musicView;
            if (profileMusicView != null) {
                profileMusicView.drawingBlur(false);
            }
            if (profileGalleryBlurView.needNewFrame || profileGalleryBlurView.sizeChanged || profileGalleryBlurView.loopInvalidate || (profileGalleryBlurView.paints[0].getShader() == null && profileGalleryBlurView.paints[1].getShader() == null && !profileGalleryBlurView.isBluring)) {
                boolean zCaptureNextFrame = profileGalleryBlurView.captureNextFrame();
                if (!profileGalleryBlurView.isBluring && zCaptureNextFrame) {
                    profileGalleryBlurView.isBluring = true;
                    DispatchQueue dispatchQueue = ProfileMetaballView.profileBlurQueue;
                    dispatchQueue.cancelRunnable(profileGalleryBlurView.blurTask);
                    dispatchQueue.postRunnable(profileGalleryBlurView.blurTask);
                }
            }
            if (profileGalleryBlurView.paints[0].getShader() == null && profileGalleryBlurView.paints[1].getShader() == null) {
                return;
            }
            synchronized (profileGalleryBlurView.lock) {
                try {
                    float f6 = f / profileGalleryBlurView.frameWidth;
                    if (z) {
                        canvas2.translate(0.0f, (-f6) * profileGalleryBlurView.frameHeight);
                    }
                    canvas2.scale(f6, f6);
                    float f7 = profileGalleryBlurView.actionSize / f6;
                    if (profileGalleryBlurView.paints[0].getShader() != null) {
                        canvas2.save();
                        canvas2.translate((-profileGalleryBlurView.offset) / f6, 0.0f);
                        canvas2.save();
                        canvas2.scale(1.0f, 2.0f, 0.0f, profileGalleryBlurView.frameHeight);
                        float f8 = profileGalleryBlurView.frameHeight;
                        f5 = 1.0f;
                        c = 1;
                        canvas2.drawRect(0.0f, f8, profileGalleryBlurView.frameWidth, f8 + f7, profileGalleryBlurView.paints[0]);
                        canvas.restore();
                        profileGalleryBlurView.paints[0].setAlpha((int) (f4 * 255.0f));
                        float f9 = profileGalleryBlurView.frameHeight;
                        canvas2 = canvas;
                        canvas2.drawRect(0.0f, f9 * f3, profileGalleryBlurView.frameWidth, f9, profileGalleryBlurView.paints[0]);
                        profileGalleryBlurView.paints[0].setAlpha(255);
                        canvas2.restore();
                    } else {
                        f5 = 1.0f;
                        c = 1;
                    }
                    if (profileGalleryBlurView.offset != 0 && profileGalleryBlurView.paints[c].getShader() != null) {
                        canvas2.save();
                        canvas2.translate(((-profileGalleryBlurView.offset) + f) / f6, 0.0f);
                        canvas2.save();
                        canvas2.scale(f5, 2.0f, 0.0f, profileGalleryBlurView.frameHeight);
                        float f10 = profileGalleryBlurView.frameHeight;
                        canvas2.drawRect(0.0f, f10, profileGalleryBlurView.frameWidth, f10 + f7, profileGalleryBlurView.paints[c]);
                        canvas.restore();
                        profileGalleryBlurView.paints[c].setAlpha((int) (f4 * 255.0f));
                        float f11 = profileGalleryBlurView.frameHeight;
                        canvas.drawRect(0.0f, f11 * f3, profileGalleryBlurView.frameWidth, f11, profileGalleryBlurView.paints[c]);
                        profileGalleryBlurView.paints[c].setAlpha(255);
                        canvas.restore();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void drawOpeningRenderNode(ProfileActivity.AvatarImageView avatarImageView, Canvas canvas, float f, float f2, float f3, float f4) {
        float measuredWidth = f / this.view.getMeasuredWidth();
        float f5 = this.size * (1.0f - f3);
        float f6 = f5 * measuredWidth;
        float renderNodeScale = getRenderNodeScale() * measuredWidth;
        initRenderNode();
        this.blurNode.setPosition(0, 0, (int) (f / renderNodeScale), (int) ((this.actionSize + f5) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
        float f7 = 1.0f / renderNodeScale;
        recordingCanvasBeginRecording.scale(f7, f7);
        AnimatedEmojiDrawable animatedEmojiDrawable = avatarImageView.animatedEmojiDrawable;
        drawOpeningImageRenderNode(animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : avatarImageView.imageReceiver, recordingCanvasBeginRecording, f6, f2);
        if (avatarImageView.drawForeground && avatarImageView.foregroundAlpha > 0.0f) {
            drawOpeningImageRenderNode(avatarImageView.foregroundImageReceiver, recordingCanvasBeginRecording, f6, f2);
        }
        this.blurNode.endRecording();
        this.blurNode.setAlpha(f4);
        canvas.translate(0.0f, -f6);
        canvas.scale(renderNodeScale, renderNodeScale);
        canvas.drawRenderNode(this.blurNode);
        captureActionsBlurRenderNode(f, avatarImageView, measuredWidth, f5);
    }

    public void drawRenderNode(Canvas canvas, float f) {
        initRenderNode();
        SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[0];
        if (iViewWithInvalidateCallback != null) {
            iViewWithInvalidateCallback.listenInvalidate(null);
        }
        SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback2 = this.listeners[1];
        if (iViewWithInvalidateCallback2 != null) {
            iViewWithInvalidateCallback2.listenInvalidate(null);
        }
        float renderNodeScale = getRenderNodeScale();
        this.blurNode.setPosition(0, 0, (int) (f / renderNodeScale), (int) ((this.size + this.actionSize) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
        float f2 = 1.0f / renderNodeScale;
        recordingCanvasBeginRecording.scale(f2, f2);
        recordingCanvasBeginRecording.save();
        recordingCanvasBeginRecording.translate(-this.offset, 0.0f);
        drawViewWithRenderNode(recordingCanvasBeginRecording, 0);
        recordingCanvasBeginRecording.restore();
        if (this.offset != 0) {
            recordingCanvasBeginRecording.save();
            recordingCanvasBeginRecording.translate((-this.offset) + f, 0.0f);
            drawViewWithRenderNode(recordingCanvasBeginRecording, 1);
            recordingCanvasBeginRecording.restore();
        }
        this.blurNode.endRecording();
        this.blurNode.setAlpha(this.alpha.set(1.0f));
        canvas.save();
        canvas.scale(renderNodeScale, renderNodeScale);
        canvas.drawRenderNode(this.blurNode);
        canvas.restore();
        if (getVisibility() != 0 || getAlpha() <= 0.0f) {
            return;
        }
        captureActionsBlurRenderNode(f, null, 1.0f, this.size);
    }

    public boolean isUsingRenderNode() {
        return this.usingRenderNode;
    }

    public void notifyUpdateSize() {
        this.sizeChanged = true;
        postInvalidateOnAnimation();
    }

    @Override
    public void onDraw(Canvas canvas) {
        draw(canvas, null, this.view.getMeasuredWidth(), this.view.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.size + this.actionSize);
    }

    public void restartAlpha() {
        if (this.usingRenderNode) {
            this.alpha.set(0.0f, true);
            invalidate();
        }
    }

    public void setActionsView(ProfileActionsView profileActionsView) {
        this.actionsView = profileActionsView;
    }

    @Override
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (f == 0.0f || !this.usingRenderNode) {
            return;
        }
        invalidate();
    }

    public void setMusicView(ProfileMusicView profileMusicView) {
        this.musicView = profileMusicView;
    }

    public void setSize(int i) {
        if (this.actionSize != i) {
            invalidate();
        }
        this.actionSize = i;
        this.size = (int) (AndroidUtilities.dp(64.0f) * 1.5f);
    }

    public void setSuggestionView(ProfileSuggestionView profileSuggestionView) {
        this.suggestionView = profileSuggestionView;
    }

    public void setView(ProfileGalleryView profileGalleryView) {
        destroy();
        this.view = profileGalleryView;
        this.currentPosition = profileGalleryView.getCurrentItem();
        this.offset = 0;
        profileGalleryView.addOnPageChangeListener(this.listener);
    }
}
