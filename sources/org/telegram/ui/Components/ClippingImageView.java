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
    public static final float[] N = new float[8];
    public BitmapShader B;
    public final Paint C;
    public final RectF D;
    public final RectF E;
    public final Matrix F;
    public final Path G;
    public boolean H;
    public float I;
    public boolean J;
    public float[][] K;
    public float L;
    public float M;
    public int f24828a;
    public int f24829b;
    public int f24830c;
    public int d;
    public int f24831e;
    public int f24832f;
    public int h;
    public int f24833n;
    public final RectF f24834r;
    public final Paint f24835s;
    public ImageReceiver.BitmapHolder v;
    public final Matrix f24836w;
    public boolean f24837x;
    public final int[] f24838y;

    public ClippingImageView(Context context) {
        super(context);
        this.f24838y = new int[4];
        this.G = new Path();
        Paint paint = new Paint(2);
        this.f24835s = paint;
        paint.setFilterBitmap(true);
        this.f24836w = new Matrix();
        this.f24834r = new RectF();
        this.E = new RectF();
        this.C = new Paint(3);
        this.D = new RectF();
        this.F = new Matrix();
    }

    public float getAnimationProgress() {
        return this.I;
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
        float width = getWidth() - (this.f24830c / scaleY);
        return (getScaleX() * ((width + (this.f24829b / scaleY)) / 2.0f)) + translationX;
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float height = getHeight() - (this.f24828a / scaleY);
        return (getScaleY() * ((height + (this.d / scaleY)) / 2.0f)) + translationY;
    }

    public int getClipBottom() {
        return this.f24828a;
    }

    public int getClipHorizontal() {
        return this.f24830c;
    }

    public int getClipLeft() {
        return this.f24829b;
    }

    public int getClipRight() {
        return this.f24830c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.f24831e;
    }

    public int[] getRadius() {
        return this.f24838y;
    }

    @Override
    public float getTranslationY() {
        return super.getTranslationY() - this.L;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver.BitmapHolder bitmapHolder;
        float[] fArr;
        if (getVisibility() == 0 && (bitmapHolder = this.v) != null && !bitmapHolder.isRecycled()) {
            float scaleY = getScaleY();
            canvas.save();
            boolean z4 = this.f24837x;
            RectF rectF = this.E;
            if (z4) {
                Matrix matrix = this.F;
                matrix.reset();
                RectF rectF2 = this.D;
                rectF2.set(this.f24833n / scaleY, this.h / scaleY, getWidth() - (this.f24833n / scaleY), getHeight() - (this.h / scaleY));
                rectF.set(0.0f, 0.0f, this.v.getWidth(), this.v.getHeight());
                AndroidUtilities.setRectToRect(matrix, rectF, rectF2, this.f24831e, this.f24832f, false);
                this.B.setLocalMatrix(matrix);
                canvas.clipRect(this.f24829b / scaleY, this.d / scaleY, getWidth() - (this.f24830c / scaleY), getHeight() - (this.f24828a / scaleY));
                int i10 = 0;
                while (true) {
                    int[] iArr = this.f24838y;
                    int length = iArr.length;
                    fArr = N;
                    if (i10 >= length) {
                        break;
                    }
                    int i11 = i10 * 2;
                    float f10 = iArr[i10];
                    fArr[i11] = f10;
                    fArr[i11 + 1] = f10;
                    i10++;
                }
                Path path = this.G;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                path.close();
                canvas.drawPath(path, this.C);
            } else {
                int i12 = this.f24831e;
                RectF rectF3 = this.f24834r;
                Matrix matrix2 = this.f24836w;
                if (i12 != 90 && i12 != 270) {
                    if (i12 == 180) {
                        rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                        int i13 = this.f24832f;
                        if (i13 == 1) {
                            matrix2.postScale(-1.0f, 1.0f);
                        } else if (i13 == 2) {
                            matrix2.postScale(1.0f, -1.0f);
                        }
                        matrix2.postRotate(this.f24831e, 0.0f, 0.0f);
                        matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                    } else {
                        rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                        int i14 = this.f24832f;
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
                    int i15 = this.f24832f;
                    if (i15 == 1) {
                        matrix2.postScale(-1.0f, 1.0f);
                    } else if (i15 == 2) {
                        matrix2.postScale(1.0f, -1.0f);
                    }
                    matrix2.postRotate(this.f24831e, 0.0f, 0.0f);
                    matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                }
                canvas.clipRect(this.f24829b / scaleY, this.d / scaleY, getWidth() - (this.f24830c / scaleY), getHeight() - (this.f24828a / scaleY));
                try {
                    canvas.drawBitmap(this.v.bitmap, matrix2, this.f24835s);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            canvas.restore();
        }
    }

    public void setAdditionalTranslationX(float f10) {
        this.M = f10;
    }

    public void setAdditionalTranslationY(float f10) {
        this.L = f10;
    }

    public void setAnimationProgress(float f10) {
        this.I = f10;
        float[][] fArr = this.K;
        float f11 = fArr[0][0];
        setScaleX(((fArr[1][0] - f11) * f10) + f11);
        float[][] fArr2 = this.K;
        float f12 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f12) * this.I) + f12);
        float[][] fArr3 = this.K;
        float f13 = fArr3[0][2];
        float f14 = this.M;
        setTranslationX(((((fArr3[1][2] + f14) - f13) - f14) * this.I) + f13 + f14);
        float[][] fArr4 = this.K;
        float f15 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f15) * this.I) + f15);
        float[][] fArr5 = this.K;
        float f16 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f16) * this.I) + f16));
        float[][] fArr6 = this.K;
        float f17 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f17) * this.I) + f17));
        float[][] fArr7 = this.K;
        float f18 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f18) * this.I) + f18));
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24838y;
            if (i10 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.K;
            int i11 = i10 + 7;
            float f19 = fArr8[0][i11];
            iArr[i10] = (int) (((fArr8[1][i11] - f19) * this.I) + f19);
            setRadius(iArr);
            i10++;
        }
        float[][] fArr9 = this.K;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f20 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f20) * this.I) + f20));
            float[][] fArr11 = this.K;
            float f21 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f21) * this.I) + f21));
        }
        if (this.J) {
            if (!this.H) {
                f10 = 1.0f - f10;
            }
            setAlpha(f10);
        }
        invalidate();
    }

    public void setClipBottom(int i10) {
        this.f24828a = i10;
        invalidate();
    }

    public void setClipHorizontal(int i10) {
        this.f24830c = i10;
        this.f24829b = i10;
        invalidate();
    }

    public void setClipLeft(int i10) {
        this.f24829b = i10;
        invalidate();
    }

    public void setClipRight(int i10) {
        this.f24830c = i10;
        invalidate();
    }

    public void setClipTop(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setClipVertical(int i10) {
        this.f24828a = i10;
        this.d = i10;
        invalidate();
    }

    public void setImageBitmap(ImageReceiver.BitmapHolder bitmapHolder) {
        ImageReceiver.BitmapHolder bitmapHolder2 = this.v;
        if (bitmapHolder2 != null) {
            bitmapHolder2.release();
            this.B = null;
        }
        if (bitmapHolder != null && bitmapHolder.isRecycled()) {
            bitmapHolder = null;
        }
        this.v = bitmapHolder;
        if (bitmapHolder != null && bitmapHolder.bitmap != null) {
            this.E.set(0.0f, 0.0f, bitmapHolder.getWidth(), bitmapHolder.getHeight());
            Bitmap bitmap = this.v.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.B = bitmapShader;
            this.C.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i10) {
        this.f24833n = i10;
    }

    public void setImageY(int i10) {
        this.h = i10;
    }

    public void setOrientation(int i10) {
        this.f24831e = i10;
        this.f24832f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.f24838y;
        if (iArr == null) {
            this.f24837x = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f24837x = false;
        for (int i10 : iArr) {
            if (i10 != 0) {
                this.f24837x = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10 + this.L);
    }
}
