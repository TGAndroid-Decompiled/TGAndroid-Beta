package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class z9 {
    public float f30504a;
    public float f30505b;
    public final Path f30506c;
    public final Paint d;
    public final float[] e;
    public final float[] f30507f;
    public final float[] f30508g;
    public final float[] h;
    public final float[] f30509i;
    public final float[] f30510j;
    public final float[] f30511k;
    public final float[] f30512l;
    public final Random f30513m;
    public final float f30514n;
    public final float f30515o;
    public final float f30516p;
    public final Matrix f30517q;
    public final int f30518r;
    public float f30519s;
    public float f30520t;
    public float f30521u;

    public z9(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f30518r)) {
            return;
        }
        Path path = this.f30506c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f30514n;
            if (i11 < f11) {
                float[] fArr = this.f30509i;
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
                float[] fArr3 = this.f30508g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f30507f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f30515o * this.f30516p;
                Matrix matrix = this.f30517q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f30511k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f30512l;
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
        for (int i10 = 0; i10 < this.f30514n; i10++) {
            c(this.e, this.f30507f, i10);
            c(this.f30508g, this.h, i10);
            this.f30509i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f30514n;
        float f10 = this.f30505b;
        float f11 = this.f30504a;
        Random random = this.f30513m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f30510j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f30519s = f7;
        if (!LiteMode.isEnabled(this.f30518r)) {
            return;
        }
        if (z10) {
            float f10 = this.f30519s;
            float f11 = this.f30520t;
            if (f10 > f11) {
                this.f30521u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f30521u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f30519s;
        float f13 = this.f30520t;
        if (f12 > f13) {
            this.f30521u = (f12 - f13) / 320.0f;
        } else {
            this.f30521u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f30518r)) {
            for (int i10 = 0; i10 < this.f30514n; i10++) {
                float[] fArr = this.f30509i;
                float f11 = fArr[i10];
                float f12 = this.f30510j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f30508g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f30507f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f30519s;
        float f10 = this.f30520t;
        if (f7 != f10) {
            float f11 = this.f30521u;
            float f12 = (((float) j3) * f11) + f10;
            this.f30520t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f30520t = f7;
                }
            } else if (f12 < f7) {
                this.f30520t = f7;
            }
        }
    }

    public z9(int i10, int i11) {
        float f7;
        this.f30506c = new Path();
        this.d = new Paint(1);
        this.f30511k = new float[4];
        this.f30512l = new float[4];
        this.f30513m = new Random();
        this.f30516p = 1.0f;
        this.f30517q = new Matrix();
        this.f30514n = i10;
        this.f30515o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f30507f = new float[i10];
        this.f30508g = new float[i10];
        this.h = new float[i10];
        this.f30509i = new float[i10];
        this.f30510j = new float[i10];
        for (int i12 = 0; i12 < this.f30514n; i12++) {
            c(this.e, this.f30507f, i12);
            c(this.f30508g, this.h, i12);
            this.f30509i[i12] = 0.0f;
        }
        this.f30518r = i11;
    }
}
