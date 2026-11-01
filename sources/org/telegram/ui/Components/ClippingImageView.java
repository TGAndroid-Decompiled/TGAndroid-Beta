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
import android.graphics.Typeface;
import android.view.View;
import java.util.Arrays;
public class ClippingImageView extends View {
    public static final float[] Q = new float[8];
    public final int[] D;
    public BitmapShader E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Matrix I;
    public final Path J;
    public boolean K;
    public float L;
    public boolean M;
    public float[][] N;
    public float O;
    public float P;
    public int f23939a;
    public int f23940b;
    public int f23941c;
    public int d;
    public int e;
    public int f23942f;
    public int h;
    public int f23943n;
    public final RectF f23944r;
    public final Paint f23945s;
    public org.telegram.messenger.lc f23946w;
    public final Matrix f23947x;
    public boolean f23948y;

    public ClippingImageView(Context context) {
        super(context);
        this.D = new int[4];
        this.J = new Path();
        Paint paint = new Paint(2);
        this.f23945s = paint;
        paint.setFilterBitmap(true);
        this.f23947x = new Matrix();
        this.f23944r = new RectF();
        this.H = new RectF();
        this.F = new Paint(3);
        this.G = new RectF();
        this.I = new Matrix();
    }

    public float getAnimationProgress() {
        return this.L;
    }

    public Bitmap getBitmap() {
        org.telegram.messenger.lc lcVar = this.f23946w;
        if (lcVar != null) {
            return lcVar.f16929c;
        }
        return null;
    }

    public org.telegram.messenger.lc getBitmapHolder() {
        return this.f23946w;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        float translationX = getTranslationX();
        float width = getWidth() - (this.f23941c / scaleY);
        return (getScaleX() * ((width + (this.f23940b / scaleY)) / 2.0f)) + translationX;
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float height = getHeight() - (this.f23939a / scaleY);
        return (getScaleY() * ((height + (this.d / scaleY)) / 2.0f)) + translationY;
    }

    public int getClipBottom() {
        return this.f23939a;
    }

    public int getClipHorizontal() {
        return this.f23941c;
    }

    public int getClipLeft() {
        return this.f23940b;
    }

    public int getClipRight() {
        return this.f23941c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.e;
    }

    public int[] getRadius() {
        return this.D;
    }

