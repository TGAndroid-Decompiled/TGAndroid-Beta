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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;

public final class ProfileGalleryBlurView extends View {
    public int actionSize;
    public RenderNode actionsBlurNode;
    public ProfileActionsView actionsView;
    public final AnimatedFloat alpha;
    public RenderNode blurNode;
    public final ProfileGalleryBlurView$$ExternalSyntheticLambda8 blurTask;
    public final ProfileMetaballView.BlurBitmapHolder[] currentFrame;
    public int currentPosition;
    public int frameHeight;
    public int frameWidth;
    public final ProfileGalleryBlurView$$ExternalSyntheticLambda8 invalidateTask;
    public volatile boolean isBluring;
    public final IntroActivity.AnonymousClass3 listener;
    public final SizeNotifierFrameLayout.IViewWithInvalidateCallback[] listeners;
    public final Object lock;
    public boolean loopInvalidate;
    public ProfileMusicView musicView;
    public boolean needNewFrame;
    public final ProfileMetaballView.BlurBitmapHolder[] nextFrame;
    public int offset;
    public final Paint[] paints;
    public boolean shouldBlurActions;
    public int size;
    public boolean sizeChanged;
    public boolean usingRenderNode;
    public ProfileGalleryView view;

    public ProfileGalleryBlurView(Context context) {
        super(context);
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        this.usingRenderNode = Build.VERSION.SDK_INT >= 31;
        this.lock = new Object();
        this.nextFrame = new ProfileMetaballView.BlurBitmapHolder[3];
        this.currentFrame = new ProfileMetaballView.BlurBitmapHolder[3];
        this.isBluring = false;
        Paint[] paintArr = {new Paint(), new Paint()};
        this.paints = paintArr;
        this.blurTask = new ProfileGalleryBlurView$$ExternalSyntheticLambda8(this, i3);
        this.invalidateTask = new ProfileGalleryBlurView$$ExternalSyntheticLambda8(this, i2);
        this.currentPosition = -1;
        this.loopInvalidate = false;
        this.sizeChanged = false;
        this.needNewFrame = false;
        this.listeners = new SizeNotifierFrameLayout.IViewWithInvalidateCallback[3];
        AnimatedFloat animatedFloat = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.DEFAULT);
        this.alpha = animatedFloat;
        this.listener = new IntroActivity.AnonymousClass3(this, i);
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

