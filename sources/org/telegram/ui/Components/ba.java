package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class ba {
    public float f22925a;
    public float f22926b;
    public final Path f22927c;
    public final Paint d;
    public final float[] e;
    public final float[] f22928f;
    public final float[] f22929g;
    public final float[] h;
    public final float[] f22930i;
    public final float[] f22931j;
    public final float[] f22932k;
    public final float[] f22933l;
    public final Random f22934m;
    public final float f22935n;
    public final float f22936o;
    public final float f22937p;
    public final Matrix f22938q;
    public final int f22939r;
    public float f22940s;
    public float f22941t;
    public float f22942u;

    public ba(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f22939r)) {
            return;
        }
        Path path = this.f22927c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f22935n;
            if (i11 < f11) {
                float[] fArr = this.f22930i;
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
                float[] fArr3 = this.f22929g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f22928f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f22936o * this.f22937p;
                Matrix matrix = this.f22938q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f22932k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f22933l;
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
        for (int i10 = 0; i10 < this.f22935n; i10++) {
            c(this.e, this.f22928f, i10);
            c(this.f22929g, this.h, i10);
            this.f22930i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f22935n;
        float f10 = this.f22926b;
        float f11 = this.f22925a;
        Random random = this.f22934m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f22931j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f22940s = f7;
        if (!LiteMode.isEnabled(this.f22939r)) {
            return;
        }
        if (z10) {
            float f10 = this.f22940s;
            float f11 = this.f22941t;
            if (f10 > f11) {
                this.f22942u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f22942u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f22940s;
        float f13 = this.f22941t;
        if (f12 > f13) {
            this.f22942u = (f12 - f13) / 320.0f;
        } else {
            this.f22942u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f22939r)) {
            for (int i10 = 0; i10 < this.f22935n; i10++) {
                float[] fArr = this.f22930i;
                float f11 = fArr[i10];
                float f12 = this.f22931j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f22929g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f22928f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f22940s;
        float f10 = this.f22941t;
        if (f7 != f10) {
            float f11 = this.f22942u;
            float f12 = (((float) j3) * f11) + f10;
            this.f22941t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f22941t = f7;
                }
            } else if (f12 < f7) {
                this.f22941t = f7;
            }
        }
    }

    public ba(int i10, int i11) {
        float f7;
        this.f22927c = new Path();
        this.d = new Paint(1);
        this.f22932k = new float[4];
        this.f22933l = new float[4];
        this.f22934m = new Random();
        this.f22937p = 1.0f;
        this.f22938q = new Matrix();
        this.f22935n = i10;
        this.f22936o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f22928f = new float[i10];
        this.f22929g = new float[i10];
        this.h = new float[i10];
        this.f22930i = new float[i10];
        this.f22931j = new float[i10];
        for (int i12 = 0; i12 < this.f22935n; i12++) {
            c(this.e, this.f22928f, i12);
            c(this.f22929g, this.h, i12);
            this.f22930i[i12] = 0.0f;
        }
        this.f22939r = i11;
    }
}
