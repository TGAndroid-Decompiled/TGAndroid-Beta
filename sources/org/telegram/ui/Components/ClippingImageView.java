package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;

public class ClippingImageView extends View {
    public static final float[] radii = new float[8];
    public float additionalTranslationX;
    public float additionalTranslationY;
    public float animationProgress;
    public float[][] animationValues;
    public final RectF bitmapRect;
    public BitmapShader bitmapShader;
    public ImageReceiver.BitmapHolder bmp;
    public int clipBottom;
    public int clipLeft;
    public int clipRight;
    public int clipTop;
    public final RectF drawRect;
    public boolean fade;
    public int imageX;
    public int imageY;
    public boolean in;
    public int invert;
    public final Matrix matrix;
    public boolean needRadius;
    public int orientation;
    public final Paint paint;
    public final int[] radius;
    public final Paint roundPaint;
    public final Path roundPath;
    public final RectF roundRect;
    public final Matrix shaderMatrix;

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
        return (getScaleX() * (((getWidth() - (this.clipRight / scaleY)) + (this.clipLeft / scaleY)) / 2.0f)) + getTranslationX();
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        return (getScaleY() * (((getHeight() - (this.clipBottom / scaleY)) + (this.clipTop / scaleY)) / 2.0f)) + getTranslationY();
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
    public final void onDraw(Canvas canvas) {
        ImageReceiver.BitmapHolder bitmapHolder;
        float[] fArr;
        if (getVisibility() != 0 || (bitmapHolder = this.bmp) == null || bitmapHolder.isRecycled()) {
            return;
        }
        float scaleY = getScaleY();
        canvas.save();
        boolean z = this.needRadius;
        RectF rectF = this.bitmapRect;
        if (z) {
            Matrix matrix = this.shaderMatrix;
            matrix.reset();
            RectF rectF2 = this.roundRect;
            rectF2.set(this.imageX / scaleY, this.imageY / scaleY, getWidth() - (this.imageX / scaleY), getHeight() - (this.imageY / scaleY));
            rectF.set(0.0f, 0.0f, this.bmp.getWidth(), this.bmp.getHeight());
            AndroidUtilities.setRectToRect(matrix, rectF, rectF2, this.orientation, this.invert, false);
            this.bitmapShader.setLocalMatrix(matrix);
            canvas.clipRect(this.clipLeft / scaleY, this.clipTop / scaleY, getWidth() - (this.clipRight / scaleY), getHeight() - (this.clipBottom / scaleY));
            int i = 0;
            while (true) {
                int[] iArr = this.radius;
                int length = iArr.length;
                fArr = radii;
                if (i >= length) {
                    break;
                }
                int i2 = i * 2;
                float f = iArr[i];
                fArr[i2] = f;
                fArr[i2 + 1] = f;
                i++;
            }
            Path path = this.roundPath;
            path.reset();
            path.addRoundRect(rectF2, fArr, Path.Direction.CW);
            path.close();
            canvas.drawPath(path, this.roundPaint);
        } else {
            int i3 = this.orientation;
            RectF rectF3 = this.drawRect;
            Matrix matrix2 = this.matrix;
            if (i3 == 90 || i3 == 270) {
                rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i4 = this.invert;
                if (i4 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i4 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.orientation, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else if (i3 == 180) {
                rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                int i5 = this.invert;
                if (i5 == 1) {
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (i5 == 2) {
                    matrix2.postScale(1.0f, -1.0f);
                }
                matrix2.postRotate(this.orientation, 0.0f, 0.0f);
                matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
            } else {
                rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                int i6 = this.invert;
                if (i6 == 1) {
                    matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                } else if (i6 == 2) {
                    matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                }
                matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
            }
            canvas.clipRect(this.clipLeft / scaleY, this.clipTop / scaleY, getWidth() - (this.clipRight / scaleY), getHeight() - (this.clipBottom / scaleY));
            try {
                canvas.drawBitmap(this.bmp.bitmap, matrix2, this.paint);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        canvas.restore();
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
        setScaleX(((fArr[1][0] - f2) * f) + f2);
        float[][] fArr2 = this.animationValues;
        float f3 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f3) * this.animationProgress) + f3);
        float[][] fArr3 = this.animationValues;
        float f4 = fArr3[0][2];
        float f5 = this.additionalTranslationX;
        setTranslationX(((((fArr3[1][2] + f5) - f4) - f5) * this.animationProgress) + f4 + f5);
        float[][] fArr4 = this.animationValues;
        float f6 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f6) * this.animationProgress) + f6);
        float[][] fArr5 = this.animationValues;
        float f7 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f7) * this.animationProgress) + f7));
        float[][] fArr6 = this.animationValues;
        float f8 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f8) * this.animationProgress) + f8));
        float[][] fArr7 = this.animationValues;
        float f9 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f9) * this.animationProgress) + f9));
        int i = 0;
        while (true) {
            int[] iArr = this.radius;
            if (i >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.animationValues;
            int i2 = i + 7;
            float f10 = fArr8[0][i2];
            iArr[i] = (int) (((fArr8[1][i2] - f10) * this.animationProgress) + f10);
            setRadius(iArr);
            i++;
        }
        float[][] fArr9 = this.animationValues;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f11 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f11) * this.animationProgress) + f11));
            float[][] fArr11 = this.animationValues;
            float f12 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f12) * this.animationProgress) + f12));
        }
        if (this.fade) {
            if (!this.in) {
                f = 1.0f - f;
            }
            setAlpha(f);
        }
        invalidate();
    }

    public final void setAnimationValues(float[][] fArr) {
        this.animationValues = fArr;
        this.in = false;
        this.fade = false;
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

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.radius;
        if (iArr == null) {
            this.needRadius = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
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
