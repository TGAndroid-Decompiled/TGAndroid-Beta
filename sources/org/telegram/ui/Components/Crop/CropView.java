package org.telegram.ui.Components.Crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.stripe.android.Stripe;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda24;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda17;

public class CropView extends FrameLayout implements CropAreaView.AreaViewListener {
    public boolean animating;
    public final CropAreaView areaView;
    public Bitmap bitmap;
    public int bitmapRotation;
    public float bottomPadding;
    public final RectF cropRect;
    public CropTransform cropTransform;
    public final CropGestureDetector detector;
    public boolean freeform;
    public boolean hasAspectRatioDialog;
    public final ImageView imageView;
    public final boolean inBubbleMode;
    public final RectF initialAreaRect;
    public boolean isVisible;
    public CropViewListener listener;
    public final Matrix overlayMatrix;
    public final RectF previousAreaRect;
    public float rotationStartScale;
    public final RectF sizeRect;
    public CropState state;
    public final Matrix tempMatrix;
    public final Stripe.AnonymousClass1 tempRect;
    public float topPadding;
    public final float[] values;
    public VideoEditTextureView videoEditTextureView;

    public final class CropState {
        public float height;
        public float minimumScale;
        public boolean mirrored;
        public float orientation;
        public float width;
        public float x = 0.0f;
        public float y = 0.0f;
        public float scale = 1.0f;
        public final float baseRotation = 0;
        public float rotation = 0.0f;
        public final Matrix matrix = new Matrix();

        public CropState(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static boolean access$2500(CropState cropState) {
            return Math.abs(cropState.x) > 1.0E-5f || Math.abs(cropState.y) > 1.0E-5f || Math.abs(cropState.scale - cropState.minimumScale) > 1.0E-5f || Math.abs(cropState.rotation) > 1.0E-5f || Math.abs(cropState.orientation) > 1.0E-5f;
        }

        public static void access$400(CropState cropState, float f) {
            cropState.matrix.reset();
            cropState.x = 0.0f;
            cropState.y = 0.0f;
            cropState.rotation = 0.0f;
            cropState.orientation = f;
            cropState.updateMinimumScale();
            float f2 = cropState.minimumScale;
            cropState.scale = f2;
            cropState.matrix.postScale(f2, f2);
        }

        public static void access$600(CropState cropState, float f, float f2) {
            cropState.x += f;
            cropState.y += f2;
            cropState.matrix.postTranslate(f, f2);
        }

        public static void access$700(CropState cropState, float f, float f2, float f3) {
            cropState.scale *= f;
            cropState.matrix.postScale(f, f, f2, f3);
        }

        public final void updateMinimumScale() {
            float f = (this.orientation + this.baseRotation) % 180.0f;
            float f2 = f != 0.0f ? this.height : this.width;
            float f3 = f != 0.0f ? this.width : this.height;
            CropView cropView = CropView.this;
            boolean z = cropView.freeform;
            CropAreaView cropAreaView = cropView.areaView;
            if (z) {
                this.minimumScale = cropAreaView.getCropWidth() / f2;
            } else {
                this.minimumScale = Math.max(cropAreaView.getCropWidth() / f2, cropView.areaView.getCropHeight() / f3);
            }
        }
    }

    public interface CropViewListener {
        void onAspectLock(boolean z);

        void onChange(boolean z);

        void onTapUp();

        void onUpdate();
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
        this.tempRect = new Stripe.AnonymousClass1(26);
        this.tempMatrix = new Matrix();
        this.animating = false;
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        CropGestureDetector cropGestureDetector = new CropGestureDetector(context);
        this.detector = cropGestureDetector;
        cropGestureDetector.mListener = this;
        CropAreaView cropAreaView = new CropAreaView(context);
        this.areaView = cropAreaView;
        cropAreaView.setListener(this);
        addView(cropAreaView);
    }

