package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;

public class s9 {

    public float f32356a;

    public float f32357b;

    public final Path f32358c;
    public final Paint d;

    public final float[] f32359e;

    public final float[] f32360f;

    public final float[] f32361g;
    public final float[] h;

    public final float[] f32362i;

    public final float[] f32363j;

    public final float[] f32364k;

    public final float[] f32365l;

    public final Random f32366m;

    public final float f32367n;

    public final float f32368o;

    public final float f32369p;

    public final Matrix f32370q;

    public final int f32371r;

    public float f32372s;

    public float f32373t;

    public float f32374u;

    public s9(int i10) {
        this(i10, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        if (!LiteMode.isEnabled(this.f32371r)) {
            return;
        }
        Path path = this.f32358c;
        path.reset();
        int i10 = 0;
        while (true) {
            float f12 = i10;
            float f13 = this.f32367n;
            if (f12 >= f13) {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
            float[] fArr = this.f32362i;
            float f14 = fArr[i10];
            int i11 = i10 + 1;
            int i12 = ((float) i11) < f13 ? i11 : 0;
            float f15 = fArr[i12];
            float[] fArr2 = this.f32359e;
            float f16 = 1.0f - f14;
            float f17 = fArr2[i10] * f16;
            float[] fArr3 = this.f32361g;
            float f18 = (fArr3[i10] * f14) + f17;
            float f19 = 1.0f - f15;
            float f20 = (fArr3[i12] * f15) + (fArr2[i12] * f19);
            float[] fArr4 = this.f32360f;
            float f21 = fArr4[i10] * f16;
            float[] fArr5 = this.h;
            float f22 = (fArr5[i10] * f14) + f21;
            float f23 = (fArr5[i12] * f15) + (fArr4[i12] * f19);
            float fMax = (((Math.max(f18, f20) - Math.min(f18, f20)) / 2.0f) + Math.min(f18, f20)) * this.f32368o * this.f32369p;
            Matrix matrix = this.f32370q;
            matrix.reset();
            matrix.setRotate(f22, f10, f11);
            float[] fArr6 = this.f32364k;
            fArr6[0] = f10;
            float f24 = f11 - f18;
            fArr6[1] = f24;
            fArr6[2] = f10 + fMax;
            fArr6[3] = f24;
            matrix.mapPoints(fArr6);
            float[] fArr7 = this.f32365l;
            fArr7[0] = f10;
            float f25 = f11 - f20;
            fArr7[1] = f25;
            fArr7[2] = f10 - fMax;
            fArr7[3] = f25;
            matrix.reset();
            matrix.setRotate(f23, f10, f11);
            matrix.mapPoints(fArr7);
            if (i10 == 0) {
                path.moveTo(fArr6[0], fArr6[1]);
            }
            path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
            i10 = i11;
        }
    }

    public final void b() {
        for (int i10 = 0; i10 < this.f32367n; i10++) {
            c(this.f32359e, this.f32360f, i10);
            c(this.f32361g, this.h, i10);
            this.f32362i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f10 = this.f32367n;
        float f11 = this.f32357b;
        float f12 = this.f32356a;
        Random random = this.f32366m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i10);
        this.f32363j[i10] = (float) ((((double) (Math.abs(random.nextInt() % 100.0f) / 100.0f)) * 0.003d) + 0.017d);
    }

    public final void d(float f10, boolean z10) {
        this.f32372s = f10;
        if (LiteMode.isEnabled(this.f32371r)) {
            if (z10) {
                float f11 = this.f32372s;
                float f12 = this.f32373t;
                if (f11 > f12) {
                    this.f32374u = (f11 - f12) / 205.0f;
                    return;
                } else {
                    this.f32374u = (f11 - f12) / 275.0f;
                    return;
                }
            }
            float f13 = this.f32372s;
            float f14 = this.f32373t;
            if (f13 > f14) {
                this.f32374u = (f13 - f14) / 320.0f;
            } else {
                this.f32374u = (f13 - f14) / 375.0f;
            }
        }
    }

    public final void e(float f10, float f11) {
        if (LiteMode.isEnabled(this.f32371r)) {
            for (int i10 = 0; i10 < this.f32367n; i10++) {
                float[] fArr = this.f32362i;
                float f12 = fArr[i10];
                float f13 = this.f32363j[i10];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i10] = f14;
                if (f14 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f32361g;
                    this.f32359e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f32360f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j10) {
        float f10 = this.f32372s;
        float f11 = this.f32373t;
        if (f10 != f11) {
            float f12 = this.f32374u;
            float f13 = (j10 * f12) + f11;
            this.f32373t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f32373t = f10;
                }
            } else if (f13 < f10) {
                this.f32373t = f10;
            }
        }
    }

    public s9(int i10, int i11) {
        this.f32358c = new Path();
        this.d = new Paint(1);
        this.f32364k = new float[4];
        this.f32365l = new float[4];
        this.f32366m = new Random();
        this.f32369p = 1.0f;
        this.f32370q = new Matrix();
        float f10 = i10;
        this.f32367n = f10;
        this.f32368o = (float) (Math.tan(3.141592653589793d / ((double) (f10 * 2.0f))) * 1.3333333333333333d);
        this.f32359e = new float[i10];
        this.f32360f = new float[i10];
        this.f32361g = new float[i10];
        this.h = new float[i10];
        this.f32362i = new float[i10];
        this.f32363j = new float[i10];
        for (int i12 = 0; i12 < this.f32367n; i12++) {
            c(this.f32359e, this.f32360f, i12);
            c(this.f32361g, this.h, i12);
            this.f32362i[i12] = 0.0f;
        }
        this.f32371r = i11;
    }
}
