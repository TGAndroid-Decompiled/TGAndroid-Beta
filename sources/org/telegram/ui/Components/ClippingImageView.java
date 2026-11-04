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
    public static final float[] R = new float[8];
    public final int[] E;
    public BitmapShader F;
    public final Paint G;
    public final RectF H;
    public final RectF I;
    public final Matrix J;
    public final Path K;
    public boolean L;
    public float M;
    public boolean N;
    public float[][] O;
    public float P;
    public float Q;
    public int f31354a;
    public int f31355b;
    public int f31356c;
    public int d;
    public int f31357e;
    public int f31358f;
    public int h;
    public int f31359n;
    public final RectF f31360r;
    public final Paint f31361s;
    public org.telegram.messenger.cc f31362w;
    public final Matrix f31363x;
    public boolean f31364y;

    public ClippingImageView(Context context) {
        super(context);
        this.E = new int[4];
        this.K = new Path();
        Paint paint = new Paint(2);
        this.f31361s = paint;
        paint.setFilterBitmap(true);
        this.f31363x = new Matrix();
        this.f31360r = new RectF();
        this.I = new RectF();
        this.G = new Paint(3);
        this.H = new RectF();
        this.J = new Matrix();
    }

    public float getAnimationProgress() {
        return this.M;
    }

    public Bitmap getBitmap() {
        org.telegram.messenger.cc ccVar = this.f31362w;
        if (ccVar != null) {
            return ccVar.f22007c;
        }
        return null;
    }

    public org.telegram.messenger.cc getBitmapHolder() {
        return this.f31362w;
    }

    public float getCenterX() {
        float scaleY = getScaleY();
        float translationX = getTranslationX();
        float width = getWidth() - (this.f31356c / scaleY);
        return (getScaleX() * ((width + (this.f31355b / scaleY)) / 2.0f)) + translationX;
    }

    public float getCenterY() {
        float scaleY = getScaleY();
        float translationY = getTranslationY();
        float height = getHeight() - (this.f31354a / scaleY);
        return (getScaleY() * ((height + (this.d / scaleY)) / 2.0f)) + translationY;
    }

    public int getClipBottom() {
        return this.f31354a;
    }

    public int getClipHorizontal() {
        return this.f31356c;
    }

    public int getClipLeft() {
        return this.f31355b;
    }

    public int getClipRight() {
        return this.f31356c;
    }

    public int getClipTop() {
        return this.d;
    }

    public int getOrientation() {
        return this.f31357e;
    }

    public int[] getRadius() {
        return this.E;
    }

    @Override
    public float getTranslationY() {
        return super.getTranslationY() - this.P;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        org.telegram.messenger.cc ccVar;
        Bitmap bitmap;
        int i3;
        int i10;
        float height;
        float width;
        float height2;
        boolean z10;
        float[] fArr;
        if (getVisibility() == 0 && (ccVar = this.f31362w) != null && (bitmap = ccVar.f22007c) != null && !bitmap.isRecycled()) {
            float scaleY = getScaleY();
            canvas.save();
            boolean z11 = this.f31364y;
            RectF rectF = this.I;
            if (z11) {
                Matrix matrix = this.J;
                matrix.reset();
                RectF rectF2 = this.H;
                rectF2.set(this.f31359n / scaleY, this.h / scaleY, getWidth() - (this.f31359n / scaleY), getHeight() - (this.h / scaleY));
                Bitmap bitmap2 = this.f31362w.f22007c;
                int i11 = 0;
                if (bitmap2 != null) {
                    i3 = bitmap2.getWidth();
                } else {
                    i3 = 0;
                }
                float f10 = i3;
                Bitmap bitmap3 = this.f31362w.f22007c;
                if (bitmap3 != null) {
                    i10 = bitmap3.getHeight();
                } else {
                    i10 = 0;
                }
                rectF.set(0.0f, 0.0f, f10, i10);
                int i12 = this.f31357e;
                int i13 = this.f31358f;
                Typeface typeface = org.telegram.messenger.g0.f22580a;
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
                    z10 = true;
                } else {
                    z10 = false;
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
                if (z10) {
                    rectF2.width();
                    rectF.width();
                } else {
                    rectF2.height();
                    rectF.height();
                }
                matrix.preScale(height, height);
                this.F.setLocalMatrix(matrix);
                canvas.clipRect(this.f31355b / scaleY, this.d / scaleY, getWidth() - (this.f31356c / scaleY), getHeight() - (this.f31354a / scaleY));
                while (true) {
                    int[] iArr = this.E;
                    int length = iArr.length;
                    fArr = R;
                    if (i11 >= length) {
                        break;
                    }
                    int i14 = i11 * 2;
                    float f12 = iArr[i11];
                    fArr[i14] = f12;
                    fArr[i14 + 1] = f12;
                    i11++;
                }
                Path path = this.K;
                path.reset();
                path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                path.close();
                canvas.drawPath(path, this.G);
            } else {
                int i15 = this.f31357e;
                RectF rectF3 = this.f31360r;
                Matrix matrix2 = this.f31363x;
                if (i15 != 90 && i15 != 270) {
                    if (i15 == 180) {
                        rectF3.set((-getWidth()) / 2, (-getHeight()) / 2, getWidth() / 2, getHeight() / 2);
                        matrix2.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
                        int i16 = this.f31358f;
                        if (i16 == 1) {
                            matrix2.postScale(-1.0f, 1.0f);
                        } else if (i16 == 2) {
                            matrix2.postScale(1.0f, -1.0f);
                        }
                        matrix2.postRotate(this.f31357e, 0.0f, 0.0f);
                        matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                    } else {
                        rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                        int i17 = this.f31358f;
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
                    int i18 = this.f31358f;
                    if (i18 == 1) {
                        matrix2.postScale(-1.0f, 1.0f);
                    } else if (i18 == 2) {
                        matrix2.postScale(1.0f, -1.0f);
                    }
                    matrix2.postRotate(this.f31357e, 0.0f, 0.0f);
                    matrix2.postTranslate(getWidth() / 2, getHeight() / 2);
                }
                canvas.clipRect(this.f31355b / scaleY, this.d / scaleY, getWidth() - (this.f31356c / scaleY), getHeight() - (this.f31354a / scaleY));
                try {
                    canvas.drawBitmap(this.f31362w.f22007c, matrix2, this.f31361s);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            canvas.restore();
        }
    }

    public void setAdditionalTranslationX(float f10) {
        this.Q = f10;
    }

    public void setAdditionalTranslationY(float f10) {
        this.P = f10;
    }

    public void setAnimationProgress(float f10) {
        this.M = f10;
        float[][] fArr = this.O;
        float f11 = fArr[0][0];
        setScaleX(((fArr[1][0] - f11) * f10) + f11);
        float[][] fArr2 = this.O;
        float f12 = fArr2[0][1];
        setScaleY(((fArr2[1][1] - f12) * this.M) + f12);
        float[][] fArr3 = this.O;
        float f13 = fArr3[0][2];
        float f14 = this.Q;
        setTranslationX(((((fArr3[1][2] + f14) - f13) - f14) * this.M) + f13 + f14);
        float[][] fArr4 = this.O;
        float f15 = fArr4[0][3];
        setTranslationY(((fArr4[1][3] - f15) * this.M) + f15);
        float[][] fArr5 = this.O;
        float f16 = fArr5[0][4];
        setClipHorizontal((int) (((fArr5[1][4] - f16) * this.M) + f16));
        float[][] fArr6 = this.O;
        float f17 = fArr6[0][5];
        setClipTop((int) (((fArr6[1][5] - f17) * this.M) + f17));
        float[][] fArr7 = this.O;
        float f18 = fArr7[0][6];
        setClipBottom((int) (((fArr7[1][6] - f18) * this.M) + f18));
        int i3 = 0;
        while (true) {
            int[] iArr = this.E;
            if (i3 >= iArr.length) {
                break;
            }
            float[][] fArr8 = this.O;
            int i10 = i3 + 7;
            float f19 = fArr8[0][i10];
            iArr[i3] = (int) (((fArr8[1][i10] - f19) * this.M) + f19);
            setRadius(iArr);
            i3++;
        }
        float[][] fArr9 = this.O;
        float[] fArr10 = fArr9[0];
        if (fArr10.length > 11) {
            float f20 = fArr10[11];
            setImageY((int) (((fArr9[1][11] - f20) * this.M) + f20));
            float[][] fArr11 = this.O;
            float f21 = fArr11[0][12];
            setImageX((int) (((fArr11[1][12] - f21) * this.M) + f21));
        }
        if (this.N) {
            if (!this.L) {
                f10 = 1.0f - f10;
            }
            setAlpha(f10);
        }
        invalidate();
    }

    public void setClipBottom(int i3) {
        this.f31354a = i3;
        invalidate();
    }

    public void setClipHorizontal(int i3) {
        this.f31356c = i3;
        this.f31355b = i3;
        invalidate();
    }

    public void setClipLeft(int i3) {
        this.f31355b = i3;
        invalidate();
    }

    public void setClipRight(int i3) {
        this.f31356c = i3;
        invalidate();
    }

    public void setClipTop(int i3) {
        this.d = i3;
        invalidate();
    }

    public void setClipVertical(int i3) {
        this.f31354a = i3;
        this.d = i3;
        invalidate();
    }

    public void setImageBitmap(org.telegram.messenger.cc ccVar) {
        Bitmap bitmap;
        int i3;
        Bitmap bitmap2;
        org.telegram.messenger.cc ccVar2 = this.f31362w;
        if (ccVar2 != null) {
            ccVar2.a();
            this.F = null;
        }
        if (ccVar != null && ((bitmap2 = ccVar.f22007c) == null || bitmap2.isRecycled())) {
            ccVar = null;
        }
        this.f31362w = ccVar;
        if (ccVar != null && (bitmap = ccVar.f22007c) != null) {
            int i10 = 0;
            if (bitmap != null) {
                i3 = bitmap.getWidth();
            } else {
                i3 = 0;
            }
            float f10 = i3;
            Bitmap bitmap3 = ccVar.f22007c;
            if (bitmap3 != null) {
                i10 = bitmap3.getHeight();
            }
            this.I.set(0.0f, 0.0f, f10, i10);
            Bitmap bitmap4 = this.f31362w.f22007c;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
            this.F = bitmapShader;
            this.G.setShader(bitmapShader);
        }
        invalidate();
    }

    public void setImageX(int i3) {
        this.f31359n = i3;
    }

    public void setImageY(int i3) {
        this.h = i3;
    }

    public void setOrientation(int i3) {
        this.f31357e = i3;
        this.f31358f = 0;
    }

    public void setRadius(int[] iArr) {
        int[] iArr2 = this.E;
        if (iArr == null) {
            this.f31364y = false;
            Arrays.fill(iArr2, 0);
            return;
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f31364y = false;
        for (int i3 : iArr) {
            if (i3 != 0) {
                this.f31364y = true;
                return;
            }
        }
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10 + this.P);
    }
}
