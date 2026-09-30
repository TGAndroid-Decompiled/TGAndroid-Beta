package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class ba {
    public float f22894a;
    public float f22895b;
    public final Path f22896c;
    public final Paint d;
    public final float[] e;
    public final float[] f22897f;
    public final float[] f22898g;
    public final float[] h;
    public final float[] f22899i;
    public final float[] f22900j;
    public final float[] f22901k;
    public final float[] f22902l;
    public final Random f22903m;
    public final float f22904n;
    public final float f22905o;
    public final float f22906p;
    public final Matrix f22907q;
    public final int f22908r;
    public float f22909s;
    public float f22910t;
    public float f22911u;

    public ba(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f22908r)) {
            return;
        }
        Path path = this.f22896c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f22904n;
            if (i11 < f11) {
                float[] fArr = this.f22899i;
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
                float[] fArr3 = this.f22898g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f22897f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f22905o * this.f22906p;
                Matrix matrix = this.f22907q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f22901k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f22902l;
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
        for (int i10 = 0; i10 < this.f22904n; i10++) {
            c(this.e, this.f22897f, i10);
            c(this.f22898g, this.h, i10);
            this.f22899i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f22904n;
        float f10 = this.f22895b;
        float f11 = this.f22894a;
        Random random = this.f22903m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f22900j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f22909s = f7;
        if (!LiteMode.isEnabled(this.f22908r)) {
            return;
        }
        if (z10) {
            float f10 = this.f22909s;
            float f11 = this.f22910t;
            if (f10 > f11) {
                this.f22911u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f22911u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f22909s;
        float f13 = this.f22910t;
        if (f12 > f13) {
            this.f22911u = (f12 - f13) / 320.0f;
        } else {
            this.f22911u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f22908r)) {
            for (int i10 = 0; i10 < this.f22904n; i10++) {
                float[] fArr = this.f22899i;
                float f11 = fArr[i10];
                float f12 = this.f22900j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f22898g;
                    this.e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f22897f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f22909s;
        float f10 = this.f22910t;
        if (f7 != f10) {
            float f11 = this.f22911u;
            float f12 = (((float) j3) * f11) + f10;
            this.f22910t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f22910t = f7;
                }
            } else if (f12 < f7) {
                this.f22910t = f7;
            }
        }
    }

    public ba(int i10, int i11) {
        float f7;
        this.f22896c = new Path();
        this.d = new Paint(1);
        this.f22901k = new float[4];
        this.f22902l = new float[4];
        this.f22903m = new Random();
        this.f22906p = 1.0f;
        this.f22907q = new Matrix();
        this.f22904n = i10;
        this.f22905o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.e = new float[i10];
        this.f22897f = new float[i10];
        this.f22898g = new float[i10];
        this.h = new float[i10];
        this.f22899i = new float[i10];
        this.f22900j = new float[i10];
        for (int i12 = 0; i12 < this.f22904n; i12++) {
            c(this.e, this.f22897f, i12);
            c(this.f22898g, this.h, i12);
            this.f22899i[i12] = 0.0f;
        }
        this.f22908r = i11;
    }
}
