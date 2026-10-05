package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class ca {
    public float f25322a;
    public float f25323b;
    public final Path f25324c;
    public final Paint d;
    public final float[] f25325e;
    public final float[] f25326f;
    public final float[] f25327g;
    public final float[] h;
    public final float[] f25328i;
    public final float[] f25329j;
    public final float[] f25330k;
    public final float[] f25331l;
    public final Random f25332m;
    public final float f25333n;
    public final float f25334o;
    public final float f25335p;
    public final Matrix f25336q;
    public final int f25337r;
    public float f25338s;
    public float f25339t;
    public float f25340u;

    public ca(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f25337r)) {
            return;
        }
        Path path = this.f25324c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f25333n;
            if (i11 < f11) {
                float[] fArr = this.f25328i;
                float f12 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f11) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f13 = fArr[i10];
                float[] fArr2 = this.f25325e;
                float f14 = 1.0f - f12;
                float[] fArr3 = this.f25327g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f25326f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f25334o * this.f25335p;
                Matrix matrix = this.f25336q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f25330k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f25331l;
                fArr7[0] = f7;
                float f21 = f10 - f17;
                fArr7[1] = f21;
                fArr7[2] = f7 - max;
                fArr7[3] = f21;
                matrix.reset();
                matrix.setRotate(f19, f7, f10);
                matrix.mapPoints(fArr7);
                if (i11 == 0) {
                    path.moveTo(fArr6[0], fArr6[1]);
                }
                path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
                i11 = i12;
            } else {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }

    public final void b() {
        for (int i10 = 0; i10 < this.f25333n; i10++) {
            c(this.f25325e, this.f25326f, i10);
            c(this.f25327g, this.h, i10);
            this.f25328i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f25333n;
        float f10 = this.f25323b;
        float f11 = this.f25322a;
        Random random = this.f25332m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f25329j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f25338s = f7;
        if (!LiteMode.isEnabled(this.f25337r)) {
            return;
        }
        if (z10) {
            float f10 = this.f25338s;
            float f11 = this.f25339t;
            if (f10 > f11) {
                this.f25340u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f25340u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f25338s;
        float f13 = this.f25339t;
        if (f12 > f13) {
            this.f25340u = (f12 - f13) / 320.0f;
        } else {
            this.f25340u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f25337r)) {
            for (int i10 = 0; i10 < this.f25333n; i10++) {
                float[] fArr = this.f25328i;
                float f11 = fArr[i10];
                float f12 = this.f25329j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f25327g;
                    this.f25325e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f25326f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f25338s;
        float f10 = this.f25339t;
        if (f7 != f10) {
            float f11 = this.f25340u;
            float f12 = (((float) j3) * f11) + f10;
            this.f25339t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f25339t = f7;
                }
            } else if (f12 < f7) {
                this.f25339t = f7;
            }
        }
    }

    public ca(int i10, int i11) {
        float f7;
        this.f25324c = new Path();
        this.d = new Paint(1);
        this.f25330k = new float[4];
        this.f25331l = new float[4];
        this.f25332m = new Random();
        this.f25335p = 1.0f;
        this.f25336q = new Matrix();
        this.f25333n = i10;
        this.f25334o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.f25325e = new float[i10];
        this.f25326f = new float[i10];
        this.f25327g = new float[i10];
        this.h = new float[i10];
        this.f25328i = new float[i10];
        this.f25329j = new float[i10];
        for (int i12 = 0; i12 < this.f25333n; i12++) {
            c(this.f25325e, this.f25326f, i12);
            c(this.f25327g, this.h, i12);
            this.f25328i[i12] = 0.0f;
        }
        this.f25337r = i11;
    }
}
