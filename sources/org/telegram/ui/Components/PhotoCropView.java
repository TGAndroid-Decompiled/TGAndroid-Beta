package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import com.stripe.android.Stripe;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.Crop.CropView.CropState;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.CropEditor;
import org.telegram.ui.Stories.recorder.CropInlineEditor;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class PhotoCropView extends FrameLayout {
    public final AnonymousClass1 ANIMATION_VALUE;
    public final AnonymousClass1 PROGRESS_VALUE;
    public final Paint circlePaint;
    public final CropView cropView;
    public PhotoCropViewDelegate delegate;
    public float flashAlpha;
    public final boolean inBubbleMode;
    public final Theme.ResourcesProvider resourcesProvider;
    public AnimatorSet thumbAnimation;
    public float thumbAnimationProgress;
    public final ImageReceiver thumbImageView;
    public boolean thumbImageVisible;
    public boolean thumbImageVisibleOverride;
    public float thumbImageVisibleProgress;
    public AnimatorSet thumbOverrideAnimation;
    public final CropRotationWheel wheelView;

    public final class AnonymousClass4 implements CropRotationWheel.RotationWheelListener {
        public final int $r8$classId;
        public final FrameLayout this$0;

        public AnonymousClass4(FrameLayout frameLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public final void aspectRatioPressed() {
            switch (this.$r8$classId) {
                case 0:
                    ((PhotoCropView) this.this$0).cropView.showAspectRatioDialog();
                    break;
                case 1:
                    ((StoryRecorder.AnonymousClass36) this.this$0).cropView.showAspectRatioDialog();
                    break;
                default:
                    ((StoryRecorder.AnonymousClass37) this.this$0).cropView.showAspectRatioDialog();
                    break;
            }
        }

        @Override
        public final boolean mirror() {
            FrameLayout frameLayout = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    PhotoCropViewDelegate photoCropViewDelegate = ((PhotoCropView) frameLayout).delegate;
                    if (photoCropViewDelegate == null) {
                        return false;
                    }
                    Drawable[] drawableArr = PhotoViewer.progressDrawables;
                    return PhotoViewer.this.cropMirror();
                case 1:
                    StoryRecorder.AnonymousClass36 anonymousClass36 = (StoryRecorder.AnonymousClass36) frameLayout;
                    anonymousClass36.contentView.invalidate();
                    return anonymousClass36.cropView.mirror();
                default:
                    StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) frameLayout;
                    anonymousClass37.contentView.invalidate();
                    return anonymousClass37.cropView.mirror();
            }
        }

        @Override
        public final void onChange(float f) {
            FrameLayout frameLayout = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    PhotoCropView photoCropView = (PhotoCropView) frameLayout;
                    photoCropView.cropView.setRotation(f);
                    photoCropView.getClass();
                    PhotoCropViewDelegate photoCropViewDelegate = photoCropView.delegate;
                    if (photoCropViewDelegate != null) {
                        Drawable[] drawableArr = PhotoViewer.progressDrawables;
                        PhotoViewer.this.updateResetButtonVisibility(true);
                    }
                    break;
                case 1:
                    ((StoryRecorder.AnonymousClass36) frameLayout).cropView.setRotation(f);
                    break;
                default:
                    ((StoryRecorder.AnonymousClass37) frameLayout).cropView.setRotation(f);
                    break;
            }
        }

        @Override
        public final void onEnd() {
            switch (this.$r8$classId) {
                case 0:
                    ((PhotoCropView) this.this$0).cropView.areaView.setGridType(1, true);
                    break;
                case 1:
                    ((StoryRecorder.AnonymousClass36) this.this$0).cropView.areaView.setGridType(1, true);
                    break;
                default:
                    ((StoryRecorder.AnonymousClass37) this.this$0).cropView.areaView.setGridType(1, true);
                    break;
            }
        }

        @Override
        public final void onStart() {
            switch (this.$r8$classId) {
                case 0:
                    CropView cropView = ((PhotoCropView) this.this$0).cropView;
                    cropView.areaView.setGridType(2, false);
                    if (cropView.rotationStartScale < 1.0E-5f) {
                        cropView.rotationStartScale = cropView.state.scale;
                    }
                    break;
                case 1:
                    CropEditor.AnonymousClass1 anonymousClass1 = ((StoryRecorder.AnonymousClass36) this.this$0).cropView;
                    anonymousClass1.areaView.setGridType(2, false);
                    if (anonymousClass1.rotationStartScale < 1.0E-5f) {
                        anonymousClass1.rotationStartScale = anonymousClass1.state.scale;
                    }
                    break;
                default:
                    CropInlineEditor.AnonymousClass1 anonymousClass2 = ((StoryRecorder.AnonymousClass37) this.this$0).cropView;
                    anonymousClass2.areaView.setGridType(2, false);
                    if (anonymousClass2.rotationStartScale < 1.0E-5f) {
                        anonymousClass2.rotationStartScale = anonymousClass2.state.scale;
                    }
                    break;
            }
        }

        @Override
        public final boolean rotate90Pressed() {
            FrameLayout frameLayout = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    PhotoCropViewDelegate photoCropViewDelegate = ((PhotoCropView) frameLayout).delegate;
                    if (photoCropViewDelegate == null) {
                        return false;
                    }
                    Drawable[] drawableArr = PhotoViewer.progressDrawables;
                    return PhotoViewer.this.cropRotate(-90.0f, false, null);
                case 1:
                    StoryRecorder.AnonymousClass36 anonymousClass36 = (StoryRecorder.AnonymousClass36) frameLayout;
                    boolean zRotate = anonymousClass36.cropView.rotate(-90.0f);
                    anonymousClass36.cropView.maximize();
                    anonymousClass36.contentView.invalidate();
                    return zRotate;
                default:
                    StoryRecorder.AnonymousClass37 anonymousClass37 = (StoryRecorder.AnonymousClass37) frameLayout;
                    boolean zRotate2 = anonymousClass37.cropView.rotate(-90.0f);
                    anonymousClass37.cropView.maximize();
                    anonymousClass37.contentView.invalidate();
                    return zRotate2;
            }
        }
    }

    public final class AnonymousClass5 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PhotoCropView this$0;

        public AnonymousClass5(PhotoCropView photoCropView, int i) {
            this.$r8$classId = i;
            this.this$0 = photoCropView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.thumbAnimation = null;
                    break;
                default:
                    this.this$0.thumbOverrideAnimation = null;
                    break;
            }
        }
    }

    public interface PhotoCropViewDelegate {
    }

    public PhotoCropView(ContextThemeWrapper contextThemeWrapper, Theme.ResourcesProvider resourcesProvider) {
        super(contextThemeWrapper);
        this.thumbImageVisibleOverride = true;
        this.thumbAnimationProgress = 1.0f;
        this.flashAlpha = 0.0f;
        this.circlePaint = new Paint(1);
        this.ANIMATION_VALUE = new AnimationProperties.IntProperty(this, 0) {
            public final int $r8$classId;
            public final PhotoCropView this$0;

            {
                super("thumbAnimationProgress", 1);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        super("thumbImageVisibleProgress", 1);
                        break;
                    default:
                        this.this$0 = this;
                        break;
                }
            }

            @Override
            public final Object get(Object obj) {
                switch (this.$r8$classId) {
                    case 0:
                        return Float.valueOf(this.this$0.thumbAnimationProgress);
                    default:
                        return Float.valueOf(this.this$0.thumbImageVisibleProgress);
                }
            }

            @Override
            public final void setValue(Object obj, float f) {
                switch (this.$r8$classId) {
                    case 0:
                        this.this$0.thumbAnimationProgress = f;
                        ((PhotoCropView) obj).invalidate();
                        break;
                    default:
                        this.this$0.thumbImageVisibleProgress = f;
                        ((PhotoCropView) obj).invalidate();
                        break;
                }
            }
        };
        this.PROGRESS_VALUE = new AnimationProperties.IntProperty(this, 1) {
            public final int $r8$classId;
            public final PhotoCropView this$0;

            {
                super("thumbAnimationProgress", 1);
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        super("thumbImageVisibleProgress", 1);
                        break;
                    default:
                        this.this$0 = this;
                        break;
                }
            }

            @Override
            public final Object get(Object obj) {
                switch (this.$r8$classId) {
                    case 0:
                        return Float.valueOf(this.this$0.thumbAnimationProgress);
                    default:
                        return Float.valueOf(this.this$0.thumbImageVisibleProgress);
                }
            }

            @Override
            public final void setValue(Object obj, float f) {
                switch (this.$r8$classId) {
                    case 0:
                        this.this$0.thumbAnimationProgress = f;
                        ((PhotoCropView) obj).invalidate();
                        break;
                    default:
                        this.this$0.thumbImageVisibleProgress = f;
                        ((PhotoCropView) obj).invalidate();
                        break;
                }
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.inBubbleMode = contextThemeWrapper instanceof BubbleActivity;
        CropView cropView = new CropView(contextThemeWrapper);
        this.cropView = cropView;
        cropView.setListener(new Stripe.AnonymousClass1(this, 28));
        cropView.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(cropView);
        this.thumbImageView = new ImageReceiver(this);
        CropRotationWheel cropRotationWheel = new CropRotationWheel(contextThemeWrapper);
        this.wheelView = cropRotationWheel;
        cropRotationWheel.setListener(new AnonymousClass4(this, 0));
        addView(cropRotationWheel, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        CropView cropView;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.thumbImageVisible && view == (cropView = this.cropView)) {
            RectF actualRect = cropView.getActualRect();
            int iDp = AndroidUtilities.dp(32.0f);
            PhotoViewer.AnonymousClass59 anonymousClass59 = (PhotoViewer.AnonymousClass59) this.delegate;
            anonymousClass59.getClass();
            float fDp = AndroidUtilities.dp(16.0f);
            PhotoViewer photoViewer = PhotoViewer.this;
            int measuredWidth = (int) (((photoViewer.videoTimelineView.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * photoViewer.avatarStartProgress) + fDp);
            int i = iDp / 2;
            int iDp2 = AndroidUtilities.dp(2.0f) + (measuredWidth - i);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f = actualRect.left;
            float f2 = this.thumbAnimationProgress;
            float f3 = ((iDp2 - f) * f2) + f;
            float f4 = actualRect.top;
            float fM = DiffUtil.m(measuredHeight, f4, f2, f4);
            float fWidth = ((iDp - actualRect.width()) * this.thumbAnimationProgress) + actualRect.width();
            ImageReceiver imageReceiver = this.thumbImageView;
            imageReceiver.setRoundRadius((int) (fWidth / 2.0f));
            imageReceiver.setImageCoords(f3, fM, fWidth, fWidth);
            imageReceiver.setAlpha(this.thumbImageVisibleProgress);
            imageReceiver.draw(canvas);
            float f5 = this.flashAlpha;
            Paint paint = this.circlePaint;
            if (f5 > 0.0f) {
                paint.setColor(-1);
                paint.setAlpha((int) (this.flashAlpha * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, paint);
            }
            paint.setColor(Theme.getColor(Theme.key_chat_editMediaButton, this.resourcesProvider));
            paint.setAlpha(Math.min(255, (int) (this.thumbAnimationProgress * 255.0f * this.thumbImageVisibleProgress)));
            canvas.drawCircle(iDp2 + i, AndroidUtilities.dp(8.0f) + measuredHeight + iDp, AndroidUtilities.dp(3.0f), paint);
        }
        return zDrawChild;
    }

    public float getRectSizeX() {
        return this.cropView.getCropWidth();
    }

    public float getRectSizeY() {
        return this.cropView.getCropHeight();
    }

    public float getRectX() {
        return this.cropView.getCropLeft() - AndroidUtilities.dp(14.0f);
    }

    public float getRectY() {
        return (this.cropView.getCropTop() - AndroidUtilities.dp(14.0f)) - (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0);
    }

    public Bitmap getVideoThumb() {
        if (this.thumbImageVisible && this.thumbImageVisibleOverride) {
            return this.thumbImageView.getBitmap();
        }
        return null;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.cropView.invalidate();
    }

    public final void onDisappear() {
        CropView cropView = this.cropView;
        cropView.imageView.setVisibility(4);
        CropAreaView cropAreaView = cropView.areaView;
        cropAreaView.setDimVisibility(false);
        cropAreaView.frameVisible = false;
        cropAreaView.frameAlpha = 1.0f;
        cropAreaView.invalidate();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.thumbImageVisibleOverride || !this.thumbImageVisible || !this.thumbImageView.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            ((PhotoViewer.AnonymousClass59) this.delegate).onVideoThumbClick();
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CropView.CropState cropState;
        super.onLayout(z, i, i2, i3, i4);
        CropView cropView = this.cropView;
        float cropWidth = cropView.areaView.getCropWidth();
        if (cropWidth == 0.0f || (cropState = cropView.state) == null) {
            return;
        }
        RectF rectF = cropView.initialAreaRect;
        float f = cropState.width / cropState.height;
        CropAreaView cropAreaView = cropView.areaView;
        cropAreaView.calculateRect(rectF, f);
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        cropView.previousAreaRect.set(cropAreaView.actualRect);
        CropView.CropState.access$700(cropView.state, cropAreaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        cropView.updateMatrix(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.thumbImageVisibleOverride || !this.thumbImageVisible || !this.thumbImageView.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            ((PhotoViewer.AnonymousClass59) this.delegate).onVideoThumbClick();
        }
        return true;
    }

    public void setAspectRatio(float f) {
        this.cropView.setAspectRatio(f);
    }

    public final void setBitmap(Bitmap bitmap, int i, boolean z, boolean z2, CropTransform cropTransform, VideoEditTextureView videoEditTextureView, final MediaController.CropState cropState) {
        requestLayout();
        this.thumbImageVisible = false;
        this.thumbImageView.setImageBitmap((Drawable) null);
        final CropView cropView = this.cropView;
        cropView.freeform = z;
        cropView.videoEditTextureView = videoEditTextureView;
        cropView.cropTransform = cropTransform;
        cropView.bitmapRotation = i;
        cropView.bitmap = bitmap;
        boolean z3 = videoEditTextureView != null;
        CropAreaView cropAreaView = cropView.areaView;
        cropAreaView.setIsVideo(z3);
        ImageView imageView = cropView.imageView;
        if (bitmap == null && videoEditTextureView == null) {
            cropView.state = null;
            imageView.setImageDrawable(null);
        } else {
            final int currentWidth = cropView.getCurrentWidth();
            final int currentHeight = cropView.getCurrentHeight();
            CropView.CropState cropState2 = cropView.state;
            if (cropState2 == null || !z2) {
                cropView.state = cropView.new CropState(currentWidth, currentHeight);
                cropAreaView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    public final int val$h;
                    public final MediaController.CropState val$restoreState;
                    public final int val$w;

                    public AnonymousClass2() {
                        cropState = cropState;
                        i = currentHeight;
                        i = currentWidth;
                    }

                    @Override
                    public final boolean onPreDraw() {
                        float f;
                        float f2;
                        CropView cropView2 = CropView.this;
                        cropView2.reset(false);
                        CropAreaView cropAreaView2 = cropView2.areaView;
                        MediaController.CropState cropState3 = cropState;
                        if (cropState3 != null) {
                            float f3 = cropState3.lockedAspectRatio;
                            if (f3 > 1.0E-4f) {
                                cropAreaView2.setLockedAspectRatio(f3);
                                CropViewListener cropViewListener = cropView2.listener;
                                if (cropViewListener != null) {
                                    cropViewListener.onAspectLock(true);
                                }
                            }
                            cropView2.setFreeform(cropState3.freeform);
                            float aspectRatio = cropAreaView2.getAspectRatio();
                            int i2 = cropState3.transformRotation;
                            int i3 = i;
                            int i4 = i;
                            if (i2 == 90 || i2 == 270) {
                                aspectRatio = 1.0f / aspectRatio;
                                CropState cropState4 = cropView2.state;
                                f = cropState4.height;
                                f2 = cropState4.width;
                            } else {
                                CropState cropState5 = cropView2.state;
                                f = cropState5.width;
                                f2 = cropState5.height;
                                i4 = i3;
                                i3 = i4;
                            }
                            if (!cropView2.freeform || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                                cropAreaView2.setBitmap(cropView2.getCurrentWidth(), cropView2.getCurrentHeight(), (((float) i2) + cropView2.state.baseRotation) % 180.0f != 0.0f, cropView2.freeform);
                            } else {
                                cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                                cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                            }
                            CropState.access$400(cropView2.state, i2);
                            cropAreaView2.setActualRect((aspectRatio * cropState3.cropPw) / cropState3.cropPh);
                            CropState cropState6 = cropView2.state;
                            cropState6.mirrored = cropState3.mirrored;
                            float f4 = cropState3.cropRotate;
                            cropState6.rotation += f4;
                            cropState6.matrix.postRotate(f4, 0.0f, 0.0f);
                            CropState cropState7 = cropView2.state;
                            float f5 = cropState3.cropPx * i3;
                            float f6 = cropState7.minimumScale;
                            CropState.access$600(cropState7, f5 * f6, cropState3.cropPy * i4 * f6);
                            float fMax = Math.max(cropAreaView2.getCropWidth() / f, cropAreaView2.getCropHeight() / f2);
                            CropState cropState8 = cropView2.state;
                            float f7 = cropState3.cropScale * (fMax / cropState8.minimumScale);
                            cropState8.scale *= f7;
                            cropState8.matrix.postScale(f7, f7, 0.0f, 0.0f);
                            cropView2.updateMatrix(false);
                            CropViewListener cropViewListener2 = cropView2.listener;
                            if (cropViewListener2 != null) {
                                cropViewListener2.onChange(false);
                            }
                        }
                        cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                        return false;
                    }
                });
            } else {
                float f = currentWidth;
                cropState2.scale *= cropState2.width / f;
                cropState2.width = f;
                cropState2.height = currentHeight;
                cropState2.updateMinimumScale();
                Matrix matrix = cropState2.matrix;
                CropView cropView2 = CropView.this;
                matrix.getValues(cropView2.values);
                matrix.reset();
                float f2 = cropState2.scale;
                matrix.postScale(f2, f2);
                float[] fArr = cropView2.values;
                matrix.postTranslate(fArr[2], fArr[5]);
                cropView2.updateMatrix(false);
            }
            imageView.setImageBitmap(videoEditTextureView == null ? cropView.bitmap : null);
        }
        CropRotationWheel cropRotationWheel = this.wheelView;
        cropRotationWheel.setFreeform(z);
        cropRotationWheel.setRotation$1(0.0f);
        cropRotationWheel.setMirrored(false);
        cropRotationWheel.setRotated(false);
        if (cropState != null) {
            cropRotationWheel.setRotation$1(cropState.cropRotate);
            cropRotationWheel.setRotated(cropState.transformRotation != 0);
            cropRotationWheel.setMirrored(cropState.mirrored);
        } else {
            cropRotationWheel.setRotated(false);
            cropRotationWheel.setMirrored(false);
        }
        cropRotationWheel.setVisibility(z ? 0 : 4);
    }

    public void setDelegate(PhotoCropViewDelegate photoCropViewDelegate) {
        this.delegate = photoCropViewDelegate;
    }

    public void setFreeform(boolean z) {
        this.cropView.setFreeform(z);
    }

    public void setSubtitle(String str) {
        this.cropView.setSubtitle(str);
    }

    public void setVideoThumbFlashAlpha(float f) {
        this.flashAlpha = f;
        super.invalidate();
        this.cropView.invalidate();
    }

    public void setVideoThumbVisible(boolean z) {
        int i = 1;
        if (this.thumbImageVisibleOverride == z) {
            return;
        }
        this.thumbImageVisibleOverride = z;
        AnimatorSet animatorSet = this.thumbOverrideAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.thumbOverrideAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.PROGRESS_VALUE, z ? 1.0f : 0.0f));
        this.thumbOverrideAnimation.setDuration(180L);
        this.thumbOverrideAnimation.addListener(new AnonymousClass5(this, i));
        this.thumbOverrideAnimation.start();
    }
}