    @Override
    public float getTranslationY() {
        return super.getTranslationY() - this.O;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.messenger.lc lcVar;
        Bitmap bitmap;
        int i10;
        int i11;
        float height;
        float width;
        float height2;
        boolean z10;
        float[] fArr;
        if (getVisibility() == 0 && (lcVar = this.f23946w) != null && (bitmap = lcVar.f16929c) != null && !bitmap.isRecycled()) {
            float scaleY = getScaleY();
            canvas.save();
            boolean z11 = this.f23948y;
            RectF rectF = this.H;
            if (z11) {
                Matrix matrix = this.I;
                matrix.reset();
                RectF rectF2 = this.G;
                rectF2.set(this.f23943n / scaleY, this.h / scaleY, getWidth() - (this.f23943n / scaleY), getHeight() - (this.h / scaleY));
                Bitmap bitmap2 = this.f23946w.f16929c;
                int i12 = 0;
                if (bitmap2 != null) {
                    i10 = bitmap2.getWidth();
                } else {
                    i10 = 0;
                }
                float f7 = i10;
                Bitmap bitmap3 = this.f23946w.f16929c;
                if (bitmap3 != null) {
                    i11 = bitmap3.getHeight();
                } else {
                    i11 = 0;
                }
                rectF.set(0.0f, 0.0f, f7, i11);
                int i13 = this.e;
                int i14 = this.f23942f;
                Typeface typeface = org.telegram.messenger.i0.f16145a;
                if (i13 != 90 && i13 != 270) {
                    height = rectF2.width() / rectF.width();
                    width = rectF2.height();
                    height2 = rectF.height();
                } else {
                    height = rectF2.height() / rectF.width();
                    width = rectF2.width();
                    height2 = rectF.height();
                }
                float f10 = width / height2;
                if (height < f10) {
                    height = f10;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 == 90) {
                    matrix.preRotate(90.0f);
                    if (i14 == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    matrix.preTranslate(0.0f, -rectF2.width());
                } else if (i13 == 180) {
                    matrix.preRotate(180.0f);
                    if (i14 == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    matrix.preTranslate(-rectF2.width(), -rectF2.height());
                } else if (i13 == 270) {
                    matrix.preRotate(270.0f);
                    if (i14 == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i14 == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    matrix.preTranslate(-rectF2.height(), 0.0f);
                }
                if (z10) {
                    rectF2.width();
                    rectF.width();
                } else {
                    rectF2.height();
                    rectF.height();
                }
                matrix.preScale(height, height);
                this.E.setLocalMatrix(matrix);
                canvas.clipRect(this.f23940b / scaleY, this.d / scaleY, getWidth() - (this.f23941c / scaleY), getHeight() - (this.f23939a / scaleY));
                while (true) {
                    int[] iArr = this.D;
                    int length = iArr.length;
                    fArr = Q;
                    if (i12 >= length) {
                        break;
                    }
                    int i15 = i12 * 2;
                    float f11 = iArr[i12];
                    fArr[i15] = f11;
                    fArr[i15 + 1] = f11;
                    i12++;
                }
                Path path = this.J;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                path.close();
                canvas.drawPath(path, this.F);
            } else {
                int i16 = this.e;
                RectF rectF3 = this.f23944r;
                Matrix matrix2 = this.f23947x;
                if (i16 != 90 && i16 != 270) {
                    if (i16 == 180) {
                        rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                        int i17 = this.f23942f;
                        if (i17 == 1) {
                            matrix2.postScale(-1.0f, 1.0f);
                        } else if (i17 == 2) {
                            matrix2.postScale(1.0f, -1.0f);
                        }
                        matrix2.postRotate(this.e, 0.0f, 0.0f);
                        matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                    } else {
                        rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                        int i18 = this.f23942f;
                        if (i18 == 1) {
                            matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                        } else if (i18 == 2) {
                            matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                        }
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                    matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    int i19 = this.f23942f;
                    if (i19 == 1) {
                        matrix2.postScale(-1.0f, 1.0f);
                    } else if (i19 == 2) {
                        matrix2.postScale(1.0f, -1.0f);
                    }
                    matrix2.postRotate(this.e, 0.0f, 0.0f);
                    matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                }
                canvas.clipRect(this.f23940b / scaleY, this.d / scaleY, getWidth() - (this.f23941c / scaleY), getHeight() - (this.f23939a / scaleY));
                try {
                    canvas.drawBitmap(this.f23946w.f16929c, matrix2, this.f23945s);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            canvas.restore();
        }
    }

    public void setAdditionalTranslationX(float f7) {
        this.P = f7;
    }

    public void setAdditionalTranslationY(float f7) {
        this.O = f7;
    }

    public void setAnimationProgress(float f7) {
        this.L = f7;
        float[][] fArr = this.N;
        float f10 = fArr[0][0];
        setScaleX(((fArr[1][0] - f10) * f7) + f10);
        float[][] fArr2 = this.N;
        float f11 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f11) * this.L) + f11);
        float[][] fArr3 = this.N;
        float f12 = fArr3[0][2];
        float f13 = this.P;
        setTranslationX(((((fArr3[1][2] + f13) - f12) - f13) * this.L) + f12 + f13);
        float[][] fArr4 = this.N;
        float f14 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f14) * this.L) + f14);
        float[][] fArr5 = this.N;
        float f15 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f15) * this.L) + f15));
        float[][] fArr6 = this.N;
        float f16 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f16) * this.L) + f16));
        float[][] fArr7 = this.N;
        float f17 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f17) * this.L) + f17));
        int i10 = 0;
        while (true) {
            int[] iArr = this.D;
            if (i10 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.N;
            int i11 = i10 + 7;
            float f18 = fArr8[0][i11];
            iArr[i10] = (int) (((fArr8[1][i11] - f18) * this.L) + f18);
            setRadius(iArr);
            i10++;
        }
        float[][] fArr9 = this.N;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f19 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f19) * this.L) + f19));
            float[][] fArr11 = this.N;
            float f20 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f20) * this.L) + f20));
        }
        if (this.M) {
            if (!this.K) {
                f7 = 1.0f - f7;
            }
            setAlpha(f7);
        }
        invalidate();
    }

    public void setClipBottom(int i10) {
        this.f23939a = i10;
        invalidate();
    }

    public void setClipHorizontal(int i10) {
        this.f23941c = i10;
        this.f23940b = i10;
        invalidate();
    }

    public void setClipLeft(int i10) {
        this.f23940b = i10;
        invalidate();
    }

    public void setClipRight(int i10) {
        this.f23941c = i10;
        invalidate();
    }

    public void setClipTop(int i10) {
        this.d = i10;
        invalidate();
    }

    public void setClipVertical(int i10) {
        this.f23939a = i10;
        this.d = i10;
        invalidate();
    }

    public void setImageBitmap(org.telegram.messenger.lc lcVar) {
        Bitmap bitmap;
        int i10;
        Bitmap bitmap2;
        org.telegram.messenger.lc lcVar2 = this.f23946w;
        if (lcVar2 != null) {
            lcVar2.a();
            this.E = null;
        }
        if (lcVar != null && ((bitmap2 = lcVar.f16929c) == null || bitmap2.isRecycled())) {
            lcVar = null;
        }
        this.f23946w = lcVar;
        if (lcVar != null && (bitmap = lcVar.f16929c) != null) {
            int i11 = 0;
            if (bitmap != null) {
                i10 = bitmap.getWidth();
            } else {
                i10 = 0;
            }
            float f7 = i10;
            Bitmap bitmap3 = lcVar.f16929c;
            if (bitmap3 != null) {
                i11 = bitmap3.getHeight();
            }
            this.H.set(0.0f, 0.0f, f7, i11);
            Bitmap bitmap4 = this.f23946w.f16929c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
            this.E = bitmapShader;
            this.F.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i10) {
        this.f23943n = i10;
    }

    public void setImageY(int i10) {
        this.h = i10;
    }

    public void setOrientation(int i10) {
        this.e = i10;
        this.f23942f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.D;
        if (iArr == null) {
            this.f23948y = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f23948y = false;
        for (int i10 : iArr) {
            if (i10 != 0) {
                this.f23948y = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7 + this.O);
    }
}
