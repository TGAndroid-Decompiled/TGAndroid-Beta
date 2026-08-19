package org.telegram.ui.Components.Crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.VideoEditTextureView;

public class CropView extends FrameLayout implements CropAreaView.AreaViewListener, CropGestureDetector.CropGestureListener {
    private boolean animating;
    public CropAreaView areaView;
    private Bitmap bitmap;
    protected int bitmapRotation;
    public float bottomPadding;
    RectF cropRect;
    private CropTransform cropTransform;
    private CropGestureDetector detector;
    private boolean freeform;
    private boolean hasAspectRatioDialog;
    private ImageView imageView;
    private boolean inBubbleMode;
    private RectF initialAreaRect;
    private boolean isVisible;
    private CropViewListener listener;
    private Matrix overlayMatrix;
    private PaintingOverlay paintingOverlay;
    private RectF previousAreaRect;
    private float rotationStartScale;
    RectF sizeRect;
    public CropState state;
    private Matrix tempMatrix;
    private CropRectangle tempRect;
    public float topPadding;
    float[] values;
    private VideoEditTextureView videoEditTextureView;

    public interface CropViewListener {
        void onAspectLock(boolean z);

        void onChange(boolean z);

        void onTapUp();

        void onUpdate();
    }

    @Override
    public void onFling(float f, float f2, float f3, float f4) {
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setSubtitle(String str) {
        this.areaView.setSubtitle(str);
    }

    public class CropState {
        public float baseRotation;
        public float height;
        public Matrix matrix;
        public float minimumScale;
        public boolean mirrored;
        public float orientation;
        public float rotation;
        public float scale;
        public float width;
        public float x;
        public float y;

        private CropState(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.x = 0.0f;
            this.y = 0.0f;
            this.scale = 1.0f;
            this.baseRotation = i3;
            this.rotation = 0.0f;
            this.matrix = new Matrix();
        }

        public void update(int i, int i2, int i3) {
            float f = i;
            this.scale *= this.width / f;
            this.width = f;
            this.height = i2;
            updateMinimumScale();
            this.matrix.getValues(CropView.this.values);
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f2 = this.scale;
            matrix.postScale(f2, f2);
            Matrix matrix2 = this.matrix;
            float[] fArr = CropView.this.values;
            matrix2.postTranslate(fArr[2], fArr[5]);
            CropView.this.updateMatrix();
        }

        public boolean hasChanges() {
            return Math.abs(this.x) > 1.0E-5f || Math.abs(this.y) > 1.0E-5f || Math.abs(this.scale - this.minimumScale) > 1.0E-5f || Math.abs(this.rotation) > 1.0E-5f || Math.abs(this.orientation) > 1.0E-5f;
        }

        public float getWidth() {
            return this.width;
        }

        public float getHeight() {
            return this.height;
        }

        public float getOrientedWidth() {
            return (this.orientation + this.baseRotation) % 180.0f != 0.0f ? this.height : this.width;
        }

        public float getOrientedHeight() {
            return (this.orientation + this.baseRotation) % 180.0f != 0.0f ? this.width : this.height;
        }

        public void translate(float f, float f2) {
            this.x += f;
            this.y += f2;
            this.matrix.postTranslate(f, f2);
        }

        public float getX() {
            return this.x;
        }

        public float getY() {
            return this.y;
        }

        public void scale(float f, float f2, float f3) {
            this.scale *= f;
            this.matrix.postScale(f, f, f2, f3);
        }

        public float getScale() {
            return this.scale;
        }

        public void rotate(float f, float f2, float f3) {
            this.rotation += f;
            this.matrix.postRotate(f, f2, f3);
        }

        public float getRotation() {
            return this.rotation;
        }

        public float getOrientation() {
            return this.orientation + this.baseRotation;
        }

        public int getOrientationOnly() {
            return (int) this.orientation;
        }

        public float getBaseRotation() {
            return this.baseRotation;
        }

        public void mirror() {
            this.mirrored = !this.mirrored;
        }

        public void reset(float f) {
            this.matrix.reset();
            this.x = 0.0f;
            this.y = 0.0f;
            this.rotation = 0.0f;
            this.orientation = f;
            updateMinimumScale();
            float f2 = this.minimumScale;
            this.scale = f2;
            this.matrix.postScale(f2, f2);
        }

        private void updateMinimumScale() {
            float f = (this.orientation + this.baseRotation) % 180.0f;
            float f2 = f != 0.0f ? this.height : this.width;
            float f3 = f != 0.0f ? this.width : this.height;
            if (CropView.this.freeform) {
                this.minimumScale = CropView.this.areaView.getCropWidth() / f2;
            } else {
                this.minimumScale = Math.max(CropView.this.areaView.getCropWidth() / f2, CropView.this.areaView.getCropHeight() / f3);
            }
        }

        public void getConcatMatrix(Matrix matrix) {
            matrix.postConcat(this.matrix);
        }

        public Matrix getMatrix() {
            Matrix matrix = new Matrix();
            matrix.set(this.matrix);
            return matrix;
        }
    }

    public float getStateOrientation() {
        CropState cropState = this.state;
        if (cropState == null) {
            return 0.0f;
        }
        return cropState.orientation;
    }

    public float getStateFullOrientation() {
        CropState cropState = this.state;
        if (cropState == null) {
            return 0.0f;
        }
        return cropState.baseRotation + cropState.orientation;
    }

    public boolean getStateMirror() {
        CropState cropState = this.state;
        return cropState != null && cropState.mirrored;
    }

    public CropView(Context context) {
        super(context);
        this.values = new float[9];
        this.cropRect = new RectF();
        this.sizeRect = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        this.inBubbleMode = context instanceof BubbleActivity;
        this.previousAreaRect = new RectF();
        this.initialAreaRect = new RectF();
        this.overlayMatrix = new Matrix();
        this.tempRect = new CropRectangle();
        this.tempMatrix = new Matrix();
        this.animating = false;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(this.imageView);
        CropGestureDetector cropGestureDetector = new CropGestureDetector(context);
        this.detector = cropGestureDetector;
        cropGestureDetector.setOnGestureListener(this);
        CropAreaView cropAreaView = new CropAreaView(context);
        this.areaView = cropAreaView;
        cropAreaView.setListener(this);
        addView(this.areaView);
    }

    public boolean isReady() {
        return (this.detector.isScaling() || this.detector.isDragging() || this.areaView.isDragging()) ? false : true;
    }

    public void setListener(CropViewListener cropViewListener) {
        this.listener = cropViewListener;
    }

    public void setBottomPadding(float f) {
        this.bottomPadding = f;
        this.areaView.setBottomPadding(f);
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
        this.areaView.setTopPadding(f);
    }

    public void setAspectRatio(float f) {
        this.areaView.setActualRect(f);
    }

    public void stop() {
        this.state = null;
    }

    public void start(int i, boolean z, boolean z2, CropTransform cropTransform, final MediaController.CropState cropState) {
        this.freeform = z;
        this.paintingOverlay = null;
        this.videoEditTextureView = null;
        this.cropTransform = cropTransform;
        this.bitmapRotation = i;
        this.bitmap = null;
        this.areaView.setIsVideo(false);
        final int currentWidth = getCurrentWidth();
        final int currentHeight = getCurrentHeight();
        CropState cropState2 = this.state;
        if (cropState2 != null && z2) {
            cropState2.update(currentWidth, currentHeight, i);
        } else {
            this.state = new CropState(currentWidth, currentHeight, 0);
            this.areaView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    float f;
                    float f2;
                    int i2;
                    int i3;
                    CropView.this.reset();
                    MediaController.CropState cropState3 = cropState;
                    if (cropState3 != null) {
                        float f3 = cropState3.lockedAspectRatio;
                        if (f3 > 1.0E-4f) {
                            CropView.this.areaView.setLockedAspectRatio(f3);
                            if (CropView.this.listener != null) {
                                CropView.this.listener.onAspectLock(true);
                            }
                        }
                        CropView.this.setFreeform(cropState.freeform);
                        float aspectRatio = CropView.this.areaView.getAspectRatio();
                        int i4 = cropState.transformRotation;
                        if (i4 == 90 || i4 == 270) {
                            aspectRatio = 1.0f / aspectRatio;
                            CropState cropState4 = CropView.this.state;
                            f = cropState4.height;
                            f2 = cropState4.width;
                            i2 = currentHeight;
                            i3 = currentWidth;
                        } else {
                            CropState cropState5 = CropView.this.state;
                            f = cropState5.width;
                            f2 = cropState5.height;
                            i2 = currentWidth;
                            i3 = currentHeight;
                        }
                        boolean unused = CropView.this.freeform;
                        if (CropView.this.freeform && CropView.this.areaView.getLockAspectRatio() > 0.0f) {
                            CropAreaView cropAreaView = CropView.this.areaView;
                            cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                            CropAreaView cropAreaView2 = CropView.this.areaView;
                            cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                        } else {
                            CropView cropView = CropView.this;
                            cropView.areaView.setBitmap(cropView.getCurrentWidth(), CropView.this.getCurrentHeight(), (((float) i4) + CropView.this.state.getBaseRotation()) % 180.0f != 0.0f, CropView.this.freeform);
                        }
                        CropView.this.state.reset(i4);
                        CropAreaView cropAreaView3 = CropView.this.areaView;
                        MediaController.CropState cropState6 = cropState;
                        cropAreaView3.setActualRect((aspectRatio * cropState6.cropPw) / cropState6.cropPh);
                        CropState cropState7 = CropView.this.state;
                        MediaController.CropState cropState8 = cropState;
                        cropState7.mirrored = cropState8.mirrored;
                        cropState7.rotate(cropState8.cropRotate, 0.0f, 0.0f);
                        CropState cropState9 = CropView.this.state;
                        MediaController.CropState cropState10 = cropState;
                        float f4 = cropState10.cropPx * i2;
                        float f5 = cropState9.minimumScale;
                        cropState9.translate(f4 * f5, cropState10.cropPy * i3 * f5);
                        float fMax = Math.max(CropView.this.areaView.getCropWidth() / f, CropView.this.areaView.getCropHeight() / f2);
                        CropState cropState11 = CropView.this.state;
                        cropState11.scale(cropState.cropScale * (fMax / cropState11.minimumScale), 0.0f, 0.0f);
                        CropView.this.updateMatrix();
                        if (CropView.this.listener != null) {
                            CropView.this.listener.onChange(false);
                        }
                    }
                    CropView.this.areaView.getViewTreeObserver().removeOnPreDrawListener(this);
                    return false;
                }
            });
        }
    }

    public void setBitmap(Bitmap bitmap, int i, boolean z, boolean z2, PaintingOverlay paintingOverlay, CropTransform cropTransform, VideoEditTextureView videoEditTextureView, final MediaController.CropState cropState) {
        CropView cropView;
        this.freeform = z;
        this.paintingOverlay = paintingOverlay;
        this.videoEditTextureView = videoEditTextureView;
        this.cropTransform = cropTransform;
        this.bitmapRotation = i;
        this.bitmap = bitmap;
        this.areaView.setIsVideo(videoEditTextureView != null);
        if (bitmap == null && videoEditTextureView == null) {
            this.state = null;
            this.imageView.setImageDrawable(null);
            return;
        }
        final int currentWidth = getCurrentWidth();
        final int currentHeight = getCurrentHeight();
        CropState cropState2 = this.state;
        if (cropState2 != null && z2) {
            cropState2.update(currentWidth, currentHeight, i);
            cropView = this;
        } else {
            cropView = this;
            cropView.state = new CropState(currentWidth, currentHeight, 0);
            cropView.areaView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public boolean onPreDraw() {
                    float f;
                    float f2;
                    int i2;
                    int i3;
                    CropView.this.reset();
                    MediaController.CropState cropState3 = cropState;
                    if (cropState3 != null) {
                        float f3 = cropState3.lockedAspectRatio;
                        if (f3 > 1.0E-4f) {
                            CropView.this.areaView.setLockedAspectRatio(f3);
                            if (CropView.this.listener != null) {
                                CropView.this.listener.onAspectLock(true);
                            }
                        }
                        CropView.this.setFreeform(cropState.freeform);
                        float aspectRatio = CropView.this.areaView.getAspectRatio();
                        int i4 = cropState.transformRotation;
                        if (i4 == 90 || i4 == 270) {
                            aspectRatio = 1.0f / aspectRatio;
                            CropState cropState4 = CropView.this.state;
                            f = cropState4.height;
                            f2 = cropState4.width;
                            i2 = currentHeight;
                            i3 = currentWidth;
                        } else {
                            CropState cropState5 = CropView.this.state;
                            f = cropState5.width;
                            f2 = cropState5.height;
                            i2 = currentWidth;
                            i3 = currentHeight;
                        }
                        boolean unused = CropView.this.freeform;
                        if (CropView.this.freeform && CropView.this.areaView.getLockAspectRatio() > 0.0f) {
                            CropAreaView cropAreaView = CropView.this.areaView;
                            cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                            CropAreaView cropAreaView2 = CropView.this.areaView;
                            cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                        } else {
                            CropView cropView2 = CropView.this;
                            cropView2.areaView.setBitmap(cropView2.getCurrentWidth(), CropView.this.getCurrentHeight(), (((float) i4) + CropView.this.state.getBaseRotation()) % 180.0f != 0.0f, CropView.this.freeform);
                        }
                        CropView.this.state.reset(i4);
                        CropAreaView cropAreaView3 = CropView.this.areaView;
                        MediaController.CropState cropState6 = cropState;
                        cropAreaView3.setActualRect((aspectRatio * cropState6.cropPw) / cropState6.cropPh);
                        CropState cropState7 = CropView.this.state;
                        MediaController.CropState cropState8 = cropState;
                        cropState7.mirrored = cropState8.mirrored;
                        cropState7.rotate(cropState8.cropRotate, 0.0f, 0.0f);
                        CropState cropState9 = CropView.this.state;
                        MediaController.CropState cropState10 = cropState;
                        float f4 = cropState10.cropPx * i2;
                        float f5 = cropState9.minimumScale;
                        cropState9.translate(f4 * f5, cropState10.cropPy * i3 * f5);
                        float fMax = Math.max(CropView.this.areaView.getCropWidth() / f, CropView.this.areaView.getCropHeight() / f2);
                        CropState cropState11 = CropView.this.state;
                        cropState11.scale(cropState.cropScale * (fMax / cropState11.minimumScale), 0.0f, 0.0f);
                        CropView.this.updateMatrix();
                        if (CropView.this.listener != null) {
                            CropView.this.listener.onChange(false);
                        }
                    }
                    CropView.this.areaView.getViewTreeObserver().removeOnPreDrawListener(this);
                    return false;
                }
            });
        }
        cropView.imageView.setImageBitmap(videoEditTextureView == null ? cropView.bitmap : null);
    }

    public void willShow() {
        this.areaView.setFrameVisibility(true, false);
        this.areaView.setDimVisibility(true);
        this.areaView.invalidate();
    }

    public void setFreeform(boolean z) {
        this.areaView.setFreeform(z);
        this.freeform = z;
    }

    public void onShow() {
        this.isVisible = true;
    }

    public void onHide() {
        this.videoEditTextureView = null;
        this.paintingOverlay = null;
        this.isVisible = false;
    }

    public void show() {
        updateCropTransform();
        this.areaView.setDimVisibility(true);
        this.areaView.setFrameVisibility(true, true);
        this.areaView.invalidate();
    }

    public void hide() {
        this.imageView.setVisibility(4);
        this.areaView.setDimVisibility(false);
        this.areaView.setFrameVisibility(false, false);
        this.areaView.invalidate();
    }

    public void reset() {
        reset(false);
    }

    public void reset(boolean z) {
        this.areaView.resetAnimator();
        CropAreaView cropAreaView = this.areaView;
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        CropState cropState = this.state;
        cropAreaView.setBitmap(currentWidth, currentHeight, (cropState == null || cropState.getBaseRotation() % 180.0f == 0.0f) ? false : true, this.freeform);
        this.areaView.setLockedAspectRatio(this.freeform ? 0.0f : 1.0f);
        CropState cropState2 = this.state;
        if (cropState2 != null) {
            cropState2.reset(0.0f);
            this.state.mirrored = false;
        }
        this.areaView.getCropRect(this.initialAreaRect);
        updateMatrix(z);
        resetRotationStartScale();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(true);
            this.listener.onAspectLock(false);
        }
    }

    public void updateMatrix() {
        updateMatrix(false);
    }

    public void updateMatrix(boolean z) {
        if (this.state == null) {
            return;
        }
        this.overlayMatrix.reset();
        if (this.state.getBaseRotation() == 90.0f || this.state.getBaseRotation() == 270.0f) {
            this.overlayMatrix.postTranslate((-this.state.getHeight()) / 2.0f, (-this.state.getWidth()) / 2.0f);
        } else {
            this.overlayMatrix.postTranslate((-this.state.getWidth()) / 2.0f, (-this.state.getHeight()) / 2.0f);
        }
        this.overlayMatrix.postRotate(this.state.getOrientationOnly());
        this.state.getConcatMatrix(this.overlayMatrix);
        this.overlayMatrix.postTranslate(this.areaView.getCropCenterX(), this.areaView.getCropCenterY());
        if (!this.freeform || this.isVisible || z) {
            updateCropTransform();
            this.listener.onUpdate();
        }
        invalidate();
    }

    private void fillAreaView(RectF rectF, boolean z) {
        final float scale;
        final boolean z2;
        if (this.state == null) {
            return;
        }
        final float[] fArr = {1.0f};
        float fMax = Math.max(rectF.width() / this.areaView.getCropWidth(), rectF.height() / this.areaView.getCropHeight());
        if (this.state.getScale() * fMax > 30.0f) {
            scale = 30.0f / this.state.getScale();
            z2 = true;
        } else {
            scale = fMax;
            z2 = false;
        }
        int i = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
        final float fCenterX = ((rectF.centerX() - (this.imageView.getWidth() / 2)) / this.areaView.getCropWidth()) * this.state.getOrientedWidth();
        final float fCenterY = ((rectF.centerY() - ((((this.imageView.getHeight() - this.bottomPadding) + i) + this.topPadding) / 2.0f)) / this.areaView.getCropHeight()) * this.state.getOrientedHeight();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CropView.$r8$lambda$64fQXYtM4fi6TkmrwmtzmrDJuLc(this.f$0, scale, fArr, fCenterX, fCenterY, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (z2) {
                    CropView.this.fitContentInBounds(false, false, true);
                }
            }
        });
        this.areaView.fill(rectF, valueAnimatorOfFloat, true);
        this.initialAreaRect.set(rectF);
    }

    public static void $r8$lambda$64fQXYtM4fi6TkmrwmtzmrDJuLc(CropView cropView, float f, float[] fArr, float f2, float f3, ValueAnimator valueAnimator) {
        cropView.getClass();
        float fFloatValue = ((f - 1.0f) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) + 1.0f;
        float f4 = fArr[0];
        float f5 = fFloatValue / f4;
        fArr[0] = f4 * f5;
        cropView.state.scale(f5, f2, f3);
        cropView.updateMatrix();
    }

    private float fitScale(RectF rectF, float f, float f2) {
        float fWidth = rectF.width() * f2;
        float fHeight = rectF.height() * f2;
        float fWidth2 = (rectF.width() - fWidth) / 2.0f;
        float fHeight2 = (rectF.height() - fHeight) / 2.0f;
        float f3 = rectF.left + fWidth2;
        float f4 = rectF.top + fHeight2;
        rectF.set(f3, f4, fWidth + f3, fHeight + f4);
        return f * f2;
    }

    private void fitTranslation(RectF rectF, RectF rectF2, PointF pointF, float f) {
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = rectF2.right;
        float f5 = rectF2.bottom;
        float f6 = rectF.left;
        if (f6 > f2) {
            f4 += f6 - f2;
            f2 = f6;
        }
        float f7 = rectF.top;
        if (f7 > f3) {
            f5 += f7 - f3;
            f3 = f7;
        }
        float f8 = rectF.right;
        if (f8 < f4) {
            f2 += f8 - f4;
        }
        float f9 = rectF.bottom;
        if (f9 < f5) {
            f3 += f9 - f5;
        }
        float fCenterX = rectF2.centerX() - (f2 + (rectF2.width() / 2.0f));
        float fCenterY = rectF2.centerY() - (f3 + (rectF2.height() / 2.0f));
        double d = f;
        double d2 = 1.5707963267948966d - d;
        double d3 = fCenterX;
        float fSin = (float) (Math.sin(d2) * d3);
        float fCos = (float) (Math.cos(d2) * d3);
        double d4 = d + 1.5707963267948966d;
        double d5 = fCenterY;
        pointF.set(pointF.x + fSin + ((float) (Math.cos(d4) * d5)), pointF.y + fCos + ((float) (Math.sin(d4) * d5)));
    }

    public RectF calculateBoundingBox(float f, float f2, float f3) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Matrix matrix = new Matrix();
        matrix.postRotate(f3, f / 2.0f, f2 / 2.0f);
        matrix.mapRect(rectF);
        return rectF;
    }

    public float scaleWidthToMaxSize(RectF rectF, RectF rectF2) {
        float fWidth = rectF2.width();
        return ((float) Math.floor((double) ((rectF.height() * fWidth) / rectF.width()))) > rectF2.height() ? (float) Math.floor((rectF2.height() * rectF.width()) / rectF.height()) : fWidth;
    }

    private static class CropRectangle {
        float[] coords = new float[8];

        CropRectangle() {
        }

        void setRect(RectF rectF) {
            float[] fArr = this.coords;
            float f = rectF.left;
            fArr[0] = f;
            float f2 = rectF.top;
            fArr[1] = f2;
            float f3 = rectF.right;
            fArr[2] = f3;
            fArr[3] = f2;
            fArr[4] = f3;
            float f4 = rectF.bottom;
            fArr[5] = f4;
            fArr[6] = f;
            fArr[7] = f4;
        }

        void applyMatrix(Matrix matrix) {
            matrix.mapPoints(this.coords);
        }

        void getRect(RectF rectF) {
            float[] fArr = this.coords;
            rectF.set(fArr[0], fArr[1], fArr[2], fArr[7]);
        }
    }

    public void fitContentInBounds(boolean z, boolean z2, boolean z3) {
        fitContentInBounds(z, z2, z3, false);
    }

    public void fitContentInBounds(final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        float fFitScale;
        if (this.state == null) {
            return;
        }
        float cropWidth = this.areaView.getCropWidth();
        float cropHeight = this.areaView.getCropHeight();
        float orientedWidth = this.state.getOrientedWidth();
        float orientedHeight = this.state.getOrientedHeight();
        float rotation = this.state.getRotation();
        float radians = (float) Math.toRadians(rotation);
        RectF rectFCalculateBoundingBox = calculateBoundingBox(cropWidth, cropHeight, rotation);
        RectF rectF = new RectF(0.0f, 0.0f, orientedWidth, orientedHeight);
        float scale = this.state.getScale();
        this.tempRect.setRect(rectF);
        Matrix matrix = this.state.getMatrix();
        matrix.preTranslate(((cropWidth - orientedWidth) / 2.0f) / scale, ((cropHeight - orientedHeight) / 2.0f) / scale);
        this.tempMatrix.reset();
        this.tempMatrix.setTranslate(rectF.centerX(), rectF.centerY());
        Matrix matrix2 = this.tempMatrix;
        matrix2.setConcat(matrix2, matrix);
        this.tempMatrix.preTranslate(-rectF.centerX(), -rectF.centerY());
        this.tempRect.applyMatrix(this.tempMatrix);
        this.tempMatrix.reset();
        this.tempMatrix.preRotate(-rotation, orientedWidth / 2.0f, orientedHeight / 2.0f);
        this.tempRect.applyMatrix(this.tempMatrix);
        this.tempRect.getRect(rectF);
        PointF pointF = new PointF(this.state.getX(), this.state.getY());
        if (!rectF.contains(rectFCalculateBoundingBox)) {
            fFitScale = (!z || (rectFCalculateBoundingBox.width() <= rectF.width() && rectFCalculateBoundingBox.height() <= rectF.height())) ? scale : fitScale(rectF, scale, rectFCalculateBoundingBox.width() / scaleWidthToMaxSize(rectFCalculateBoundingBox, rectF));
            fitTranslation(rectF, rectFCalculateBoundingBox, pointF, radians);
        } else if (!z2 || this.rotationStartScale <= 0.0f) {
            fFitScale = scale;
        } else {
            float fWidth = rectFCalculateBoundingBox.width() / scaleWidthToMaxSize(rectFCalculateBoundingBox, rectF);
            if (this.state.getScale() * fWidth < this.rotationStartScale) {
                fWidth = 1.0f;
            }
            fFitScale = fitScale(rectF, scale, fWidth);
            fitTranslation(rectF, rectFCalculateBoundingBox, pointF, radians);
        }
        final float x = pointF.x - this.state.getX();
        final float y = pointF.y - this.state.getY();
        if (!z3) {
            this.state.translate(x, y);
            this.state.scale(fFitScale / scale, 0.0f, 0.0f);
            updateMatrix();
            return;
        }
        final float f = fFitScale / scale;
        if (Math.abs(f - 1.0f) >= 1.0E-5f || Math.abs(x) >= 1.0E-5f || Math.abs(y) >= 1.0E-5f) {
            this.animating = true;
            final float[] fArr = {1.0f, 0.0f, 0.0f};
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CropView.$r8$lambda$MN6rvojmbQPf2atekWB06ZfWvpM(this.f$0, x, fArr, y, f, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    CropView.this.animating = false;
                    if (z4) {
                        return;
                    }
                    CropView.this.fitContentInBounds(z, z2, z3, true);
                }
            });
            valueAnimatorOfFloat.setInterpolator(this.areaView.getInterpolator());
            valueAnimatorOfFloat.setDuration(z4 ? 100L : 200L);
            valueAnimatorOfFloat.start();
        }
    }

    public static void $r8$lambda$MN6rvojmbQPf2atekWB06ZfWvpM(CropView cropView, float f, float[] fArr, float f2, float f3, ValueAnimator valueAnimator) {
        cropView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f4 = fArr[1];
        float f5 = (f * fFloatValue) - f4;
        fArr[1] = f4 + f5;
        float f6 = fArr[2];
        float f7 = (f2 * fFloatValue) - f6;
        fArr[2] = f6 + f7;
        CropState cropState = cropView.state;
        float f8 = fArr[0];
        cropState.translate(f5 * f8, f7 * f8);
        float f9 = fArr[0];
        float f10 = (((f3 - 1.0f) * fFloatValue) + 1.0f) / f9;
        fArr[0] = f9 * f10;
        cropView.state.scale(f10, 0.0f, 0.0f);
        cropView.updateMatrix();
    }

    public int getCurrentWidth() {
        VideoEditTextureView videoEditTextureView = this.videoEditTextureView;
        if (videoEditTextureView != null) {
            return videoEditTextureView.getVideoWidth();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 1;
        }
        int i = this.bitmapRotation;
        return (i == 90 || i == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public int getCurrentHeight() {
        VideoEditTextureView videoEditTextureView = this.videoEditTextureView;
        if (videoEditTextureView != null) {
            return videoEditTextureView.getVideoHeight();
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            return 1;
        }
        int i = this.bitmapRotation;
        return (i == 90 || i == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public boolean isMirrored() {
        CropState cropState = this.state;
        if (cropState == null) {
            return false;
        }
        return cropState.mirrored;
    }

    public boolean mirror() {
        CropState cropState = this.state;
        boolean z = false;
        if (cropState == null) {
            return false;
        }
        cropState.mirror();
        updateMatrix();
        if (this.listener != null) {
            float orientation = (this.state.getOrientation() - this.state.getBaseRotation()) % 360.0f;
            CropViewListener cropViewListener = this.listener;
            if (!this.state.hasChanges() && orientation == 0.0f && this.areaView.getLockAspectRatio() == 0.0f && !this.state.mirrored) {
                z = true;
            }
            cropViewListener.onChange(z);
        }
        return this.state.mirrored;
    }

    public void maximize(boolean z) {
        float currentWidth;
        int currentHeight;
        CropState cropState = this.state;
        if (cropState == null) {
            return;
        }
        final float f = cropState.minimumScale;
        this.areaView.resetAnimator();
        if (this.state.getOrientation() % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f2 = currentWidth / currentHeight;
        if (!this.freeform) {
            f2 = 1.0f;
        }
        this.areaView.calculateRect(this.initialAreaRect, f2);
        this.areaView.setLockedAspectRatio(this.freeform ? 0.0f : 1.0f);
        resetRotationStartScale();
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final RectF rectF = new RectF();
            final RectF rectF2 = new RectF();
            this.areaView.getCropRect(rectF);
            CropState cropState2 = this.state;
            final float f3 = cropState2.x;
            final float f4 = cropState2.y;
            final float f5 = cropState2.scale;
            final float f6 = cropState2.rotation;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CropView.$r8$lambda$Z4FOJOmlDAUX__m7rEDK6hP4220(this.f$0, rectF, rectF2, f3, f4, f6, f5, f, valueAnimator);
                }
            });
            valueAnimatorOfFloat.setInterpolator(this.areaView.getInterpolator());
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.start();
            return;
        }
        this.areaView.setActualRect(this.initialAreaRect);
        CropState cropState3 = this.state;
        cropState3.translate(-cropState3.x, -cropState3.y);
        CropState cropState4 = this.state;
        cropState4.scale(cropState4.minimumScale / cropState4.scale, 0.0f, 0.0f);
        CropState cropState5 = this.state;
        cropState5.rotate(-cropState5.rotation, 0.0f, 0.0f);
        updateMatrix();
        resetRotationStartScale();
    }

    public static void $r8$lambda$Z4FOJOmlDAUX__m7rEDK6hP4220(CropView cropView, RectF rectF, RectF rectF2, float f, float f2, float f3, float f4, float f5, ValueAnimator valueAnimator) {
        if (cropView.state == null) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AndroidUtilities.lerp(rectF, cropView.initialAreaRect, fFloatValue, rectF2);
        cropView.areaView.setActualRect(rectF2);
        CropState cropState = cropView.state;
        float f6 = 1.0f - fFloatValue;
        float f7 = cropState.x - (f * f6);
        float f8 = cropState.y - (f2 * f6);
        float f9 = cropState.rotation - (f3 * f6);
        float fLerp = AndroidUtilities.lerp(f4, f5, fFloatValue);
        CropState cropState2 = cropView.state;
        float f10 = fLerp / cropState2.scale;
        cropState2.translate(-f7, -f8);
        cropView.state.scale(f10, 0.0f, 0.0f);
        cropView.state.rotate(-f9, 0.0f, 0.0f);
        cropView.fitContentInBounds(true, false, false);
    }

    public boolean rotate(float f) {
        if (this.state == null) {
            return false;
        }
        this.areaView.resetAnimator();
        resetRotationStartScale();
        float orientation = ((this.state.getOrientation() - this.state.getBaseRotation()) + f) % 360.0f;
        if (this.freeform && this.areaView.getLockAspectRatio() > 0.0f) {
            CropAreaView cropAreaView = this.areaView;
            cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
            CropAreaView cropAreaView2 = this.areaView;
            cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
        } else {
            this.areaView.setBitmap(getCurrentWidth(), getCurrentHeight(), (this.state.getBaseRotation() + orientation) % 180.0f != 0.0f, this.freeform);
        }
        this.state.reset(orientation);
        updateMatrix();
        fitContentInBounds(true, false, false);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(orientation == 0.0f && this.areaView.getLockAspectRatio() == 0.0f && !this.state.mirrored);
        }
        return this.state.getOrientationOnly() != 0;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.animating || this.areaView.onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            onScrollChangeBegan();
        } else if (action == 1 || action == 3) {
            onScrollChangeEnded();
        }
        try {
            return this.detector.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override
    public void onAreaChangeBegan() {
        this.areaView.getCropRect(this.previousAreaRect);
        resetRotationStartScale();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(false);
        }
    }

    @Override
    public void onAreaChange() {
        this.areaView.setGridType(CropAreaView.GridType.MAJOR, false);
        float fCenterX = this.previousAreaRect.centerX() - this.areaView.getCropCenterX();
        float fCenterY = this.previousAreaRect.centerY() - this.areaView.getCropCenterY();
        CropState cropState = this.state;
        if (cropState != null) {
            cropState.translate(fCenterX, fCenterY);
        }
        updateMatrix();
        this.areaView.getCropRect(this.previousAreaRect);
        fitContentInBounds(true, false, false);
    }

    @Override
    public void onAreaChangeEnded() {
        this.areaView.setGridType(CropAreaView.GridType.NONE, true);
        fillAreaView(this.areaView.getTargetRectToFill(), false);
    }

    @Override
    public void onDrag(float f, float f2) {
        if (this.animating) {
            return;
        }
        this.state.translate(f, f2);
        updateMatrix();
    }

    @Override
    public void onTapUp() {
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onTapUp();
        }
    }

    public void onScrollChangeBegan() {
        if (this.animating) {
            return;
        }
        this.areaView.setGridType(CropAreaView.GridType.MAJOR, true);
        resetRotationStartScale();
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(false);
        }
    }

    public void onScrollChangeEnded() {
        this.areaView.setGridType(CropAreaView.GridType.NONE, true);
        fitContentInBounds(true, false, true);
    }

    @Override
    public void onScale(float f, float f2, float f3) {
        if (this.animating) {
            return;
        }
        if (this.state.getScale() * f > 30.0f) {
            f = 30.0f / this.state.getScale();
        }
        this.state.scale(f, ((f2 - (this.imageView.getWidth() / 2)) / this.areaView.getCropWidth()) * this.state.getOrientedWidth(), ((f3 - ((((this.imageView.getHeight() - this.bottomPadding) - (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0)) - this.topPadding) / 2.0f)) / this.areaView.getCropHeight()) * this.state.getOrientedHeight());
        updateMatrix();
    }

    public void onRotationBegan() {
        this.areaView.setGridType(CropAreaView.GridType.MINOR, false);
        if (this.rotationStartScale < 1.0E-5f) {
            this.rotationStartScale = this.state.getScale();
        }
    }

    public void onRotationEnded() {
        this.areaView.setGridType(CropAreaView.GridType.NONE, true);
    }

    private void resetRotationStartScale() {
        this.rotationStartScale = 0.0f;
    }

    @Override
    public void setRotation(float f) {
        this.state.rotate(f - this.state.getRotation(), 0.0f, 0.0f);
        fitContentInBounds(true, true, false);
    }

    public static void editBitmap(Context context, String str, Bitmap bitmap, Canvas canvas, Bitmap bitmap2, Bitmap.CompressFormat compressFormat, Matrix matrix, int i, int i2, float f, float f2, float f3, float f4, boolean z, ArrayList arrayList, boolean z2) {
        Bitmap bitmap3 = bitmap2;
        if (z2) {
            try {
                bitmap3.eraseColor(0);
            } catch (Throwable th) {
                FileLog.e(th);
                return;
            }
        }
        Bitmap bitmapDecodeFile = bitmap == null ? BitmapFactory.decodeFile(str) : bitmap;
        float fMax = Math.max(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()) / Math.max(i, i2);
        Matrix matrix2 = new Matrix();
        matrix2.postTranslate((-bitmapDecodeFile.getWidth()) / 2, (-bitmapDecodeFile.getHeight()) / 2);
        if (z) {
            matrix2.postScale(-1.0f, 1.0f);
        }
        float f5 = 1.0f / fMax;
        matrix2.postScale(f5, f5);
        matrix2.postRotate(f3);
        matrix2.postConcat(matrix);
        matrix2.postScale(f4, f4);
        matrix2.postTranslate(bitmap3.getWidth() / 2, bitmap3.getHeight() / 2);
        canvas.drawBitmap(bitmapDecodeFile, matrix2, new Paint(2));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        bitmap3.compress(compressFormat, 87, fileOutputStream);
        fileOutputStream.close();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i3);
                float[] fArr = {(mediaEntity.x + (mediaEntity.width / 2.0f)) * bitmapDecodeFile.getWidth(), (mediaEntity.y + (mediaEntity.height / 2.0f)) * bitmapDecodeFile.getHeight(), mediaEntity.textViewX * bitmapDecodeFile.getWidth(), mediaEntity.textViewY * bitmapDecodeFile.getHeight()};
                matrix2.mapPoints(fArr);
                int width = bitmapDecodeFile.getWidth();
                int height = bitmapDecodeFile.getHeight();
                if (f3 == 90.0f || f3 == 270.0f) {
                    width = bitmapDecodeFile.getHeight();
                    height = bitmapDecodeFile.getWidth();
                }
                if (mediaEntity.type == 1) {
                    mediaEntity.width = ((mediaEntity.width * i) / bitmap3.getWidth()) * f4 * f;
                    mediaEntity.height = ((mediaEntity.height * i2) / bitmap3.getHeight()) * f4 * f;
                } else {
                    float f6 = i;
                    float f7 = width;
                    mediaEntity.viewWidth = (int) ((mediaEntity.viewWidth / f6) * f7);
                    float f8 = i2;
                    float f9 = height;
                    mediaEntity.viewHeight = (int) ((mediaEntity.viewHeight / f8) * f9);
                    mediaEntity.width = ((mediaEntity.width * f6) / f7) * f4 * f;
                    mediaEntity.height = ((mediaEntity.height * f8) / f9) * f4 * f;
                }
                mediaEntity.x = (fArr[0] / bitmap2.getWidth()) - (mediaEntity.width / 2.0f);
                mediaEntity.y = (fArr[1] / bitmap2.getHeight()) - (mediaEntity.height / 2.0f);
                mediaEntity.textViewX = fArr[2] / bitmap2.getWidth();
                mediaEntity.textViewY = fArr[3] / bitmap2.getHeight();
                mediaEntity.rotation = (float) (((double) mediaEntity.rotation) - (((double) (f2 + f3)) * 0.017453292519943295d));
                i3++;
                bitmap3 = bitmap2;
            }
        }
        bitmapDecodeFile.recycle();
    }

    private void updateCropTransform() {
        int i;
        float f;
        float fMax;
        if (this.cropTransform == null || this.state == null) {
            return;
        }
        this.areaView.getCropRect(this.cropRect);
        int iCeil = (int) Math.ceil(scaleWidthToMaxSize(this.cropRect, this.sizeRect));
        float f2 = iCeil;
        int iCeil2 = (int) Math.ceil(f2 / this.areaView.getAspectRatio());
        float cropWidth = f2 / this.areaView.getCropWidth();
        this.state.matrix.getValues(this.values);
        CropState cropState = this.state;
        float f3 = cropState.minimumScale * cropWidth;
        int orientationOnly = cropState.getOrientationOnly();
        while (orientationOnly < 0) {
            orientationOnly += 360;
        }
        if (orientationOnly == 90 || orientationOnly == 270) {
            CropState cropState2 = this.state;
            i = (int) cropState2.height;
            f = cropState2.width;
        } else {
            CropState cropState3 = this.state;
            i = (int) cropState3.width;
            f = cropState3.height;
        }
        int i2 = (int) f;
        double d = iCeil;
        float f4 = i;
        float fCeil = (float) (d / Math.ceil(f4 * f3));
        float f5 = i2;
        float fCeil2 = (float) (((double) iCeil2) / Math.ceil(f3 * f5));
        if (fCeil > 1.0f || fCeil2 > 1.0f) {
            float fMax2 = Math.max(fCeil, fCeil2);
            fCeil /= fMax2;
            fCeil2 /= fMax2;
        }
        float f6 = fCeil2;
        float f7 = fCeil;
        RectF targetRectToFill = this.areaView.getTargetRectToFill(f4 / f5);
        if (this.freeform) {
            fMax = targetRectToFill.width() / f4;
        } else {
            fMax = Math.max(targetRectToFill.width() / f4, targetRectToFill.height() / f5);
        }
        CropState cropState4 = this.state;
        float f8 = cropState4.scale;
        float f9 = f8 / fMax;
        float f10 = f8 / cropState4.minimumScale;
        float[] fArr = this.values;
        float f11 = (fArr[2] / f4) / f8;
        float f12 = (fArr[5] / f5) / f8;
        float f13 = cropState4.rotation;
        RectF targetRectToFill2 = this.areaView.getTargetRectToFill();
        float cropCenterX = this.areaView.getCropCenterX() - targetRectToFill2.centerX();
        float cropCenterY = this.areaView.getCropCenterY() - targetRectToFill2.centerY();
        CropTransform cropTransform = this.cropTransform;
        CropState cropState5 = this.state;
        boolean z = cropState5.mirrored || cropState5.hasChanges() || this.state.getBaseRotation() >= 1.0E-5f;
        int orientationOnly2 = this.state.getOrientationOnly();
        CropState cropState6 = this.state;
        cropTransform.setViewTransform(z, f11, f12, f13, orientationOnly2, f9, f10, cropState6.minimumScale / fMax, f7, f6, cropCenterX, cropCenterY, cropState6.mirrored);
    }

    public static String getCopy(String str) {
        File file = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_temp.jpg");
        try {
            AndroidUtilities.copyFile(new File(str), file);
        } catch (Exception e) {
            FileLog.e(e);
        }
        return file.getAbsolutePath();
    }

    public void makeCrop(MediaController.MediaEditState mediaEditState) {
        if (this.state == null) {
            return;
        }
        this.areaView.getCropRect(this.cropRect);
        int iCeil = (int) Math.ceil(scaleWidthToMaxSize(this.cropRect, this.sizeRect));
        float f = iCeil;
        int iCeil2 = (int) Math.ceil(f / this.areaView.getAspectRatio());
        float cropWidth = f / this.areaView.getCropWidth();
        if (mediaEditState.paintPath != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            String copy = getCopy(mediaEditState.paintPath);
            if (mediaEditState.croppedPaintPath != null) {
                new File(mediaEditState.croppedPaintPath).delete();
                mediaEditState.croppedPaintPath = null;
            }
            mediaEditState.croppedPaintPath = copy;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = mediaEditState.mediaEntities;
            if (arrayList != null && !arrayList.isEmpty()) {
                mediaEditState.croppedMediaEntities = new ArrayList<>(mediaEditState.mediaEntities.size());
                int size = mediaEditState.mediaEntities.size();
                for (int i = 0; i < size; i++) {
                    mediaEditState.croppedMediaEntities.add(mediaEditState.mediaEntities.get(i).copy());
                }
            } else {
                mediaEditState.croppedMediaEntities = null;
            }
            Context context = getContext();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            Matrix matrix = this.state.matrix;
            int currentWidth = getCurrentWidth();
            int currentHeight = getCurrentHeight();
            CropState cropState = this.state;
            editBitmap(context, copy, null, canvas, bitmapCreateBitmap, compressFormat, matrix, currentWidth, currentHeight, cropState.scale, cropState.rotation, cropState.getOrientationOnly(), cropWidth, false, mediaEditState.croppedMediaEntities, false);
        }
        if (mediaEditState.cropState == null) {
            mediaEditState.cropState = new MediaController.CropState();
        }
        applyToCropState(mediaEditState.cropState);
    }

    public void applyToCropState(MediaController.CropState cropState) {
        int i;
        int i2;
        float f;
        this.areaView.getCropRect(this.cropRect);
        int iCeil = (int) Math.ceil(scaleWidthToMaxSize(this.cropRect, this.sizeRect));
        float f2 = iCeil;
        int iCeil2 = (int) Math.ceil(f2 / this.areaView.getAspectRatio());
        float cropWidth = f2 / this.areaView.getCropWidth();
        this.state.matrix.getValues(this.values);
        CropState cropState2 = this.state;
        float f3 = cropState2.minimumScale * cropWidth;
        cropState.transformRotation = cropState2.getOrientationOnly();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("set transformRotation = " + cropState.transformRotation);
        }
        while (true) {
            i = cropState.transformRotation;
            if (i >= 0) {
                break;
            } else {
                cropState.transformRotation = i + 360;
            }
        }
        if (i == 90 || i == 270) {
            CropState cropState3 = this.state;
            i2 = (int) cropState3.height;
            f = cropState3.width;
        } else {
            CropState cropState4 = this.state;
            i2 = (int) cropState4.width;
            f = cropState4.height;
        }
        int i3 = (int) f;
        float f4 = i2;
        cropState.cropPw = (float) (((double) iCeil) / Math.ceil(f4 * f3));
        float f5 = i3;
        float fCeil = (float) (((double) iCeil2) / Math.ceil(f3 * f5));
        cropState.cropPh = fCeil;
        float f6 = cropState.cropPw;
        if (f6 > 1.0f || fCeil > 1.0f) {
            float fMax = Math.max(f6, fCeil);
            cropState.cropPw /= fMax;
            cropState.cropPh /= fMax;
        }
        cropState.cropScale = this.state.scale * Math.min(f4 / this.areaView.getCropWidth(), f5 / this.areaView.getCropHeight());
        float[] fArr = this.values;
        float f7 = fArr[2] / f4;
        CropState cropState5 = this.state;
        float f8 = cropState5.scale;
        cropState.cropPx = f7 / f8;
        cropState.cropPy = (fArr[5] / f5) / f8;
        cropState.cropRotate = cropState5.rotation;
        cropState.stateScale = f8;
        cropState.mirrored = cropState5.mirrored;
        cropState.scale = cropWidth;
        cropState.matrix = cropState5.matrix;
        cropState.width = iCeil;
        cropState.height = iCeil2;
        cropState.freeform = this.freeform;
        cropState.lockedAspectRatio = this.areaView.getLockAspectRatio();
        cropState.initied = true;
    }

    private void setLockedAspectRatio(float f) {
        this.areaView.setLockedAspectRatio(f);
        RectF rectF = new RectF();
        this.areaView.calculateRect(rectF, f);
        fillAreaView(rectF, true);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(false);
            this.listener.onAspectLock(true);
        }
    }

    public void showAspectRatioDialog() {
        if (this.state == null || this.hasAspectRatioDialog) {
            return;
        }
        this.hasAspectRatioDialog = true;
        String[] strArr = new String[8];
        final Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i = 2;
        for (int i2 = 0; i2 < 6; i2++) {
            Integer[] numArr2 = numArr[i2];
            if (this.areaView.getAspectRatio() > 1.0f) {
                strArr[i] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i++;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setItems(strArr, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i3) {
                CropView.$r8$lambda$PtV843RbMPHPO9MBNEeLDSUPcgc(this.f$0, numArr, dialogInterface, i3);
            }
        }).create();
        alertDialogCreate.setCanceledOnTouchOutside(true);
        alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.hasAspectRatioDialog = false;
            }
        });
        alertDialogCreate.show();
    }

    public static void $r8$lambda$PtV843RbMPHPO9MBNEeLDSUPcgc(CropView cropView, Integer[][] numArr, DialogInterface dialogInterface, int i) {
        cropView.hasAspectRatioDialog = false;
        if (i == 0) {
            cropView.setLockedAspectRatio((cropView.state.getBaseRotation() % 180.0f != 0.0f ? cropView.state.getHeight() : cropView.state.getWidth()) / (cropView.state.getBaseRotation() % 180.0f != 0.0f ? cropView.state.getWidth() : cropView.state.getHeight()));
            return;
        }
        if (i == 1) {
            cropView.setLockedAspectRatio(1.0f);
            return;
        }
        Integer[] numArr2 = numArr[i - 2];
        if (cropView.areaView.getAspectRatio() > 1.0f) {
            cropView.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
        } else {
            cropView.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
        }
    }

    public void updateLayout() {
        CropState cropState;
        float cropWidth = this.areaView.getCropWidth();
        if (cropWidth == 0.0f || (cropState = this.state) == null) {
            return;
        }
        this.areaView.calculateRect(this.initialAreaRect, cropState.getWidth() / this.state.getHeight());
        CropAreaView cropAreaView = this.areaView;
        cropAreaView.setActualRect(cropAreaView.getAspectRatio());
        this.areaView.getCropRect(this.previousAreaRect);
        this.state.scale(this.areaView.getCropWidth() / cropWidth, 0.0f, 0.0f);
        updateMatrix();
    }

    public float getCropLeft() {
        return this.areaView.getCropLeft();
    }

    public float getCropTop() {
        return this.areaView.getCropTop();
    }

    public float getCropWidth() {
        return this.areaView.getCropWidth();
    }

    public float getCropHeight() {
        return this.areaView.getCropHeight();
    }

    public RectF getActualRect() {
        this.areaView.getCropRect(this.cropRect);
        return this.cropRect;
    }
}