    public static void access$200(ProfileGalleryBlurView profileGalleryBlurView, int i, int i2, int i3) {
        synchronized (profileGalleryBlurView.lock) {
            try {
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr = profileGalleryBlurView.nextFrame;
                ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr[i];
                blurBitmapHolderArr[i] = blurBitmapHolderArr[i2];
                blurBitmapHolderArr[i2] = blurBitmapHolder;
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr2 = profileGalleryBlurView.currentFrame;
                ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = blurBitmapHolderArr2[i];
                blurBitmapHolderArr2[i] = blurBitmapHolderArr2[i2];
                blurBitmapHolderArr2[i2] = blurBitmapHolder2;
                if (i != 2) {
                    Paint[] paintArr = profileGalleryBlurView.paints;
                    Paint paint = paintArr[i];
                    paintArr[i] = paintArr[i2];
                    paintArr[i2] = paint;
                } else if (blurBitmapHolder2.hasContent) {
                    profileGalleryBlurView.applyShader(blurBitmapHolder2.bitmap, i2);
                }
                if (i3 != -1) {
                    profileGalleryBlurView.paints[i3].setShader(null);
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder3 = profileGalleryBlurView.nextFrame[i3];
                    if (blurBitmapHolder3 != null && !blurBitmapHolder3.isBusy && !blurBitmapHolder3.destroyed) {
                        blurBitmapHolder3.hasContent = false;
                        blurBitmapHolder3.bitmap.eraseColor(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void drawOpeningImageRenderNode(ImageReceiver imageReceiver, Canvas canvas, float f, float f2) {
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

    public final void applyShader(Bitmap bitmap, int i) {
        if (i >= 2 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.size / 6.0f, new int[]{0, -1}, new float[]{0.0f, AndroidUtilities.dpf2(56.0f) / this.size}, Shader.TileMode.CLAMP);
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        this.paints[i].setShader(new ComposeShader(new BitmapShader(bitmap, tileMode, tileMode), linearGradient, PorterDuff.Mode.DST_IN));
    }

    public final void captureActionsBlurRenderNode(float f, ProfileActivity.AvatarImageView avatarImageView, float f2, float f3) {
        if (this.actionsView == null && this.musicView == null) {
            this.shouldBlurActions = false;
        } else {
            if (this.actionsBlurNode == null) {
                this.actionsBlurNode = TranslateAlert2$$ExternalSyntheticApiModelOutline0.m();
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.65f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.5f);
                this.actionsBlurNode.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
            }
            this.shouldBlurActions = true;
        }
        if (!this.shouldBlurActions) {
            ProfileActionsView profileActionsView = this.actionsView;
            if (profileActionsView != null && profileActionsView.renderNode != null) {
                profileActionsView.renderNode = null;
                profileActionsView.avatarView = null;
                profileActionsView.invalidate();
            }
            ProfileMusicView profileMusicView = this.musicView;
            if (profileMusicView == null || profileMusicView.renderNode == null) {
                return;
            }
            profileMusicView.renderNode = null;
            profileMusicView.invalidate();
            return;
        }
        float renderNodeScale = getRenderNodeScale() * f2 * 8.0f;
        this.actionsBlurNode.setPosition(0, 0, (int) Math.ceil(f / renderNodeScale), (int) ((this.actionSize + f3) / renderNodeScale));
        RecordingCanvas recordingCanvasBeginRecording = this.actionsBlurNode.beginRecording();
        recordingCanvasBeginRecording.scale(0.125f, 0.125f);
        recordingCanvasBeginRecording.drawRenderNode(this.blurNode);
        this.actionsBlurNode.endRecording();
        this.actionsBlurNode.setAlpha(this.alpha.set(1.0f, false));
        ProfileActionsView profileActionsView2 = this.actionsView;
        if (profileActionsView2 != null) {
            if (avatarImageView != null) {
                profileActionsView2.renderNode = this.actionsBlurNode;
                profileActionsView2.avatarView = avatarImageView;
                profileActionsView2.renderNodeScale = renderNodeScale / f2;
                profileActionsView2.renderNodeTranslateY = -f3;
                profileActionsView2.invalidate();
            } else {
                profileActionsView2.renderNode = this.actionsBlurNode;
                profileActionsView2.avatarView = null;
                profileActionsView2.renderNodeScale = renderNodeScale;
                profileActionsView2.renderNodeTranslateY = -f3;
                profileActionsView2.invalidate();
            }
        }
        ProfileMusicView profileMusicView2 = this.musicView;
        if (profileMusicView2 != null) {
            if (avatarImageView == null) {
                RenderNode renderNode = this.actionsBlurNode;
                float fDp = (-f3) + AndroidUtilities.dp(22.0f);
                profileMusicView2.renderNode = renderNode;
                profileMusicView2.renderNodeScale = renderNodeScale;
                profileMusicView2.renderNodeTranslateY = fDp;
                profileMusicView2.invalidate();
                return;
            }
            RenderNode renderNode2 = this.actionsBlurNode;
            float f4 = renderNodeScale / f2;
            float fDp2 = (-f3) + AndroidUtilities.dp(22.0f);
            profileMusicView2.renderNode = renderNode2;
            profileMusicView2.renderNodeScale = f4;
            profileMusicView2.renderNodeTranslateY = fDp2;
            profileMusicView2.invalidate();
        }
    }

    public final boolean captureNextFrame() {
        PinchToZoomHelper pinchToZoomHelper;
        SizeNotifierFrameLayout.IViewWithInvalidateCallback[] iViewWithInvalidateCallbackArr;
        ProfileGalleryView profileGalleryView = this.view;
        boolean z = false;
        if (profileGalleryView != null && ((pinchToZoomHelper = profileGalleryView.pinchToZoomHelper) == null || !pinchToZoomHelper.inOverlayMode)) {
            int measuredWidth = (int) (profileGalleryView.getMeasuredWidth() / 6.0f);
            int i = (int) (this.size / 6.0f);
            if (measuredWidth > 0 && i > 0) {
                this.frameWidth = measuredWidth;
                this.frameHeight = i;
                boolean z2 = this.sizeChanged;
                ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr = this.nextFrame;
                int length = (!z2 || this.needNewFrame) ? blurBitmapHolderArr.length : 1;
                this.sizeChanged = false;
                this.needNewFrame = false;
                int i2 = 0;
                while (true) {
                    iViewWithInvalidateCallbackArr = this.listeners;
                    if (i2 >= length) {
                        break;
                    }
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = iViewWithInvalidateCallbackArr[i2];
                    if (iViewWithInvalidateCallback != null) {
                        iViewWithInvalidateCallback.listenInvalidate(null);
                    }
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr[i2];
                    if (blurBitmapHolder == null || blurBitmapHolder.destroyed) {
                        if (blurBitmapHolder != null) {
                            blurBitmapHolder.destroying = true;
                            if (!blurBitmapHolder.isBusy) {
                                blurBitmapHolder.destroyed = true;
                                blurBitmapHolder.bitmap.recycle();
                            }
                        }
                        blurBitmapHolderArr[i2] = new ProfileMetaballView.BlurBitmapHolder(measuredWidth, i);
                    } else {
                        Bitmap bitmap = blurBitmapHolder.bitmap;
                        if (bitmap.getWidth() != measuredWidth || bitmap.getHeight() != i) {
                            if (blurBitmapHolder != null) {
                                blurBitmapHolder.destroying = true;
                                if (!blurBitmapHolder.isBusy) {
                                    blurBitmapHolder.destroyed = true;
                                    blurBitmapHolder.bitmap.recycle();
                                }
                            }
                            blurBitmapHolderArr[i2] = new ProfileMetaballView.BlurBitmapHolder(measuredWidth, i);
                        }
                    }
                    if (blurBitmapHolderArr[i2].isBusy) {
                        if (length == 1) {
                            this.sizeChanged = true;
                        } else {
                            this.needNewFrame = true;
                        }
                    }
                    i2++;
                }
                View itemViewAt = this.view.getItemViewAt(this.currentPosition);
                drawView(0, itemViewAt);
                ProfileGalleryBlurView$$ExternalSyntheticLambda8 profileGalleryBlurView$$ExternalSyntheticLambda8 = this.invalidateTask;
                if (length == 1) {
                    SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback2 = iViewWithInvalidateCallbackArr[0];
                    if (iViewWithInvalidateCallback2 != null) {
                        iViewWithInvalidateCallback2.listenInvalidate(profileGalleryBlurView$$ExternalSyntheticLambda8);
                    }
                    return !this.sizeChanged;
                }
                View itemViewAt2 = this.view.getItemViewAt(this.currentPosition + 1);
                drawView(1, itemViewAt2);
                if (this.offset == 0) {
                    drawView(2, this.view.getItemViewAt(this.currentPosition - 1));
                }
                for (SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback3 : iViewWithInvalidateCallbackArr) {
                    if (iViewWithInvalidateCallback3 != null) {
                        iViewWithInvalidateCallback3.listenInvalidate(profileGalleryBlurView$$ExternalSyntheticLambda8);
                    }
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

    public final void destroy() {
        ProfileGalleryView profileGalleryView = this.view;
        if (profileGalleryView != null) {
            IntroActivity.AnonymousClass3 anonymousClass3 = this.listener;
            ArrayList arrayList = profileGalleryView.mOnPageChangeListeners;
            if (arrayList != null) {
                arrayList.remove(anonymousClass3);
            }
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
        this.musicView = null;
        synchronized (this.lock) {
            for (int i = 0; i < 3; i++) {
                try {
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i];
                    if (blurBitmapHolder != null) {
                        blurBitmapHolder.destroying = true;
                        if (!blurBitmapHolder.isBusy) {
                            blurBitmapHolder.destroyed = true;
                            blurBitmapHolder.bitmap.recycle();
                        }
                        this.nextFrame[i] = null;
                    }
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = this.currentFrame[i];
                    if (blurBitmapHolder2 != null) {
                        blurBitmapHolder2.destroying = true;
                        if (!blurBitmapHolder2.isBusy) {
                            blurBitmapHolder2.destroyed = true;
                            blurBitmapHolder2.bitmap.recycle();
                        }
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

    public final void draw(Canvas canvas, ProfileActivity.AvatarImageView avatarImageView, float f, float f2, boolean z, float f3, float f4) {
        int i;
        float f5;
        char c;
        Canvas canvas2 = canvas;
        ProfileGalleryView profileGalleryView = this.view;
        if (profileGalleryView == null || !profileGalleryView.isAttachedToWindow() || this.view.getVisibility() == 8) {
            return;
        }
        if (this.usingRenderNode && Build.VERSION.SDK_INT >= 31) {
            if (canvas2.isHardwareAccelerated()) {
                if (avatarImageView != null || getVisibility() != 0 || getAlpha() <= 0.0f) {
                    if (avatarImageView != null) {
                        float measuredWidth = f / this.view.getMeasuredWidth();
                        float f6 = this.size * (1.0f - f3);
                        float f7 = f6 * measuredWidth;
                        float renderNodeScale = getRenderNodeScale() * measuredWidth;
                        initRenderNode();
                        this.blurNode.setPosition(0, 0, (int) (f / renderNodeScale), (int) ((this.actionSize + f6) / renderNodeScale));
                        RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
                        float f8 = 1.0f / renderNodeScale;
                        recordingCanvasBeginRecording.scale(f8, f8);
                        AnimatedEmojiDrawable animatedEmojiDrawable = avatarImageView.animatedEmojiDrawable;
                        drawOpeningImageRenderNode(animatedEmojiDrawable != null ? animatedEmojiDrawable.imageReceiver : avatarImageView.imageReceiver, recordingCanvasBeginRecording, f7, f2);
                        if (avatarImageView.drawForeground && avatarImageView.foregroundAlpha > 0.0f) {
                            drawOpeningImageRenderNode(avatarImageView.foregroundImageReceiver, recordingCanvasBeginRecording, f7, f2);
                        }
                        this.blurNode.endRecording();
                        this.blurNode.setAlpha(f4);
                        canvas2.translate(0.0f, -f7);
                        canvas2.scale(renderNodeScale, renderNodeScale);
                        canvas2.drawRenderNode(this.blurNode);
                        captureActionsBlurRenderNode(f, avatarImageView, measuredWidth, f6);
                        return;
                    }
                    return;
                }
                initRenderNode();
                SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = this.listeners[0];
                if (iViewWithInvalidateCallback != null) {
                    iViewWithInvalidateCallback.listenInvalidate(null);
                }
                SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback2 = this.listeners[1];
                if (iViewWithInvalidateCallback2 != null) {
                    iViewWithInvalidateCallback2.listenInvalidate(null);
                }
                float renderNodeScale2 = getRenderNodeScale();
                this.blurNode.setPosition(0, 0, (int) (f / renderNodeScale2), (int) ((this.size + this.actionSize) / renderNodeScale2));
                RecordingCanvas recordingCanvasBeginRecording2 = this.blurNode.beginRecording();
                float f9 = 1.0f / renderNodeScale2;
                recordingCanvasBeginRecording2.scale(f9, f9);
                recordingCanvasBeginRecording2.save();
                recordingCanvasBeginRecording2.translate(-this.offset, 0.0f);
                drawViewWithRenderNode(recordingCanvasBeginRecording2, 0);
                recordingCanvasBeginRecording2.restore();
                if (this.offset != 0) {
                    recordingCanvasBeginRecording2.save();
                    recordingCanvasBeginRecording2.translate((-this.offset) + f, 0.0f);
                    drawViewWithRenderNode(recordingCanvasBeginRecording2, 1);
                    recordingCanvasBeginRecording2.restore();
                }
                this.blurNode.endRecording();
                this.blurNode.setAlpha(this.alpha.set(1.0f, false));
                canvas2.save();
                canvas2.scale(renderNodeScale2, renderNodeScale2);
                canvas2.drawRenderNode(this.blurNode);
                canvas2.restore();
                if (getVisibility() != 0 || getAlpha() <= 0.0f) {
                    return;
                }
                captureActionsBlurRenderNode(f, null, 1.0f, this.size);
                return;
            }
            if (avatarImageView != null || AndroidUtilities.makingGlobalBlurBitmap) {
                return;
            }
            this.usingRenderNode = false;
            setLayerType(1, this.paints[0]);
            setLayerType(1, this.paints[1]);
        }
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView != null && profileActionsView.renderNode != null) {
            profileActionsView.renderNode = null;
            profileActionsView.avatarView = null;
            profileActionsView.invalidate();
        }
        ProfileMusicView profileMusicView = this.musicView;
        if (profileMusicView != null && profileMusicView.renderNode != null) {
            profileMusicView.renderNode = null;
            profileMusicView.invalidate();
        }
        if (this.needNewFrame || this.sizeChanged || this.loopInvalidate || (this.paints[0].getShader() == null && this.paints[1].getShader() == null && !this.isBluring)) {
            boolean zCaptureNextFrame = captureNextFrame();
            if (!this.isBluring && zCaptureNextFrame) {
                this.isBluring = true;
                DispatchQueue dispatchQueue = ProfileMetaballView.profileBlurQueue;
                dispatchQueue.cancelRunnable(this.blurTask);
                dispatchQueue.postRunnable(this.blurTask);
            }
        }
        if (this.paints[0].getShader() == null && this.paints[1].getShader() == null) {
            return;
        }
        synchronized (this.lock) {
            try {
                float f10 = f / this.frameWidth;
                if (z) {
                    canvas2.translate(0.0f, (-f10) * this.frameHeight);
                }
                canvas2.scale(f10, f10);
                float f11 = this.actionSize / f10;
                if (this.paints[0].getShader() != null) {
                    canvas2.save();
                    canvas2.translate((-this.offset) / f10, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, 2.0f, 0.0f, this.frameHeight);
                    float f12 = this.frameHeight;
                    i = 255;
                    f5 = 2.0f;
                    c = 1;
                    canvas2.drawRect(0.0f, f12, this.frameWidth, f12 + f11, this.paints[0]);
                    canvas.restore();
                    this.paints[0].setAlpha((int) (f4 * 255.0f));
                    float f13 = this.frameHeight;
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, f13 * f3, this.frameWidth, f13, this.paints[0]);
                    this.paints[0].setAlpha(255);
                    canvas2.restore();
                } else {
                    i = 255;
                    f5 = 2.0f;
                    c = 1;
                }
                if (this.offset != 0 && this.paints[c].getShader() != null) {
                    canvas2.save();
                    canvas2.translate(((-this.offset) + f) / f10, 0.0f);
                    canvas2.save();
                    canvas2.scale(1.0f, f5, 0.0f, this.frameHeight);
                    float f14 = this.frameHeight;
                    canvas2.drawRect(0.0f, f14, this.frameWidth, f14 + f11, this.paints[c]);
                    canvas.restore();
                    this.paints[c].setAlpha((int) (f4 * 255.0f));
                    float f15 = this.frameHeight;
                    canvas.drawRect(0.0f, f15 * f3, this.frameWidth, f15, this.paints[c]);
                    this.paints[c].setAlpha(i);
                    canvas.restore();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void drawView(int i, View view) {
        ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = this.nextFrame[i];
        if (view != 0 && !blurBitmapHolder.isBusy) {
            Canvas canvas = blurBitmapHolder.canvas;
            canvas.save();
            canvas.scale(0.16666667f, 0.16666667f);
            canvas.translate(0.0f, this.size - view.getMeasuredHeight());
            view.draw(canvas);
            canvas.restore();
            blurBitmapHolder.hasContent = true;
        }
        if (i == 0 || (this.offset != 0 && i == 1)) {
            boolean z = view instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback;
            SizeNotifierFrameLayout.IViewWithInvalidateCallback[] iViewWithInvalidateCallbackArr = this.listeners;
            if (z) {
                iViewWithInvalidateCallbackArr[i] = (SizeNotifierFrameLayout.IViewWithInvalidateCallback) view;
            } else {
                iViewWithInvalidateCallbackArr[i] = null;
            }
        }
    }

    public final void drawViewWithRenderNode(Canvas canvas, int i) {
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
        boolean z = itemViewAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback;
        SizeNotifierFrameLayout.IViewWithInvalidateCallback[] iViewWithInvalidateCallbackArr = this.listeners;
        if (!z) {
            iViewWithInvalidateCallbackArr[i] = null;
            return;
        }
        SizeNotifierFrameLayout.IViewWithInvalidateCallback iViewWithInvalidateCallback = (SizeNotifierFrameLayout.IViewWithInvalidateCallback) itemViewAt;
        iViewWithInvalidateCallbackArr[i] = iViewWithInvalidateCallback;
        iViewWithInvalidateCallback.listenInvalidate(this.invalidateTask);
    }

    public final void initRenderNode() {
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

    @Override
    public final void onDraw(Canvas canvas) {
        draw(canvas, null, this.view.getMeasuredWidth(), this.view.getMeasuredHeight(), false, 0.0f, 1.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), this.size + this.actionSize);
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
    }

    public void setView(ProfileGalleryView profileGalleryView) {
        destroy();
        this.view = profileGalleryView;
        this.currentPosition = profileGalleryView.getCurrentItem();
        this.offset = 0;
        profileGalleryView.addOnPageChangeListener(this.listener);
    }
}
