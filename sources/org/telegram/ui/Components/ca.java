package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class ca {
    public float f23220a;
    public float f23221b;
    public final Path f23222c;
    public final Paint d;
    public final float[] e;
    public final float[] f23223f;
    public final float[] f23224g;
    public final float[] h;
    public final float[] f23225i;
    public final float[] f23226j;
    public final float[] f23227k;
    public final float[] f23228l;
    public final Random f23229m;
    public final float f23230n;
    public final float f23231o;
    public final float f23232p;
    public final Matrix f23233q;
    public final int f23234r;
    public float f23235s;
    public float f23236t;
    public float f23237u;

    public ca(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f23234r)) {
            return;
        }
        Path path = this.f23222c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f23230n;
            if (i11 < f11) {
                float[] fArr = this.f23225i;
                float f12 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f11) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f13 = fArr[i10];
                float[] fArr2 = this.e;
                float f14 = 1.0f - f12;
                float[] fArr3 = this.f23224g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f23223f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f23231o * this.f23232p;
                Matrix matrix = this.f23233q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f23227k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f23228l;
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
        for (int i10 = 0; i10 < this.f23230n; i10++) {
            c(this.e, this.f23223f, i10);
            c(this.f23224g, this.h, i10);
            this.f23225i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f23230n;
        float f10 = this.f23221b;
        float f11 = this.f23220a;
        Random random = this.f23229m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f23226j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f23235s = f7;
        if (!LiteMode.isEnabled(this.f23234r)) {
            return;
        }
        if (z10) {
            float f10 = this.f23235s;
            float f11 = this.f23236t;
            if (f10 > f11) {
                this.f23237u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f23237u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f23235s;
        float f13 = this.f23236t;
        if (f12 > f13) {
            this.f23237u = (f12 - f13) / 320.0f;
        } else {
            this.f23237u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f23234r)) {
            for (int i10 = 0; i10 < this.f23230n; i10++) {
                float[] fArr = this.f23225i;
                float f11 = fArr[i10];
                float f12 = this.f23226j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f23224g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f23223f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f23235s;
        float f10 = this.f23236t;
        if (f7 != f10) {
            float f11 = this.f23237u;
            float f12 = (((float) j3) * f11) + f10;
            this.f23236t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f23236t = f7;
                }
            } else if (f12 < f7) {
                this.f23236t = f7;
            }
        }
    }

    public ca(int i10, int i11) {
        float f7;
        this.f23222c = new Path();
        this.d = new Paint(1);
        this.f23227k = new float[4];
        this.f23228l = new float[4];
        this.f23229m = new Random();
        this.f23232p = 1.0f;
        this.f23233q = new Matrix();
        this.f23230n = i10;
        this.f23231o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f23223f = new float[i10];
        this.f23224g = new float[i10];
        this.h = new float[i10];
        this.f23225i = new float[i10];
        this.f23226j = new float[i10];
        for (int i12 = 0; i12 < this.f23230n; i12++) {
            c(this.e, this.f23223f, i12);
            c(this.f23224g, this.h, i12);
            this.f23225i[i12] = 0.0f;
        }
        this.f23234r = i11;
    }
}
