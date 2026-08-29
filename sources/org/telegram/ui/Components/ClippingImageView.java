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
    public static final float[] M = new float[8];
    public BitmapShader A;
    public final Paint B;
    public final RectF C;
    public final RectF D;
    public final Matrix E;
    public final Path F;
    public boolean G;
    public float H;
    public boolean I;
    public float[][] J;
    public float K;
    public float L;
    public int f26343a;
    public int f26344b;
    public int f26345c;
    public int d;
    public int f26346e;
    public int f26347f;
    public int h;
    public int f26348n;
    public final RectF f26349r;
    public final Paint f26350s;
    public ImageReceiver.BitmapHolder v;
    public final Matrix f26351w;
    public boolean f26352x;
    public final int[] f26353y;

    public ClippingImageView(Context context) {
        super(context);
        this.f26353y = new int[4];
        this.F = new Path();
        Paint paint = new Paint(2);
        this.f26350s = paint;
        paint.setFilterBitmap(true);
        this.f26351w = new Matrix();
        this.f26349r = new RectF();
        this.D = new RectF();
        this.B = new Paint(3);
        this.C = new RectF();
        this.E = new Matrix();
    }

    public float getAnimationProgress() {
        return this.H;
    }

    public Bitmap getBitmap() {
        ImageReceiver.BitmapHolder bitmapHolder = this.v;
        if (bitmapHolder != null) {
            return bitmapHolder.bitmap;
        }
        return null;
    }

    public ImageReceiver.BitmapHolder getBitmapHolder() {
        return this.v;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        float translationX = getTranslationX();
        float width = getWidth() - (this.f26345c / scaleY);
        return (getScaleX() * ((width + (this.f26344b / scaleY)) / 2.0f)) + translationX;
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float height = getHeight() - (this.f26343a / scaleY);
        return (getScaleY() * ((height + (this.d / scaleY)) / 2.0f)) + translationY;
    }

    public int getClipBottom() {
        return this.f26343a;
    }

    public int getClipHorizontal() {
        return this.f26345c;
    }

    public int getClipLeft() {
        return this.f26344b;
    }

    public int getClipRight() {
        return this.f26345c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.f26346e;
    }

    public int[] getRadius() {
        return this.f26353y;
    }

    @Override
    public float getTranslationY() {
        return super.getTranslationY() - this.K;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver.BitmapHolder bitmapHolder;
        float[] fArr;
        if (getVisibility() == 0 && (bitmapHolder = this.v) != null && !bitmapHolder.isRecycled()) {
            float scaleY = getScaleY();
            canvas.save();
            boolean z10 = this.f26352x;
            RectF rectF = this.D;
            if (z10) {
                Matrix matrix = this.E;
                matrix.reset();
                RectF rectF2 = this.C;
                rectF2.set(this.f26348n / scaleY, this.h / scaleY, getWidth() - (this.f26348n / scaleY), getHeight() - (this.h / scaleY));
                rectF.set(0.0f, 0.0f, this.v.getWidth(), this.v.getHeight());
                AndroidUtilities.setRectToRect(matrix, rectF, rectF2, this.f26346e, this.f26347f, false);
                this.A.setLocalMatrix(matrix);
                canvas.clipRect(this.f26344b / scaleY, this.d / scaleY, getWidth() - (this.f26345c / scaleY), getHeight() - (this.f26343a / scaleY));
                int i10 = 0;
                while (true) {
                    int[] iArr = this.f26353y;
                    int length = iArr.length;
                    fArr = M;
                    if (i10 >= length) {
                        break;
                    }
                    int i11 = i10 * 2;
                    float f9 = iArr[i10];
                    fArr[i11] = f9;
                    fArr[i11 + 1] = f9;
                    i10++;
                }
                Path path = this.F;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                path.close();
                canvas.drawPath(path, this.B);
            } else {
                int i12 = this.f26346e;
                RectF rectF3 = this.f26349r;
                Matrix matrix2 = this.f26351w;
                if (i12 != 90 && i12 != 270) {
                    if (i12 == 180) {
                        rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                        int i13 = this.f26347f;
                        if (i13 == 1) {
                            matrix2.postScale(-1.0f, 1.0f);
                        } else if (i13 == 2) {
                            matrix2.postScale(1.0f, -1.0f);
                        }
                        matrix2.postRotate(this.f26346e, 0.0f, 0.0f);
                        matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                    } else {
                        rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                        int i14 = this.f26347f;
                        if (i14 == 1) {
                            matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                        } else if (i14 == 2) {
                            matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                        }
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                    matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    int i15 = this.f26347f;
                    if (i15 == 1) {
                        matrix2.postScale(-1.0f, 1.0f);
                    } else if (i15 == 2) {
                        matrix2.postScale(1.0f, -1.0f);
                    }
                    matrix2.postRotate(this.f26346e, 0.0f, 0.0f);
                    matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                }
                canvas.clipRect(this.f26344b / scaleY, this.d / scaleY, getWidth() - (this.f26345c / scaleY), getHeight() - (this.f26343a / scaleY));
                try {
                    canvas.drawBitmap(this.v.bitmap, matrix2, this.f26350s);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            canvas.restore();
        }
    }

    public void setAdditionalTranslationX(float f9) {
        this.L = f9;
    }

    public void setAdditionalTranslationY(float f9) {
        this.K = f9;
    }

    public void setAnimationProgress(float f9) {
        this.H = f9;
        float[][] fArr = this.J;
        float f10 = fArr[0][0];
        setScaleX(((fArr[1][0] - f10) * f9) + f10);
        float[][] fArr2 = this.J;
        float f11 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f11) * this.H) + f11);
        float[][] fArr3 = this.J;
        float f12 = fArr3[0][2];
        float f13 = this.L;
        setTranslationX(((((fArr3[1][2] + f13) - f12) - f13) * this.H) + f12 + f13);
        float[][] fArr4 = this.J;
        float f14 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f14) * this.H) + f14);
        float[][] fArr5 = this.J;
        float f15 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f15) * this.H) + f15));
        float[][] fArr6 = this.J;
        float f16 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f16) * this.H) + f16));
        float[][] fArr7 = this.J;
        float f17 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f17) * this.H) + f17));
        int i10 = 0;
        while (true) {
            int[] iArr = this.f26353y;
            if (i10 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.J;
            int i11 = i10 + 7;
            float f18 = fArr8[0][i11];
            iArr[i10] = (int) (((fArr8[1][i11] - f18) * this.H) + f18);
            setRadius(iArr);
            i10++;
        }
        float[][] fArr9 = this.J;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f19 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f19) * this.H) + f19));
            float[][] fArr11 = this.J;
            float f20 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f20) * this.H) + f20));
        }
        if (this.I) {
            if (!this.G) {
                f9 = 1.0f - f9;
            }
            setAlpha(f9);
        }
        invalidate();
    }

    public void setClipBottom(int i10) {
        this.f26343a = i10;
        invalidate();
    }

    public void setClipHorizontal(int i10) {
        this.f26345c = i10;
        this.f26344b = i10;
        invalidate();
    }

    public void setClipLeft(int i10) {
        this.f26344b = i10;
        invalidate();
    }

    public void setClipRight(int i10) {
        this.f26345c = i10;
        invalidate();
    }

    public void setClipTop(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setClipVertical(int i10) {
        this.f26343a = i10;
        this.d = i10;
        invalidate();
    }

    public void setImageBitmap(ImageReceiver.BitmapHolder bitmapHolder) {
        ImageReceiver.BitmapHolder bitmapHolder2 = this.v;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.A = null;
        }
        if (bitmapHolder != null && bitmapHolder.isRecycled()) {
            bitmapHolder = null;
        }
        this.v = bitmapHolder;
        if (bitmapHolder != null && bitmapHolder.bitmap != null) {
            this.D.set(0.0f, 0.0f, bitmapHolder.getWidth(), bitmapHolder.getHeight());
            Bitmap bitmap = this.v.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.A = bitmapShader;
            this.B.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i10) {
        this.f26348n = i10;
    }

    public void setImageY(int i10) {
        this.h = i10;
    }

    public void setOrientation(int i10) {
        this.f26346e = i10;
        this.f26347f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.f26353y;
        if (iArr == null) {
            this.f26352x = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f26352x = false;
        for (int i10 : iArr) {
            if (i10 != 0) {
                this.f26352x = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9 + this.K);
    }
}