    public static void editBitmap(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i, int i2, float f, float f2, float f3, float f4, ArrayList arrayList) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            float fMax = Math.max(bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight()) / Math.max(i, i2);
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate((-bitmapDecodeFile.getWidth()) / 2, (-bitmapDecodeFile.getHeight()) / 2);
            float f5 = 1.0f / fMax;
            matrix2.postScale(f5, f5);
            matrix2.postRotate(f3);
            matrix2.postConcat(matrix);
            matrix2.postScale(f4, f4);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(bitmapDecodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i3);
                    float[] fArr = {((mediaEntity.width / 2.0f) + mediaEntity.x) * bitmapDecodeFile.getWidth(), ((mediaEntity.height / 2.0f) + mediaEntity.y) * bitmapDecodeFile.getHeight(), mediaEntity.textViewX * bitmapDecodeFile.getWidth(), mediaEntity.textViewY * bitmapDecodeFile.getHeight()};
                    matrix2.mapPoints(fArr);
                    int width = bitmapDecodeFile.getWidth();
                    int height = bitmapDecodeFile.getHeight();
                    if (f3 == 90.0f || f3 == 270.0f) {
                        width = bitmapDecodeFile.getHeight();
                        height = bitmapDecodeFile.getWidth();
                    }
                    if (mediaEntity.type == 1) {
                        mediaEntity.width = ((mediaEntity.width * i) / bitmap.getWidth()) * f4 * f;
                        mediaEntity.height = ((mediaEntity.height * i2) / bitmap.getHeight()) * f4 * f;
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
                    mediaEntity.x = (fArr[0] / bitmap.getWidth()) - (mediaEntity.width / 2.0f);
                    mediaEntity.y = (fArr[1] / bitmap.getHeight()) - (mediaEntity.height / 2.0f);
                    mediaEntity.textViewX = fArr[2] / bitmap.getWidth();
                    mediaEntity.textViewY = fArr[3] / bitmap.getHeight();
                    mediaEntity.rotation = (float) (((double) mediaEntity.rotation) - (((double) (f2 + f3)) * 0.017453292519943295d));
                }
            }
            bitmapDecodeFile.recycle();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void fitTranslation(RectF rectF, RectF rectF2, PointF pointF, float f) {
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
        float fCenterX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f2);
        float fCenterY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f3);
        double d = f;
        double d2 = 1.5707963267948966d - d;
        double d3 = fCenterX;
        float fSin = (float) (Math.sin(d2) * d3);
        float fCos = (float) (Math.cos(d2) * d3);
        double d4 = d + 1.5707963267948966d;
        double d5 = fCenterY;
        pointF.set(pointF.x + fSin + ((float) (Math.cos(d4) * d5)), pointF.y + fCos + ((float) (Math.sin(d4) * d5)));
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

    public static float scaleWidthToMaxSize(RectF rectF, RectF rectF2) {
        float fWidth = rectF2.width();
        if (((float) Math.floor((rectF.height() * fWidth) / rectF.width())) <= rectF2.height()) {
            return fWidth;
        }
        return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
    }

    private void setLockedAspectRatio(float f) {
        CropAreaView cropAreaView = this.areaView;
        cropAreaView.setLockedAspectRatio(f);
        RectF rectF = new RectF();
        cropAreaView.calculateRect(rectF, f);
        fillAreaView(rectF);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(false);
            this.listener.onAspectLock(true);
        }
    }

    public final void applyToCropState(MediaController.CropState cropState) {
        int i;
        int i2;
        float f;
        RectF rectF = this.cropRect;
        CropAreaView cropAreaView = this.areaView;
        rectF.set(cropAreaView.actualRect);
        int iCeil = (int) Math.ceil(scaleWidthToMaxSize(rectF, this.sizeRect));
        float f2 = iCeil;
        int iCeil2 = (int) Math.ceil(f2 / cropAreaView.getAspectRatio());
        float cropWidth = f2 / cropAreaView.getCropWidth();
        Matrix matrix = this.state.matrix;
        float[] fArr = this.values;
        matrix.getValues(fArr);
        CropState cropState2 = this.state;
        float f3 = cropState2.minimumScale * cropWidth;
        cropState.transformRotation = (int) cropState2.orientation;
        if (BuildVars.LOGS_ENABLED) {
            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("set transformRotation = "), cropState.transformRotation);
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
        cropState.cropScale = Math.min(f4 / cropAreaView.getCropWidth(), f5 / cropAreaView.getCropHeight()) * this.state.scale;
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
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void fillAreaView(RectF rectF) {
        float f;
        boolean z;
        boolean z2 = false;
        if (this.state == null) {
            return;
        }
        float[] fArr = {1.0f};
        float fWidth = rectF.width();
        CropAreaView cropAreaView = this.areaView;
        float fMax = Math.max(fWidth / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f2 = this.state.scale;
        if (f2 * fMax > 30.0f) {
            f = 30.0f / f2;
            z = true;
        } else {
            f = fMax;
            z = false;
        }
        float f3 = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        float fCenterX = rectF.centerX();
        ImageView imageView = this.imageView;
        float width = (fCenterX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth();
        CropState cropState = this.state;
        float f4 = ((cropState.orientation + cropState.baseRotation) % 180.0f != 0.0f ? cropState.height : cropState.width) * width;
        float fCenterY = (rectF.centerY() - ((((imageView.getHeight() - this.bottomPadding) + f3) + this.topPadding) / 2.0f)) / cropAreaView.getCropHeight();
        CropState cropState2 = this.state;
        float f5 = (cropState2.orientation + cropState2.baseRotation) % 180.0f != 0.0f ? cropState2.width : cropState2.height;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new CropView$$ExternalSyntheticLambda0(this, f, fArr, f4, f5 * fCenterY, 0));
        valueAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass77(20, this, z));
        AnimatorSet animatorSet = cropAreaView.animator;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.animator = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.animator = animatorSet2;
        animatorSet2.setDuration(300L);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(cropAreaView, "cropLeft", rectF.left);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.interpolator;
        objectAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(cropAreaView, "cropTop", rectF.top);
        objectAnimatorOfFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(cropAreaView, "cropRight", rectF.right);
        objectAnimatorOfFloat3.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(cropAreaView, "cropBottom", rectF.bottom);
        objectAnimatorOfFloat4.setInterpolator(accelerateDecelerateInterpolator);
        valueAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfFloat);
        animatorSet2.addListener(new ChatActivity.AnonymousClass74(cropAreaView, rectF, z2, 16));
        animatorSet2.start();
        this.initialAreaRect.set(rectF);
    }

    public final void fitContentInBounds(final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        float f;
        if (this.state == null) {
            return;
        }
        CropAreaView cropAreaView = this.areaView;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        CropState cropState = this.state;
        float f2 = (cropState.orientation + cropState.baseRotation) % 180.0f;
        float f3 = f2 != 0.0f ? cropState.height : cropState.width;
        float f4 = f2 != 0.0f ? cropState.width : cropState.height;
        float f5 = cropState.rotation;
        float radians = (float) Math.toRadians(f5);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f5, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, f3, f4);
        CropState cropState2 = this.state;
        float f6 = cropState2.scale;
        Stripe.AnonymousClass1 anonymousClass1 = this.tempRect;
        float[] fArr = (float[]) anonymousClass1.this$0;
        float f7 = rectF2.left;
        fArr[0] = f7;
        float f8 = rectF2.top;
        fArr[1] = f8;
        float f9 = rectF2.right;
        fArr[2] = f9;
        fArr[3] = f8;
        fArr[4] = f9;
        float f10 = rectF2.bottom;
        fArr[5] = f10;
        fArr[6] = f7;
        fArr[7] = f10;
        Matrix matrix2 = new Matrix();
        matrix2.set(cropState2.matrix);
        matrix2.preTranslate(((cropWidth - f3) / 2.0f) / f6, ((cropHeight - f4) / 2.0f) / f6);
        Matrix matrix3 = this.tempMatrix;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        float[] fArr2 = (float[]) anonymousClass1.this$0;
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f5, f3 / 2.0f, f4 / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        CropState cropState3 = this.state;
        PointF pointF = new PointF(cropState3.x, cropState3.y);
        if (!rectF2.contains(rectF)) {
            if (!z || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) {
                f = f6;
            } else {
                float fWidth = rectF.width() / scaleWidthToMaxSize(rectF, rectF2);
                float fWidth2 = rectF2.width() * fWidth;
                float fHeight = rectF2.height() * fWidth;
                float fWidth3 = (rectF2.width() - fWidth2) / 2.0f;
                float fHeight2 = (rectF2.height() - fHeight) / 2.0f;
                float f11 = rectF2.left + fWidth3;
                float f12 = rectF2.top + fHeight2;
                rectF2.set(f11, f12, fWidth2 + f11, fHeight + f12);
                f = fWidth * f6;
            }
            fitTranslation(rectF2, rectF, pointF, radians);
        } else if (!z2 || this.rotationStartScale <= 0.0f) {
            f = f6;
        } else {
            float fWidth4 = rectF.width() / scaleWidthToMaxSize(rectF, rectF2);
            if (this.state.scale * fWidth4 < this.rotationStartScale) {
                fWidth4 = 1.0f;
            }
            float fWidth5 = rectF2.width() * fWidth4;
            float fHeight3 = rectF2.height() * fWidth4;
            float fWidth6 = (rectF2.width() - fWidth5) / 2.0f;
            float fHeight4 = (rectF2.height() - fHeight3) / 2.0f;
            float f13 = rectF2.left + fWidth6;
            float f14 = rectF2.top + fHeight4;
            rectF2.set(f13, f14, fWidth5 + f13, fHeight3 + f14);
            f = fWidth4 * f6;
            fitTranslation(rectF2, rectF, pointF, radians);
        }
        float f15 = pointF.x;
        CropState cropState4 = this.state;
        float f16 = f15 - cropState4.x;
        float f17 = pointF.y - cropState4.y;
        if (!z3) {
            CropState.access$600(cropState4, f16, f17);
            CropState.access$700(this.state, f / f6, 0.0f, 0.0f);
            updateMatrix(false);
            return;
        }
        float f18 = f / f6;
        if (Math.abs(f18 - 1.0f) >= 1.0E-5f || Math.abs(f16) >= 1.0E-5f || Math.abs(f17) >= 1.0E-5f) {
            this.animating = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new CropView$$ExternalSyntheticLambda0(this, f16, new float[]{1.0f, 0.0f, 0.0f}, f17, f18, 1));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    CropView cropView = CropView.this;
                    cropView.animating = false;
                    if (z4) {
                        return;
                    }
                    cropView.fitContentInBounds(z, z2, z3, true);
                }
            });
            valueAnimatorOfFloat.setInterpolator(cropAreaView.getInterpolator());
            valueAnimatorOfFloat.setDuration(z4 ? 100L : 200L);
            valueAnimatorOfFloat.start();
        }
    }

    public RectF getActualRect() {
        RectF rectF = this.cropRect;
        rectF.set(this.areaView.actualRect);
        return rectF;
    }

    public float getCropHeight() {
        return this.areaView.getCropHeight();
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

    public float getStateOrientation() {
        CropState cropState = this.state;
        if (cropState == null) {
            return 0.0f;
        }
        return cropState.orientation;
    }

    public final void lambda$showAspectRatioDialog$3(Integer[][] numArr, int i) {
        this.hasAspectRatioDialog = false;
        if (i == 0) {
            CropState cropState = this.state;
            float f = cropState.baseRotation % 180.0f;
            setLockedAspectRatio((f != 0.0f ? cropState.height : cropState.width) / (f != 0.0f ? cropState.width : cropState.height));
        } else {
            if (i == 1) {
                setLockedAspectRatio(1.0f);
                return;
            }
            Integer[] numArr2 = numArr[i - 2];
            if (this.areaView.getAspectRatio() > 1.0f) {
                setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
            } else {
                setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
            }
        }
    }

    public final void maximize() {
        float currentWidth;
        int currentHeight;
        CropState cropState = this.state;
        if (cropState == null) {
            return;
        }
        final float f = cropState.minimumScale;
        CropAreaView cropAreaView = this.areaView;
        AnimatorSet animatorSet = cropAreaView.animator;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.animator = null;
        }
        CropState cropState2 = this.state;
        if ((cropState2.orientation + cropState2.baseRotation) % 180.0f != 0.0f) {
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
        cropAreaView.calculateRect(this.initialAreaRect, f2);
        cropAreaView.setLockedAspectRatio(this.freeform ? 0.0f : 1.0f);
        this.rotationStartScale = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.actualRect);
        CropState cropState3 = this.state;
        final float f3 = cropState3.x;
        final float f4 = cropState3.y;
        final float f5 = cropState3.scale;
        final float f6 = cropState3.rotation;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CropView cropView = this.f$0;
                if (cropView.state == null) {
                    return;
                }
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = cropView.initialAreaRect;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, fFloatValue, rectF5);
                cropView.areaView.setActualRect(rectF5);
                CropView.CropState cropState4 = cropView.state;
                float f7 = 1.0f - fFloatValue;
                float f8 = cropState4.x - (f3 * f7);
                float f9 = cropState4.y - (f4 * f7);
                float f10 = cropState4.rotation - (f6 * f7);
                float fLerp = AndroidUtilities.lerp(f5, f, fFloatValue);
                CropView.CropState cropState5 = cropView.state;
                float f11 = fLerp / cropState5.scale;
                CropView.CropState.access$600(cropState5, -f8, -f9);
                CropView.CropState.access$700(cropView.state, f11, 0.0f, 0.0f);
                CropView.CropState cropState6 = cropView.state;
                float f12 = -f10;
                cropState6.rotation += f12;
                cropState6.matrix.postRotate(f12, 0.0f, 0.0f);
                cropView.fitContentInBounds(true, false, false, false);
            }
        });
        valueAnimatorOfFloat.setInterpolator(cropAreaView.getInterpolator());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.start();
    }

    public final boolean mirror() {
        CropState cropState = this.state;
        boolean z = false;
        if (cropState == null) {
            return false;
        }
        cropState.mirrored = !cropState.mirrored;
        updateMatrix(false);
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            CropState cropState2 = this.state;
            float f = cropState2.orientation;
            float f2 = cropState2.baseRotation;
            float f3 = ((f + f2) - f2) % 360.0f;
            if (!CropState.access$2500(cropState2) && f3 == 0.0f && this.areaView.getLockAspectRatio() == 0.0f && !this.state.mirrored) {
                z = true;
            }
            cropViewListener.onChange(z);
        }
        return this.state.mirrored;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.animating) {
            CropAreaView cropAreaView = this.areaView;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.setGridType(1, true);
                        fitContentInBounds(true, false, true, false);
                    }
                } else if (!this.animating) {
                    cropAreaView.setGridType(3, true);
                    this.rotationStartScale = 0.0f;
                    CropViewListener cropViewListener = this.listener;
                    if (cropViewListener != null) {
                        cropViewListener.onChange(false);
                    }
                }
                try {
                    this.detector.onTouchEvent(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void reset(boolean z) {
        CropAreaView cropAreaView = this.areaView;
        AnimatorSet animatorSet = cropAreaView.animator;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.animator = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        CropState cropState = this.state;
        cropAreaView.setBitmap(currentWidth, currentHeight, (cropState == null || cropState.baseRotation % 180.0f == 0.0f) ? false : true, this.freeform);
        cropAreaView.setLockedAspectRatio(this.freeform ? 0.0f : 1.0f);
        CropState cropState2 = this.state;
        if (cropState2 != null) {
            CropState.access$400(cropState2, 0.0f);
            this.state.mirrored = false;
        }
        this.initialAreaRect.set(cropAreaView.actualRect);
        updateMatrix(z);
        this.rotationStartScale = 0.0f;
        CropViewListener cropViewListener = this.listener;
        if (cropViewListener != null) {
            cropViewListener.onChange(true);
            this.listener.onAspectLock(false);
        }
    }

    public final boolean rotate(float f) {
        if (this.state != null) {
            CropAreaView cropAreaView = this.areaView;
            AnimatorSet animatorSet = cropAreaView.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.animator = null;
            }
            this.rotationStartScale = 0.0f;
            CropState cropState = this.state;
            float f2 = cropState.orientation;
            float f3 = cropState.baseRotation;
            float f4 = (((f2 + f3) - f3) + f) % 360.0f;
            if (!this.freeform || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.setBitmap(getCurrentWidth(), getCurrentHeight(), (this.state.baseRotation + f4) % 180.0f != 0.0f, this.freeform);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            CropState.access$400(this.state, f4);
            updateMatrix(false);
            fitContentInBounds(true, false, false, false);
            CropViewListener cropViewListener = this.listener;
            if (cropViewListener != null) {
                cropViewListener.onChange(f4 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.state.mirrored);
            }
            if (((int) this.state.orientation) != 0) {
                return true;
            }
        }
        return false;
    }

    public void setAspectRatio(float f) {
        this.areaView.setActualRect(f);
    }

    public void setBottomPadding(float f) {
        this.bottomPadding = f;
        this.areaView.setBottomPadding(f);
    }

    public void setFreeform(boolean z) {
        this.areaView.setFreeform(z);
        this.freeform = z;
    }

    public void setListener(CropViewListener cropViewListener) {
        this.listener = cropViewListener;
    }

    @Override
    public void setRotation(float f) {
        CropState cropState = this.state;
        float f2 = cropState.rotation;
        float f3 = f - f2;
        cropState.rotation = f2 + f3;
        cropState.matrix.postRotate(f3, 0.0f, 0.0f);
        fitContentInBounds(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.areaView.setSubtitle(str);
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
        this.areaView.setTopPadding(f);
    }

    public final void showAspectRatioDialog() {
        int i = 6;
        int i2 = 4;
        if (this.state == null || this.hasAspectRatioDialog) {
            return;
        }
        this.hasAspectRatioDialog = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i3 = 2;
        for (int i4 = 0; i4 < 6; i4++) {
            Integer[] numArr2 = numArr[i4];
            if (this.areaView.getAspectRatio() > 1.0f) {
                strArr[i3] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i3] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i3++;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        builder.setItems(strArr, new ArticleViewer$$ExternalSyntheticLambda24(i2, this, numArr));
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.setCanceledOnTouchOutside(true);
        alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(this, i));
        alertDialog.show();
    }

    public final void start(int i, CropTransform cropTransform, final MediaController.CropState cropState) {
        this.freeform = true;
        this.videoEditTextureView = null;
        this.cropTransform = cropTransform;
        this.bitmapRotation = i;
        this.bitmap = null;
        CropAreaView cropAreaView = this.areaView;
        cropAreaView.setIsVideo(false);
        final int currentWidth = getCurrentWidth();
        final int currentHeight = getCurrentHeight();
        this.state = new CropState(currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public final boolean onPreDraw() {
                float f;
                float f2;
                CropView cropView = CropView.this;
                cropView.reset(false);
                CropAreaView cropAreaView2 = cropView.areaView;
                MediaController.CropState cropState2 = cropState;
                if (cropState2 != null) {
                    float f3 = cropState2.lockedAspectRatio;
                    if (f3 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f3);
                        CropViewListener cropViewListener = cropView.listener;
                        if (cropViewListener != null) {
                            cropViewListener.onAspectLock(true);
                        }
                    }
                    cropView.setFreeform(cropState2.freeform);
                    float aspectRatio = cropAreaView2.getAspectRatio();
                    int i2 = cropState2.transformRotation;
                    int i3 = currentHeight;
                    int i4 = currentWidth;
                    if (i2 == 90 || i2 == 270) {
                        aspectRatio = 1.0f / aspectRatio;
                        CropState cropState3 = cropView.state;
                        f = cropState3.height;
                        f2 = cropState3.width;
                    } else {
                        CropState cropState4 = cropView.state;
                        f = cropState4.width;
                        f2 = cropState4.height;
                        i4 = i3;
                        i3 = i4;
                    }
                    if (!cropView.freeform || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                        cropAreaView2.setBitmap(cropView.getCurrentWidth(), cropView.getCurrentHeight(), (((float) i2) + cropView.state.baseRotation) % 180.0f != 0.0f, cropView.freeform);
                    } else {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    }
                    CropState.access$400(cropView.state, i2);
                    cropAreaView2.setActualRect((aspectRatio * cropState2.cropPw) / cropState2.cropPh);
                    CropState cropState5 = cropView.state;
                    cropState5.mirrored = cropState2.mirrored;
                    float f4 = cropState2.cropRotate;
                    cropState5.rotation += f4;
                    cropState5.matrix.postRotate(f4, 0.0f, 0.0f);
                    CropState cropState6 = cropView.state;
                    float f5 = cropState2.cropPx * i3;
                    float f6 = cropState6.minimumScale;
                    CropState.access$600(cropState6, f5 * f6, cropState2.cropPy * i4 * f6);
                    float fMax = Math.max(cropAreaView2.getCropWidth() / f, cropAreaView2.getCropHeight() / f2);
                    CropState cropState7 = cropView.state;
                    float f7 = cropState2.cropScale * (fMax / cropState7.minimumScale);
                    cropState7.scale *= f7;
                    cropState7.matrix.postScale(f7, f7, 0.0f, 0.0f);
                    cropView.updateMatrix(false);
                    CropViewListener cropViewListener2 = cropView.listener;
                    if (cropViewListener2 != null) {
                        cropViewListener2.onChange(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                return false;
            }
        });
    }

    public final void updateCropTransform() {
        int i;
        float f;
        if (this.cropTransform == null || this.state == null) {
            return;
        }
        RectF rectF = this.cropRect;
        CropAreaView cropAreaView = this.areaView;
        rectF.set(cropAreaView.actualRect);
        int iCeil = (int) Math.ceil(scaleWidthToMaxSize(rectF, this.sizeRect));
        float f2 = iCeil;
        int iCeil2 = (int) Math.ceil(f2 / cropAreaView.getAspectRatio());
        float cropWidth = f2 / cropAreaView.getCropWidth();
        Matrix matrix = this.state.matrix;
        float[] fArr = this.values;
        matrix.getValues(fArr);
        CropState cropState = this.state;
        float f3 = cropState.minimumScale * cropWidth;
        int i2 = (int) cropState.orientation;
        while (i2 < 0) {
            i2 += 360;
        }
        if (i2 == 90 || i2 == 270) {
            CropState cropState2 = this.state;
            i = (int) cropState2.height;
            f = cropState2.width;
        } else {
            CropState cropState3 = this.state;
            i = (int) cropState3.width;
            f = cropState3.height;
        }
        int i3 = (int) f;
        double d = iCeil;
        float f4 = i;
        float fCeil = (float) (d / Math.ceil(f4 * f3));
        float f5 = i3;
        float fCeil2 = (float) (((double) iCeil2) / Math.ceil(f3 * f5));
        if (fCeil > 1.0f || fCeil2 > 1.0f) {
            float fMax = Math.max(fCeil, fCeil2);
            fCeil /= fMax;
            fCeil2 /= fMax;
        }
        float f6 = fCeil2;
        float f7 = fCeil;
        cropAreaView.calculateRect(cropAreaView.targetRect, f4 / f5);
        RectF rectF2 = cropAreaView.targetRect;
        float fWidth = this.freeform ? rectF2.width() / f4 : Math.max(rectF2.width() / f4, rectF2.height() / f5);
        CropState cropState4 = this.state;
        float f8 = cropState4.scale;
        float f9 = f8 / fWidth;
        float f10 = f8 / cropState4.minimumScale;
        float f11 = (fArr[2] / f4) / f8;
        float f12 = (fArr[5] / f5) / f8;
        float f13 = cropState4.rotation;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        CropTransform cropTransform = this.cropTransform;
        CropState cropState5 = this.state;
        boolean z = cropState5.mirrored || CropState.access$2500(cropState5) || this.state.baseRotation >= 1.0E-5f;
        CropState cropState6 = this.state;
        cropTransform.setViewTransform(z, f11, f12, f13, (int) cropState6.orientation, f9, f10, cropState6.minimumScale / fWidth, f7, f6, cropCenterX, cropCenterY, cropState6.mirrored);
    }

    public final void updateMatrix(boolean z) {
        if (this.state == null) {
            return;
        }
        Matrix matrix = this.overlayMatrix;
        matrix.reset();
        CropState cropState = this.state;
        float f = cropState.baseRotation;
        if (f == 90.0f || f == 270.0f) {
            matrix.postTranslate((-cropState.height) / 2.0f, (-cropState.width) / 2.0f);
        } else {
            matrix.postTranslate((-cropState.width) / 2.0f, (-cropState.height) / 2.0f);
        }
        matrix.postRotate((int) this.state.orientation);
        matrix.postConcat(this.state.matrix);
        CropAreaView cropAreaView = this.areaView;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.freeform || this.isVisible || z) {
            updateCropTransform();
            this.listener.onUpdate();
        }
        invalidate();
    }
}
