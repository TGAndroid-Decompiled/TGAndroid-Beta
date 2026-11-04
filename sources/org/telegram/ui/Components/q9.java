package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
public class q9 {
    public float f37381a;
    public float f37382b;
    public final Path f37383c;
    public final Paint d;
    public final float[] f37384e;
    public final float[] f37385f;
    public final float[] f37386g;
    public final float[] h;
    public final float[] f37387i;
    public final float[] f37388j;
    public final float[] f37389k;
    public final float[] f37390l;
    public final Random f37391m;
    public final float f37392n;
    public final float f37393o;
    public final float f37394p;
    public final Matrix f37395q;
    public final int f37396r;
    public float f37397s;
    public float f37398t;
    public float f37399u;

    public q9(int i3) {
        this(i3, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        int i3;
        if (!org.telegram.messenger.lc.e(this.f37396r)) {
            return;
        }
        Path path = this.f37383c;
        path.reset();
        int i10 = 0;
        while (true) {
            float f12 = this.f37392n;
            if (i10 < f12) {
                float[] fArr = this.f37387i;
                float f13 = fArr[i10];
                int i11 = i10 + 1;
                if (i11 < f12) {
                    i3 = i11;
                } else {
                    i3 = 0;
                }
                float f14 = fArr[i3];
                float[] fArr2 = this.f37384e;
                float f15 = 1.0f - f13;
                float[] fArr3 = this.f37386g;
                float f16 = (fArr3[i10] * f13) + (fArr2[i10] * f15);
                float f17 = 1.0f - f14;
                float f18 = (fArr3[i3] * f14) + (fArr2[i3] * f17);
                float[] fArr4 = this.f37385f;
                float f19 = fArr4[i10] * f15;
                float[] fArr5 = this.h;
                float f20 = (fArr5[i3] * f14) + (fArr4[i3] * f17);
                float max = (((Math.max(f16, f18) - Math.min(f16, f18)) / 2.0f) + Math.min(f16, f18)) * this.f37393o * this.f37394p;
                Matrix matrix = this.f37395q;
                matrix.reset();
                matrix.setRotate((fArr5[i10] * f13) + f19, f10, f11);
                float[] fArr6 = this.f37389k;
                fArr6[0] = f10;
                float f21 = f11 - f16;
                fArr6[1] = f21;
                fArr6[2] = f10 + max;
                fArr6[3] = f21;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f37390l;
                fArr7[0] = f10;
                float f22 = f11 - f18;
                fArr7[1] = f22;
                fArr7[2] = f10 - max;
                fArr7[3] = f22;
                matrix.reset();
                matrix.setRotate(f20, f10, f11);
                matrix.mapPoints(fArr7);
                if (i10 == 0) {
                    path.moveTo(fArr6[0], fArr6[1]);
                }
                path.cubicTo(fArr6[2], fArr6[3], fArr7[2], fArr7[3], fArr7[0], fArr7[1]);
                i10 = i11;
            } else {
                canvas.save();
                canvas.drawPath(path, paint);
                canvas.restore();
                return;
            }
        }
    }

    public final void b() {
        for (int i3 = 0; i3 < this.f37392n; i3++) {
            c(this.f37384e, this.f37385f, i3);
            c(this.f37386g, this.h, i3);
            this.f37387i[i3] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i3) {
        float f10 = this.f37392n;
        float f11 = this.f37382b;
        float f12 = this.f37381a;
        Random random = this.f37391m;
        fArr[i3] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i3] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i3);
        this.f37388j[i3] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(boolean z10, float f10) {
        this.f37397s = f10;
        if (!org.telegram.messenger.lc.e(this.f37396r)) {
            return;
        }
        if (z10) {
            float f11 = this.f37397s;
            float f12 = this.f37398t;
            if (f11 > f12) {
                this.f37399u = (f11 - f12) / 205.0f;
                return;
            } else {
                this.f37399u = (f11 - f12) / 275.0f;
                return;
            }
        }
        float f13 = this.f37397s;
        float f14 = this.f37398t;
        if (f13 > f14) {
            this.f37399u = (f13 - f14) / 320.0f;
        } else {
            this.f37399u = (f13 - f14) / 375.0f;
        }
    }

    public final void e(float f10, float f11) {
        if (org.telegram.messenger.lc.e(this.f37396r)) {
            for (int i3 = 0; i3 < this.f37392n; i3++) {
                float[] fArr = this.f37387i;
                float f12 = fArr[i3];
                float f13 = this.f37388j[i3];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i3] = f14;
                if (f14 >= 1.0f) {
                    fArr[i3] = 0.0f;
                    float[] fArr2 = this.f37386g;
                    this.f37384e[i3] = fArr2[i3];
                    float[] fArr3 = this.h;
                    this.f37385f[i3] = fArr3[i3];
                    c(fArr2, fArr3, i3);
                }
            }
        }
    }

    public final void f(long j10) {
        float f10 = this.f37397s;
        float f11 = this.f37398t;
        if (f10 != f11) {
            float f12 = this.f37399u;
            float f13 = (((float) j10) * f12) + f11;
            this.f37398t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f37398t = f10;
                }
            } else if (f13 < f10) {
                this.f37398t = f10;
            }
        }
    }

    public q9(int i3, int i10) {
        float f10;
        this.f37383c = new Path();
        this.d = new Paint(1);
        this.f37389k = new float[4];
        this.f37390l = new float[4];
        this.f37391m = new Random();
        this.f37394p = 1.0f;
        this.f37395q = new Matrix();
        this.f37392n = i3;
        this.f37393o = (float) (Math.tan(3.141592653589793d / (f10 * 2.0f)) * 1.3333333333333333d);
        this.f37384e = new float[i3];
        this.f37385f = new float[i3];
        this.f37386g = new float[i3];
        this.h = new float[i3];
        this.f37387i = new float[i3];
        this.f37388j = new float[i3];
        for (int i11 = 0; i11 < this.f37392n; i11++) {
            c(this.f37384e, this.f37385f, i11);
            c(this.f37386g, this.h, i11);
            this.f37387i[i11] = 0.0f;
        }
        this.f37396r = i10;
    }
}
