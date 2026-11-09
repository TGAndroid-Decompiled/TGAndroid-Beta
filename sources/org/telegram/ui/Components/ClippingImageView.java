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
    public int f31288a;
    public int f31289b;
    public int f31290c;
    public int d;
    public int f31291e;
    public int f31292f;
    public int h;
    public int f31293n;
    public final RectF f31294r;
    public final Paint f31295s;
    public org.telegram.messenger.jc f31296w;
    public final Matrix f31297x;
    public boolean f31298y;

    public ClippingImageView(Context context) {
        super(context);
        this.D = new int[4];
        this.J = new Path();
        Paint paint = new Paint(2);
        this.f31295s = paint;
        paint.setFilterBitmap(true);
        this.f31297x = new Matrix();
        this.f31294r = new RectF();
        this.H = new RectF();
        this.F = new Paint(3);
        this.G = new RectF();
        this.I = new Matrix();
    }

    public float getAnimationProgress() {
        return this.L;
    }

    public Bitmap getBitmap() {
        org.telegram.messenger.jc jcVar = this.f31296w;
        if (jcVar != null) {
            return jcVar.f23535c;
        }
        return null;
    }

    public org.telegram.messenger.jc getBitmapHolder() {
        return this.f31296w;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        float translationX = getTranslationX();
        float width = getWidth() - (this.f31290c / scaleY);
        return (getScaleX() * ((width + (this.f31289b / scaleY)) / 2.0f)) + translationX;
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float height = getHeight() - (this.f31288a / scaleY);
        return (getScaleY() * ((height + (this.d / scaleY)) / 2.0f)) + translationY;
    }

    public int getClipBottom() {
        return this.f31288a;
    }

    public int getClipHorizontal() {
        return this.f31290c;
    }

    public int getClipLeft() {
        return this.f31289b;
    }

    public int getClipRight() {
        return this.f31290c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.f31291e;
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
        org.telegram.messenger.jc jcVar;
        Bitmap bitmap;
        int i7;
        int i10;
        float height;
        float width;
        float height2;
        boolean z9;
        float[] fArr;
        if (getVisibility() == 0 && (jcVar = this.f31296w) != null && (bitmap = jcVar.f23535c) != null && !bitmap.isRecycled()) {
            float scaleY = getScaleY();
            canvas.save();
            boolean z10 = this.f31298y;
            RectF rectF = this.H;
            if (z10) {
                Matrix matrix = this.I;
                matrix.reset();
                RectF rectF2 = this.G;
                rectF2.set(this.f31293n / scaleY, this.h / scaleY, getWidth() - (this.f31293n / scaleY), getHeight() - (this.h / scaleY));
                Bitmap bitmap2 = this.f31296w.f23535c;
                int i11 = 0;
                if (bitmap2 != null) {
                    i7 = bitmap2.getWidth();
                } else {
                    i7 = 0;
                }
                float f10 = i7;
                Bitmap bitmap3 = this.f31296w.f23535c;
                if (bitmap3 != null) {
                    i10 = bitmap3.getHeight();
                } else {
                    i10 = 0;
                }
                rectF.set(0.0f, 0.0f, f10, i10);
                int i12 = this.f31291e;
                int i13 = this.f31292f;
                Typeface typeface = org.telegram.messenger.g0.f22535a;
                if (i12 != 90 && i12 != 270) {
                    height = rectF2.width() / rectF.width();
                    width = rectF2.height();
                    height2 = rectF.height();
                } else {
                    height = rectF2.height() / rectF.width();
                    width = rectF2.width();
                    height2 = rectF.height();
                }
                float f11 = width / height2;
                if (height < f11) {
                    height = f11;
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i12 == 90) {
                    matrix.preRotate(90.0f);
                    if (i13 == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i13 == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    matrix.preTranslate(0.0f, -rectF2.width());
                } else if (i12 == 180) {
                    matrix.preRotate(180.0f);
                    if (i13 == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i13 == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    matrix.preTranslate(-rectF2.width(), -rectF2.height());
                } else if (i12 == 270) {
                    matrix.preRotate(270.0f);
                    if (i13 == 1) {
                        matrix.preScale(-1.0f, 1.0f);
                    } else if (i13 == 2) {
                        matrix.preScale(1.0f, -1.0f);
                    }
                    matrix.preTranslate(-rectF2.height(), 0.0f);
                }
                if (z9) {
                    rectF2.width();
                    rectF.width();
                } else {
                    rectF2.height();
                    rectF.height();
                }
                matrix.preScale(height, height);
                this.E.setLocalMatrix(matrix);
                canvas.clipRect(this.f31289b / scaleY, this.d / scaleY, getWidth() - (this.f31290c / scaleY), getHeight() - (this.f31288a / scaleY));
                while (true) {
                    int[] iArr = this.D;
                    int length = iArr.length;
                    fArr = Q;
                    if (i11 >= length) {
                        break;
                    }
                    int i14 = i11 * 2;
                    float f12 = iArr[i11];
                    fArr[i14] = f12;
                    fArr[i14 + 1] = f12;
                    i11++;
                }
                Path path = this.J;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                path.close();
                canvas.drawPath(path, this.F);
            } else {
                int i15 = this.f31291e;
                RectF rectF3 = this.f31294r;
                Matrix matrix2 = this.f31297x;
                if (i15 != 90 && i15 != 270) {
                    if (i15 == 180) {
                        rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                        int i16 = this.f31292f;
                        if (i16 == 1) {
                            matrix2.postScale(-1.0f, 1.0f);
                        } else if (i16 == 2) {
                            matrix2.postScale(1.0f, -1.0f);
                        }
                        matrix2.postRotate(this.f31291e, 0.0f, 0.0f);
                        matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                    } else {
                        rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                        int i17 = this.f31292f;
                        if (i17 == 1) {
                            matrix2.postScale(-1.0f, 1.0f, getWidth() / 2, getHeight() / 2);
                        } else if (i17 == 2) {
                            matrix2.postScale(1.0f, -1.0f, getWidth() / 2, getHeight() / 2);
                        }
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    }
                } else {
                    rectF3.set((-getHeight()) / 2, (-getWidth()) / 2, getHeight() / 2, getWidth() / 2);
                    matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                    int i18 = this.f31292f;
                    if (i18 == 1) {
                        matrix2.postScale(-1.0f, 1.0f);
                    } else if (i18 == 2) {
                        matrix2.postScale(1.0f, -1.0f);
                    }
                    matrix2.postRotate(this.f31291e, 0.0f, 0.0f);
                    matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                }
                canvas.clipRect(this.f31289b / scaleY, this.d / scaleY, getWidth() - (this.f31290c / scaleY), getHeight() - (this.f31288a / scaleY));
                try {
                    canvas.drawBitmap(this.f31296w.f23535c, matrix2, this.f31295s);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            canvas.restore();
        }
    }

    public void setAdditionalTranslationX(float f10) {
        this.P = f10;
    }

    public void setAdditionalTranslationY(float f10) {
        this.O = f10;
    }

    public void setAnimationProgress(float f10) {
        this.L = f10;
        float[][] fArr = this.N;
        float f11 = fArr[0][0];
        setScaleX(((fArr[1][0] - f11) * f10) + f11);
        float[][] fArr2 = this.N;
        float f12 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f12) * this.L) + f12);
        float[][] fArr3 = this.N;
        float f13 = fArr3[0][2];
        float f14 = this.P;
        setTranslationX(((((fArr3[1][2] + f14) - f13) - f14) * this.L) + f13 + f14);
        float[][] fArr4 = this.N;
        float f15 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f15) * this.L) + f15);
        float[][] fArr5 = this.N;
        float f16 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f16) * this.L) + f16));
        float[][] fArr6 = this.N;
        float f17 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f17) * this.L) + f17));
        float[][] fArr7 = this.N;
        float f18 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f18) * this.L) + f18));
        int i7 = 0;
        while (true) {
            int[] iArr = this.D;
            if (i7 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.N;
            int i10 = i7 + 7;
            float f19 = fArr8[0][i10];
            iArr[i7] = (int) (((fArr8[1][i10] - f19) * this.L) + f19);
            setRadius(iArr);
            i7++;
        }
        float[][] fArr9 = this.N;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f20 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f20) * this.L) + f20));
            float[][] fArr11 = this.N;
            float f21 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f21) * this.L) + f21));
        }
        if (this.M) {
            if (!this.K) {
                f10 = 1.0f - f10;
            }
            setAlpha(f10);
        }
        invalidate();
    }

    public void setClipBottom(int i7) {
        this.f31288a = i7;
        invalidate();
    }

    public void setClipHorizontal(int i7) {
        this.f31290c = i7;
        this.f31289b = i7;
        invalidate();
    }

    public void setClipLeft(int i7) {
        this.f31289b = i7;
        invalidate();
    }

    public void setClipRight(int i7) {
        this.f31290c = i7;
        invalidate();
    }

    public void setClipTop(int i7) {
        this.d = i7;
        invalidate();
    }

    public void setClipVertical(int i7) {
        this.f31288a = i7;
        this.d = i7;
        invalidate();
    }

    public void setImageBitmap(org.telegram.messenger.jc jcVar) {
        Bitmap bitmap;
        int i7;
        Bitmap bitmap2;
        org.telegram.messenger.jc jcVar2 = this.f31296w;
        if (jcVar2 != null) {
            jcVar2.a();
            this.E = null;
        }
        if (jcVar != null && ((bitmap2 = jcVar.f23535c) == null || bitmap2.isRecycled())) {
            jcVar = null;
        }
        this.f31296w = jcVar;
        if (jcVar != null && (bitmap = jcVar.f23535c) != null) {
            int i10 = 0;
            if (bitmap != null) {
                i7 = bitmap.getWidth();
            } else {
                i7 = 0;
            }
            float f10 = i7;
            Bitmap bitmap3 = jcVar.f23535c;
            if (bitmap3 != null) {
                i10 = bitmap3.getHeight();
            }
            this.H.set(0.0f, 0.0f, f10, i10);
            Bitmap bitmap4 = this.f31296w.f23535c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
            this.E = bitmapShader;
            this.F.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i7) {
        this.f31293n = i7;
    }

    public void setImageY(int i7) {
        this.h = i7;
    }

    public void setOrientation(int i7) {
        this.f31291e = i7;
        this.f31292f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.D;
        if (iArr == null) {
            this.f31298y = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f31298y = false;
        for (int i7 : iArr) {
            if (i7 != 0) {
                this.f31298y = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10 + this.O);
    }
}
