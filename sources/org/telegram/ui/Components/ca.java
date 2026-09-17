package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class ca {
    public float f24954a;
    public float f24955b;
    public final Path f24956c;
    public final Paint d;
    public final float[] f24957e;
    public final float[] f24958f;
    public final float[] f24959g;
    public final float[] h;
    public final float[] f24960i;
    public final float[] f24961j;
    public final float[] f24962k;
    public final float[] f24963l;
    public final Random f24964m;
    public final float f24965n;
    public final float f24966o;
    public final float f24967p;
    public final Matrix f24968q;
    public final int f24969r;
    public float f24970s;
    public float f24971t;
    public float f24972u;

    public ca(int i10) {
        this(i10, 512);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint) {
        int i10;
        if (!LiteMode.isEnabled(this.f24969r)) {
            return;
        }
        Path path = this.f24956c;
        path.reset();
        int i11 = 0;
        while (true) {
            float f11 = this.f24965n;
            if (i11 < f11) {
                float[] fArr = this.f24960i;
                float f12 = fArr[i11];
                int i12 = i11 + 1;
                if (i12 < f11) {
                    i10 = i12;
                } else {
                    i10 = 0;
                }
                float f13 = fArr[i10];
                float[] fArr2 = this.f24957e;
                float f14 = 1.0f - f12;
                float[] fArr3 = this.f24959g;
                float f15 = (fArr3[i11] * f12) + (fArr2[i11] * f14);
                float f16 = 1.0f - f13;
                float f17 = (fArr3[i10] * f13) + (fArr2[i10] * f16);
                float[] fArr4 = this.f24958f;
                float f18 = fArr4[i11] * f14;
                float[] fArr5 = this.h;
                float f19 = (fArr5[i10] * f13) + (fArr4[i10] * f16);
                float max = (((Math.max(f15, f17) - Math.min(f15, f17)) / 2.0f) + Math.min(f15, f17)) * this.f24966o * this.f24967p;
                Matrix matrix = this.f24968q;
                matrix.reset();
                matrix.setRotate((fArr5[i11] * f12) + f18, f7, f10);
                float[] fArr6 = this.f24962k;
                fArr6[0] = f7;
                float f20 = f10 - f15;
                fArr6[1] = f20;
                fArr6[2] = f7 + max;
                fArr6[3] = f20;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f24963l;
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
        for (int i10 = 0; i10 < this.f24965n; i10++) {
            c(this.f24957e, this.f24958f, i10);
            c(this.f24959g, this.h, i10);
            this.f24960i[i10] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i10) {
        float f7 = this.f24965n;
        float f10 = this.f24955b;
        float f11 = this.f24954a;
        Random random = this.f24964m;
        fArr[i10] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f10 - f11)) + f11;
        fArr2[i10] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f7) * 0.05f) + ((360.0f / f7) * i10);
        this.f24961j[i10] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f7, boolean z10) {
        this.f24970s = f7;
        if (!LiteMode.isEnabled(this.f24969r)) {
            return;
        }
        if (z10) {
            float f10 = this.f24970s;
            float f11 = this.f24971t;
            if (f10 > f11) {
                this.f24972u = (f10 - f11) / 205.0f;
                return;
            } else {
                this.f24972u = (f10 - f11) / 275.0f;
                return;
            }
        }
        float f12 = this.f24970s;
        float f13 = this.f24971t;
        if (f12 > f13) {
            this.f24972u = (f12 - f13) / 320.0f;
        } else {
            this.f24972u = (f12 - f13) / 375.0f;
        }
    }

    public final void e(float f7, float f10) {
        if (LiteMode.isEnabled(this.f24969r)) {
            for (int i10 = 0; i10 < this.f24965n; i10++) {
                float[] fArr = this.f24960i;
                float f11 = fArr[i10];
                float f12 = this.f24961j[i10];
                float f13 = (f12 * f7 * 8.2f * f10) + (0.8f * f12) + f11;
                fArr[i10] = f13;
                if (f13 >= 1.0f) {
                    fArr[i10] = 0.0f;
                    float[] fArr2 = this.f24959g;
                    this.f24957e[i10] = fArr2[i10];
                    float[] fArr3 = this.h;
                    this.f24958f[i10] = fArr3[i10];
                    c(fArr2, fArr3, i10);
                }
            }
        }
    }

    public final void f(long j3) {
        float f7 = this.f24970s;
        float f10 = this.f24971t;
        if (f7 != f10) {
            float f11 = this.f24972u;
            float f12 = (((float) j3) * f11) + f10;
            this.f24971t = f12;
            if (f11 > 0.0f) {
                if (f12 > f7) {
                    this.f24971t = f7;
                }
            } else if (f12 < f7) {
                this.f24971t = f7;
            }
        }
    }

    public ca(int i10, int i11) {
        float f7;
        this.f24956c = new Path();
        this.d = new Paint(1);
        this.f24962k = new float[4];
        this.f24963l = new float[4];
        this.f24964m = new Random();
        this.f24967p = 1.0f;
        this.f24968q = new Matrix();
        this.f24965n = i10;
        this.f24966o = (float) (Math.tan(3.141592653589793d / (f7 * 2.0f)) * 1.3333333333333333d);
        this.f24957e = new float[i10];
        this.f24958f = new float[i10];
        this.f24959g = new float[i10];
        this.h = new float[i10];
        this.f24960i = new float[i10];
        this.f24961j = new float[i10];
        for (int i12 = 0; i12 < this.f24965n; i12++) {
            c(this.f24957e, this.f24958f, i12);
            c(this.f24959g, this.h, i12);
            this.f24960i[i12] = 0.0f;
        }
        this.f24969r = i11;
    }
}
