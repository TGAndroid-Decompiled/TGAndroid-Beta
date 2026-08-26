package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.DiffUtil;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.Crop.CropView;
import org.telegram.ui.Components.Crop.CropView.CropState;

public class PhotoCropView extends FrameLayout {
    public final Property<PhotoCropView, Float> ANIMATION_VALUE;
    public final Property<PhotoCropView, Float> PROGRESS_VALUE;
    private Paint circlePaint;
    public CropView cropView;
    private PhotoCropViewDelegate delegate;
    private float flashAlpha;
    private boolean inBubbleMode;
    public boolean isReset;
    private final Theme.ResourcesProvider resourcesProvider;
    private AnimatorSet thumbAnimation;
    private float thumbAnimationProgress;
    private ImageReceiver thumbImageView;
    private boolean thumbImageVisible;
    private boolean thumbImageVisibleOverride;
    private float thumbImageVisibleProgress;
    private AnimatorSet thumbOverrideAnimation;
    public CropRotationWheel wheelView;

    public interface PhotoCropViewDelegate {
        int getVideoThumbX();

        boolean mirror();

        void onChange(boolean z);

        void onTapUp();

        void onUpdate();

        void onVideoThumbClick();

        boolean rotate();
    }

    public PhotoCropView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.isReset = true;
        this.thumbImageVisibleOverride = true;
        this.thumbAnimationProgress = 1.0f;
        this.flashAlpha = 0.0f;
        this.circlePaint = new Paint(1);
        this.ANIMATION_VALUE = new AnimationProperties.FloatProperty<PhotoCropView>("thumbAnimationProgress") {
            @Override
            public Float get(PhotoCropView photoCropView) {
                return Float.valueOf(PhotoCropView.this.thumbAnimationProgress);
            }

            @Override
            public void setValue(PhotoCropView photoCropView, float f) {
                PhotoCropView.this.thumbAnimationProgress = f;
                photoCropView.invalidate();
            }
        };
        this.PROGRESS_VALUE = new AnimationProperties.FloatProperty<PhotoCropView>("thumbImageVisibleProgress") {
            @Override
            public Float get(PhotoCropView photoCropView) {
                return Float.valueOf(PhotoCropView.this.thumbImageVisibleProgress);
            }

            @Override
            public void setValue(PhotoCropView photoCropView, float f) {
                PhotoCropView.this.thumbImageVisibleProgress = f;
                photoCropView.invalidate();
            }
        };
        this.resourcesProvider = resourcesProvider;
        this.inBubbleMode = context instanceof BubbleActivity;
        CropView cropView = new CropView(context);
        this.cropView = cropView;
        cropView.setListener(new CropView.CropViewListener() {
            @Override
            public void onAspectLock(boolean z) {
                PhotoCropView.this.wheelView.setAspectLock(z);
            }

            @Override
            public void onChange(boolean z) {
                PhotoCropView photoCropView = PhotoCropView.this;
                photoCropView.isReset = z;
                if (photoCropView.delegate != null) {
                    PhotoCropView.this.delegate.onChange(z);
                }
            }

            @Override
            public void onTapUp() {
                if (PhotoCropView.this.delegate != null) {
                    PhotoCropView.this.delegate.onTapUp();
                }
            }

            @Override
            public void onUpdate() {
                if (PhotoCropView.this.delegate != null) {
                    PhotoCropView.this.delegate.onUpdate();
                }
            }
        });
        this.cropView.setBottomPadding(AndroidUtilities.dp(64.0f));
        addView(this.cropView);
        this.thumbImageView = new ImageReceiver(this);
        CropRotationWheel cropRotationWheel = new CropRotationWheel(context);
        this.wheelView = cropRotationWheel;
        cropRotationWheel.setListener(new CropRotationWheel.RotationWheelListener() {
            @Override
            public void aspectRatioPressed() {
                PhotoCropView.this.cropView.showAspectRatioDialog();
            }

            @Override
            public boolean mirror() {
                if (PhotoCropView.this.delegate != null) {
                    return PhotoCropView.this.delegate.mirror();
                }
                return false;
            }

            @Override
            public void onChange(float f) {
                PhotoCropView.this.cropView.setRotation(f);
                PhotoCropView photoCropView = PhotoCropView.this;
                photoCropView.isReset = false;
                if (photoCropView.delegate != null) {
                    PhotoCropView.this.delegate.onChange(false);
                }
            }

            @Override
            public void onEnd(float f) {
                PhotoCropView.this.cropView.areaView.setGridType(1, true);
            }

            @Override
            public void onStart() {
                CropView cropView2 = PhotoCropView.this.cropView;
                cropView2.areaView.setGridType(2, false);
                if (cropView2.rotationStartScale < 1.0E-5f) {
                    cropView2.rotationStartScale = cropView2.state.scale;
                }
            }

            @Override
            public boolean rotate90Pressed() {
                if (PhotoCropView.this.delegate != null) {
                    return PhotoCropView.this.delegate.rotate();
                }
                return false;
            }
        });
        addView(this.wheelView, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void cancelThumbAnimation() {
        AnimatorSet animatorSet = this.thumbAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.thumbAnimation = null;
            this.thumbImageVisible = false;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        CropView cropView;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.thumbImageVisible && view == (cropView = this.cropView)) {
            RectF actualRect = cropView.getActualRect();
            int iDp = AndroidUtilities.dp(32.0f);
            int i = iDp / 2;
            int iDp2 = AndroidUtilities.dp(2.0f) + (this.delegate.getVideoThumbX() - i);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(156.0f);
            float f = actualRect.left;
            float f2 = this.thumbAnimationProgress;
            float f3 = ((iDp2 - f) * f2) + f;
            float f4 = actualRect.top;
            float fM = DiffUtil.m(measuredHeight, f4, f2, f4);
            float fWidth = ((iDp - actualRect.width()) * this.thumbAnimationProgress) + actualRect.width();
            this.thumbImageView.setRoundRadius((int) (fWidth / 2.0f));
            this.thumbImageView.setImageCoords(f3, fM, fWidth, fWidth);
            this.thumbImageView.setAlpha(this.thumbImageVisibleProgress);
            this.thumbImageView.draw(canvas);
            if (this.flashAlpha > 0.0f) {
                this.circlePaint.setColor(-1);
                this.circlePaint.setAlpha((int) (this.flashAlpha * 255.0f));
                canvas.drawCircle(actualRect.centerX(), actualRect.centerY(), actualRect.width() / 2.0f, this.circlePaint);
            }
            this.circlePaint.setColor(getThemedColor(Theme.key_chat_editMediaButton));
            this.circlePaint.setAlpha(Math.min(255, (int) (this.thumbAnimationProgress * 255.0f * this.thumbImageVisibleProgress)));
            canvas.drawCircle(iDp2 + i, AndroidUtilities.dp(8.0f) + measuredHeight + iDp, AndroidUtilities.dp(3.0f), this.circlePaint);
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
    public void invalidate() {
        super.invalidate();
        this.cropView.invalidate();
    }

    public boolean isReady() {
        CropView cropView = this.cropView;
        return (cropView.detector.mDetector.isInProgress() || cropView.detector.mIsDragging || cropView.areaView.isDragging) ? false : true;
    }

    public void makeCrop(MediaController.MediaEditState mediaEditState) {
        CropView cropView = this.cropView;
        if (cropView.state == null) {
            return;
        }
        RectF rectF = cropView.cropRect;
        CropAreaView cropAreaView = cropView.areaView;
        rectF.set(cropAreaView.actualRect);
        int iCeil = (int) Math.ceil(CropView.scaleWidthToMaxSize(rectF, cropView.sizeRect));
        float f = iCeil;
        int iCeil2 = (int) Math.ceil(f / cropAreaView.getAspectRatio());
        float cropWidth = f / cropAreaView.getCropWidth();
        if (mediaEditState.paintPath != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            String copy = CropView.getCopy(mediaEditState.paintPath);
            if (mediaEditState.croppedPaintPath != null) {
                new File(mediaEditState.croppedPaintPath).delete();
                mediaEditState.croppedPaintPath = null;
            }
            mediaEditState.croppedPaintPath = copy;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = mediaEditState.mediaEntities;
            if (arrayList == null || arrayList.isEmpty()) {
                mediaEditState.croppedMediaEntities = null;
            } else {
                mediaEditState.croppedMediaEntities = new ArrayList<>(mediaEditState.mediaEntities.size());
                int size = mediaEditState.mediaEntities.size();
                for (int i = 0; i < size; i++) {
                    mediaEditState.croppedMediaEntities.add(mediaEditState.mediaEntities.get(i).copy());
                }
            }
            cropView.getContext();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            Matrix matrix = cropView.state.matrix;
            int currentWidth = cropView.getCurrentWidth();
            int currentHeight = cropView.getCurrentHeight();
            CropView.CropState cropState = cropView.state;
            CropView.editBitmap(copy, canvas, bitmapCreateBitmap, matrix, currentWidth, currentHeight, cropState.scale, cropState.rotation, (int) cropState.orientation, cropWidth, mediaEditState.croppedMediaEntities);
        }
        if (mediaEditState.cropState == null) {
            mediaEditState.cropState = new MediaController.CropState();
        }
        cropView.applyToCropState(mediaEditState.cropState);
    }

    public boolean mirror() {
        return this.cropView.mirror();
    }

    public void onAppear() {
        CropView cropView = this.cropView;
        CropAreaView cropAreaView = cropView.areaView;
        cropAreaView.frameVisible = true;
        cropAreaView.frameAlpha = 1.0f;
        cropAreaView.lastUpdateTime = SystemClock.elapsedRealtime();
        cropAreaView.invalidate();
        CropAreaView cropAreaView2 = cropView.areaView;
        cropAreaView2.setDimVisibility(true);
        cropAreaView2.invalidate();
    }

    public void onAppeared() {
        CropView cropView = this.cropView;
        cropView.updateCropTransform();
        CropAreaView cropAreaView = cropView.areaView;
        cropAreaView.setDimVisibility(true);
        cropAreaView.frameVisible = true;
        cropAreaView.frameAlpha = 0.0f;
        cropAreaView.lastUpdateTime = SystemClock.elapsedRealtime();
        cropAreaView.invalidate();
        cropAreaView.invalidate();
    }

    public void onDisappear() {
        CropView cropView = this.cropView;
        cropView.imageView.setVisibility(4);
        CropAreaView cropAreaView = cropView.areaView;
        cropAreaView.setDimVisibility(false);
        cropAreaView.frameVisible = false;
        cropAreaView.frameAlpha = 1.0f;
        cropAreaView.invalidate();
    }

    public void onHide() {
        CropView cropView = this.cropView;
        cropView.videoEditTextureView = null;
        cropView.isVisible = false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.thumbImageVisibleOverride || !this.thumbImageVisible || !this.thumbImageView.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            this.delegate.onVideoThumbClick();
        }
        return true;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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

    public void onShow() {
        this.cropView.isVisible = true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.thumbImageVisibleOverride || !this.thumbImageVisible || !this.thumbImageView.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            this.delegate.onVideoThumbClick();
        }
        return true;
    }

    public void reset() {
        reset(false);
    }

    public boolean rotate(float f) {
        CropRotationWheel cropRotationWheel = this.wheelView;
        if (cropRotationWheel != null) {
            cropRotationWheel.setRotation$1(0.0f);
            cropRotationWheel.setRotated(false);
        }
        return this.cropView.rotate(f);
    }

    public void setAspectRatio(float f) {
        this.cropView.setAspectRatio(f);
    }

    public void setBitmap(Bitmap bitmap, int i, boolean z, boolean z2, PaintingOverlay paintingOverlay, CropTransform cropTransform, VideoEditTextureView videoEditTextureView, final MediaController.CropState cropState) {
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
        this.wheelView.setFreeform(z);
        CropRotationWheel cropRotationWheel = this.wheelView;
        cropRotationWheel.setRotation$1(0.0f);
        cropRotationWheel.setMirrored(false);
        cropRotationWheel.setRotated(false);
        if (cropState != null) {
            this.wheelView.setRotation$1(cropState.cropRotate);
            this.wheelView.setRotated(cropState.transformRotation != 0);
            this.wheelView.setMirrored(cropState.mirrored);
        } else {
            this.wheelView.setRotated(false);
            this.wheelView.setMirrored(false);
        }
        this.wheelView.setVisibility(z ? 0 : 4);
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

    public void setVideoThumb(Bitmap bitmap, int i) {
        this.thumbImageVisible = bitmap != null;
        this.thumbImageView.setImageBitmap(bitmap);
        this.thumbImageView.setOrientation(i, false);
        AnimatorSet animatorSet = this.thumbAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.thumbOverrideAnimation;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.thumbImageVisibleOverride = true;
        this.thumbImageVisibleProgress = 1.0f;
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.thumbAnimation = animatorSet3;
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this, this.ANIMATION_VALUE, 0.0f, 1.0f));
        this.thumbAnimation.setDuration(250L);
        this.thumbAnimation.setInterpolator(new OvershootInterpolator(1.01f));
        this.thumbAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoCropView.this.thumbAnimation = null;
            }
        });
        this.thumbAnimation.start();
    }

    public void setVideoThumbFlashAlpha(float f) {
        this.flashAlpha = f;
        invalidate();
    }

    public void setVideoThumbVisible(boolean z) {
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
        this.thumbOverrideAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoCropView.this.thumbOverrideAnimation = null;
            }
        });
        this.thumbOverrideAnimation.start();
    }

    public void reset(boolean z) {
        CropRotationWheel cropRotationWheel = this.wheelView;
        cropRotationWheel.setRotation$1(0.0f);
        cropRotationWheel.setMirrored(false);
        cropRotationWheel.setRotated(false);
        this.cropView.reset(z);
    }
}
