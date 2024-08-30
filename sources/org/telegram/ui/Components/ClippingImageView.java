package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.ImageReceiver;

public class ClippingImageView extends View {
    private static float[] radii = new float[8];
    private float additionalTranslationX;
    private float additionalTranslationY;
    private float animationProgress;
    private float[][] animationValues;
    private RectF bitmapRect;
    private BitmapShader bitmapShader;
    private ImageReceiver.BitmapHolder bmp;
    private int clipBottom;
    private int clipLeft;
    private int clipRight;
    private int clipTop;
    private RectF drawRect;
    private int imageX;
    private int imageY;
    private int invert;
    private Matrix matrix;
    private boolean needRadius;
    private int orientation;
    private Paint paint;
    private int[] radius;
    private Paint roundPaint;
    private Path roundPath;
    private RectF roundRect;
    private Matrix shaderMatrix;

    public ClippingImageView(Context context) {
        super(context);
        this.radius = new int[4];
        this.roundPath = new Path();
        Paint paint = new Paint(2);
        this.paint = paint;
        paint.setFilterBitmap(true);
        this.matrix = new Matrix();
        this.drawRect = new RectF();
        this.bitmapRect = new RectF();
        this.roundPaint = new Paint(3);
        this.roundRect = new RectF();
        this.shaderMatrix = new Matrix();
    }

    public float getAnimationProgress() {
        return this.animationProgress;
    }

    public Bitmap getBitmap() {
        ImageReceiver.BitmapHolder bitmapHolder = this.bmp;
        if (bitmapHolder != null) {
            return bitmapHolder.bitmap;
        }
        return null;
    }

    public ImageReceiver.BitmapHolder getBitmapHolder() {
        return this.bmp;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        return getTranslationX() + ((((this.clipLeft / scaleY) + (getWidth() - (this.clipRight / scaleY))) / 2.0f) * getScaleX());
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        return getTranslationY() + ((((this.clipTop / scaleY) + (getHeight() - (this.clipBottom / scaleY))) / 2.0f) * getScaleY());
    }

    public int getClipBottom() {
        return this.clipBottom;
    }

    public int getClipHorizontal() {
        return this.clipRight;
    }

    public int getClipLeft() {
        return this.clipLeft;
    }

    public int getClipRight() {
        return this.clipRight;
    }

    public int getClipTop() {
        return this.clipTop;
    }

    public void getClippedVisibleRect(RectF rectF) {
        rectF.left = getTranslationX();
        rectF.top = getTranslationY();
        rectF.right = rectF.left + (getMeasuredWidth() * getScaleX());
        float measuredHeight = rectF.top + (getMeasuredHeight() * getScaleY());
        rectF.left += this.clipLeft;
        rectF.top += this.clipTop;
        rectF.right -= this.clipRight;
        rectF.bottom = measuredHeight - this.clipBottom;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public int[] getRadius() {
        return this.radius;
    }

    @Override
    public float getTranslationY() {
        return super.getTranslationY() - this.additionalTranslationY;
    }

    @Override
    public void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ClippingImageView.onDraw(android.graphics.Canvas):void");
    }

    public void setAdditionalTranslationX(float f) {
        this.additionalTranslationX = f;
    }

    public void setAdditionalTranslationY(float f) {
        this.additionalTranslationY = f;
    }

    public void setAnimationProgress(float f) {
        this.animationProgress = f;
        float[][] fArr = this.animationValues;
        float f2 = fArr[0][0];
        setScaleX(f2 + ((fArr[1][0] - f2) * f));
        float[][] fArr2 = this.animationValues;
        float f3 = fArr2[0][1];
        setScaleY(f3 + ((fArr2[1][1] - f3) * this.animationProgress));
        float[][] fArr3 = this.animationValues;
        float f4 = fArr3[0][2];
        float f5 = this.additionalTranslationX;
        setTranslationX(f4 + f5 + ((((fArr3[1][2] + f5) - f4) - f5) * this.animationProgress));
        float[][] fArr4 = this.animationValues;
        float f6 = fArr4[0][3];
        setTranslationY(f6 + ((fArr4[1][3] - f6) * this.animationProgress));
        float[][] fArr5 = this.animationValues;
        float f7 = fArr5[0][4];
        setClipHorizontal((int) (f7 + ((fArr5[1][4] - f7) * this.animationProgress)));
        float[][] fArr6 = this.animationValues;
        float f8 = fArr6[0][5];
        setClipTop((int) (f8 + ((fArr6[1][5] - f8) * this.animationProgress)));
        float[][] fArr7 = this.animationValues;
        float f9 = fArr7[0][6];
        setClipBottom((int) (f9 + ((fArr7[1][6] - f9) * this.animationProgress)));
        int i = 0;
        while (true) {
            int[] iArr = this.radius;
            if (i >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.animationValues;
            int i2 = i + 7;
            float f10 = fArr8[0][i2];
            iArr[i] = (int) (f10 + ((fArr8[1][i2] - f10) * this.animationProgress));
            setRadius(iArr);
            i++;
        }
        float[][] fArr9 = this.animationValues;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f11 = fArr10[11];
            setImageY((int) (f11 + ((fArr9[1][11] - f11) * this.animationProgress)));
            float[][] fArr11 = this.animationValues;
            float f12 = fArr11[0][12];
            setImageX((int) (f12 + ((fArr11[1][12] - f12) * this.animationProgress)));
        }
        invalidate();
    }

    public void setAnimationValues(float[][] fArr) {
        this.animationValues = fArr;
    }

    public void setClipBottom(int i) {
        this.clipBottom = i;
        invalidate();
    }

    public void setClipHorizontal(int i) {
        this.clipRight = i;
        this.clipLeft = i;
        invalidate();
    }

    public void setClipLeft(int i) {
        this.clipLeft = i;
        invalidate();
    }

    public void setClipRight(int i) {
        this.clipRight = i;
        invalidate();
    }

    public void setClipTop(int i) {
        this.clipTop = i;
        invalidate();
    }

    public void setClipVertical(int i) {
        this.clipBottom = i;
        this.clipTop = i;
        invalidate();
    }

    public void setImageBitmap(ImageReceiver.BitmapHolder bitmapHolder) {
        ImageReceiver.BitmapHolder bitmapHolder2 = this.bmp;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.bitmapShader = null;
        }
        if (bitmapHolder != null && bitmapHolder.isRecycled()) {
            bitmapHolder = null;
        }
        this.bmp = bitmapHolder;
        if (bitmapHolder != null && bitmapHolder.bitmap != null) {
            this.bitmapRect.set(0.0f, 0.0f, bitmapHolder.getWidth(), bitmapHolder.getHeight());
            Bitmap bitmap = this.bmp.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.bitmapShader = bitmapShader;
            this.roundPaint.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i) {
        this.imageX = i;
    }

    public void setImageY(int i) {
        this.imageY = i;
    }

    public void setOrientation(int i) {
        this.orientation = i;
        this.invert = 0;
    }

    public void setOrientation(int i, int i2) {
        this.orientation = i;
        this.invert = i2;
    }

    public void setRadius(int[] iArr) {
        if (iArr == null) {
            this.needRadius = false;
            Arrays.fill(this.radius, 0);
            return;
        }
        System.arraycopy(iArr, 0, this.radius, 0, iArr.length);
        this.needRadius = false;
        for (int i : iArr) {
            if (i != 0) {
                this.needRadius = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f + this.additionalTranslationY);
    }
}
