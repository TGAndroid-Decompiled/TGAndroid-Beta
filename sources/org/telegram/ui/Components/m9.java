package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public class m9 {
    public float f28417a;
    public float f28418b;
    public final Path f28419c;
    public final Paint d;
    public final float[] e;
    public final float[] f28420f;
    public final float[] f28421g;
    public final float[] h;
    public final float[] f28422i;
    public final float[] f28423j;
    public final float[] f28424k;
    public final float[] f28425l;
    public final Random f28426m;
    public final float f28427n;
    public final float f28428o;
    public final float f28429p;
    public final Matrix f28430q;
    public final int f28431r;
    public float f28432s;
    public float f28433t;
    public float f28434u;

    public m9(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!org.telegram.messenger.tc.e(this.f28431r)) {
            return;
        }
        Path path = this.f28419c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f28427n;
            if (i11 < f11) {
                float[] fArr = this.f28422i;
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
                float[] fArr3 = this.f28421g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f28420f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f28428o * this.f28429p;
                Matrix matrix = this.f28430q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f28424k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f28425l;
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
        for (int i10 = 0; i10 < this.f28427n; i10++) {
            c(this.e, this.f28420f, i10);
            c(this.f28421g, this.h, i10);
            this.f28422i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f28427n;
        float f10 = this.f28418b;
        float f11 = this.f28417a;
        Random random = this.f28426m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f28423j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(boolean z10, float f7) {
        this.f28432s = f7;
        if (!org.telegram.messenger.tc.e(this.f28431r)) {
            return;
        }
        if (z10) {
            float f10 = this.f28432s;
            float f11 = this.f28433t;
            if (f10 > f11) {
                this.f28434u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f28434u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f28432s;
        float f13 = this.f28433t;
        if (f12 > f13) {
            this.f28434u = (f12 - f13) / 320.0f;
        } else {
            this.f28434u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (org.telegram.messenger.tc.e(this.f28431r)) {
            for (int i10 = 0; i10 < this.f28427n; i10++) {
                float[] fArr = this.f28422i;
                float f11 = fArr[i10];
                float f12 = this.f28423j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f28421g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f28420f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j10) {
        float f7 = this.f28432s;
        float f10 = this.f28433t;
        if (f7 != f10) {
            float f11 = this.f28434u;
            float f12 = (((float) j10) * f11) + f10;
            this.f28433t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f28433t = f7;
                }
            } else if (f12 < f7) {
                this.f28433t = f7;
            }
        }
    }

    public m9(int i10, int i11) {
        float f7;
        this.f28419c = new Path();
        this.d = new Paint(1);
        this.f28424k = new float[4];
        this.f28425l = new float[4];
        this.f28426m = new Random();
        this.f28429p = 1.0f;
        this.f28430q = new Matrix();
        this.f28427n = i10;
        this.f28428o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f28420f = new float[i10];
        this.f28421g = new float[i10];
        this.h = new float[i10];
        this.f28422i = new float[i10];
        this.f28423j = new float[i10];
        for (int i12 = 0; i12 < this.f28427n; i12++) {
            c(this.e, this.f28420f, i12);
            c(this.f28421g, this.h, i12);
            this.f28422i[i12] = 0.0f;
        }
        this.f28431r = i11;
    }
}
