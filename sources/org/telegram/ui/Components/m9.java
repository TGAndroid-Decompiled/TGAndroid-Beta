package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public class m9 {
    public float f28380a;
    public float f28381b;
    public final Path f28382c;
    public final Paint d;
    public final float[] e;
    public final float[] f28383f;
    public final float[] f28384g;
    public final float[] h;
    public final float[] f28385i;
    public final float[] f28386j;
    public final float[] f28387k;
    public final float[] f28388l;
    public final Random f28389m;
    public final float f28390n;
    public final float f28391o;
    public final float f28392p;
    public final Matrix f28393q;
    public final int f28394r;
    public float f28395s;
    public float f28396t;
    public float f28397u;

    public m9(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!org.telegram.messenger.sc.e(this.f28394r)) {
            return;
        }
        Path path = this.f28382c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f28390n;
            if (i11 < f11) {
                float[] fArr = this.f28385i;
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
                float[] fArr3 = this.f28384g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f28383f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f28391o * this.f28392p;
                Matrix matrix = this.f28393q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f28387k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f28388l;
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
        for (int i10 = 0; i10 < this.f28390n; i10++) {
            c(this.e, this.f28383f, i10);
            c(this.f28384g, this.h, i10);
            this.f28385i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f28390n;
        float f10 = this.f28381b;
        float f11 = this.f28380a;
        Random random = this.f28389m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f28386j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(boolean z10, float f7) {
        this.f28395s = f7;
        if (!org.telegram.messenger.sc.e(this.f28394r)) {
            return;
        }
        if (z10) {
            float f10 = this.f28395s;
            float f11 = this.f28396t;
            if (f10 > f11) {
                this.f28397u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f28397u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f28395s;
        float f13 = this.f28396t;
        if (f12 > f13) {
            this.f28397u = (f12 - f13) / 320.0f;
        } else {
            this.f28397u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (org.telegram.messenger.sc.e(this.f28394r)) {
            for (int i10 = 0; i10 < this.f28390n; i10++) {
                float[] fArr = this.f28385i;
                float f11 = fArr[i10];
                float f12 = this.f28386j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f28384g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f28383f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j10) {
        float f7 = this.f28395s;
        float f10 = this.f28396t;
        if (f7 != f10) {
            float f11 = this.f28397u;
            float f12 = (((float) j10) * f11) + f10;
            this.f28396t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f28396t = f7;
                }
            } else if (f12 < f7) {
                this.f28396t = f7;
            }
        }
    }

    public m9(int i10, int i11) {
        float f7;
        this.f28382c = new Path();
        this.d = new Paint(1);
        this.f28387k = new float[4];
        this.f28388l = new float[4];
        this.f28389m = new Random();
        this.f28392p = 1.0f;
        this.f28393q = new Matrix();
        this.f28390n = i10;
        this.f28391o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f28383f = new float[i10];
        this.f28384g = new float[i10];
        this.h = new float[i10];
        this.f28385i = new float[i10];
        this.f28386j = new float[i10];
        for (int i12 = 0; i12 < this.f28390n; i12++) {
            c(this.e, this.f28383f, i12);
            c(this.f28384g, this.h, i12);
            this.f28385i[i12] = 0.0f;
        }
        this.f28394r = i11;
    }
}
