package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.Random;
import org.telegram.messenger.LiteMode;
public class t9 {
    public float f32647a;
    public float f32648b;
    public final Path f32649c;
    public final Paint d;
    public final float[] f32650e;
    public final float[] f32651f;
    public final float[] f32652g;
    public final float[] h;
    public final float[] f32653i;
    public final float[] f32654j;
    public final float[] f32655k;
    public final float[] f32656l;
    public final Random f32657m;
    public final float f32658n;
    public final float f32659o;
    public final float f32660p;
    public final Matrix f32661q;
    public final int f32662r;
    public float f32663s;
    public float f32664t;
    public float f32665u;

    public t9(int i9) {
        this(i9, 512);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint) {
        int i9;
        if (!LiteMode.isEnabled(this.f32662r)) {
            return;
        }
        Path path = this.f32649c;
        path.reset();
        int i10 = 0;
        while (true) {
            float f12 = this.f32658n;
            if (i10 < f12) {
                float[] fArr = this.f32653i;
                float f13 = fArr[i10];
                int i11 = i10 + 1;
                if (i11 < f12) {
                    i9 = i11;
                } else {
                    i9 = 0;
                }
                float f14 = fArr[i9];
                float[] fArr2 = this.f32650e;
                float f15 = 1.0f - f13;
                float[] fArr3 = this.f32652g;
                float f16 = (fArr3[i10] * f13) + (fArr2[i10] * f15);
                float f17 = 1.0f - f14;
                float f18 = (fArr3[i9] * f14) + (fArr2[i9] * f17);
                float[] fArr4 = this.f32651f;
                float f19 = fArr4[i10] * f15;
                float[] fArr5 = this.h;
                float f20 = (fArr5[i9] * f14) + (fArr4[i9] * f17);
                float max = (((Math.max(f16, f18) - Math.min(f16, f18)) / 2.0f) + Math.min(f16, f18)) * this.f32659o * this.f32660p;
                Matrix matrix = this.f32661q;
                matrix.reset();
                matrix.setRotate((fArr5[i10] * f13) + f19, f10, f11);
                float[] fArr6 = this.f32655k;
                fArr6[0] = f10;
                float f21 = f11 - f16;
                fArr6[1] = f21;
                fArr6[2] = f10 + max;
                fArr6[3] = f21;
                matrix.mapPoints(fArr6);
                float[] fArr7 = this.f32656l;
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
        for (int i9 = 0; i9 < this.f32658n; i9++) {
            c(this.f32650e, this.f32651f, i9);
            c(this.f32652g, this.h, i9);
            this.f32653i[i9] = 0.0f;
        }
    }

    public final void c(float[] fArr, float[] fArr2, int i9) {
        float f10 = this.f32658n;
        float f11 = this.f32648b;
        float f12 = this.f32647a;
        Random random = this.f32657m;
        fArr[i9] = (Math.abs((random.nextInt() % 100.0f) / 100.0f) * (f11 - f12)) + f12;
        fArr2[i9] = (((random.nextInt() % 100.0f) / 100.0f) * (360.0f / f10) * 0.05f) + ((360.0f / f10) * i9);
        this.f32654j[i9] = (float) (((Math.abs(random.nextInt() % 100.0f) / 100.0f) * 0.003d) + 0.017d);
    }

    public final void d(float f10, boolean z10) {
        this.f32663s = f10;
        if (!LiteMode.isEnabled(this.f32662r)) {
            return;
        }
        if (z10) {
            float f11 = this.f32663s;
            float f12 = this.f32664t;
            if (f11 > f12) {
                this.f32665u = (f11 - f12) / 205.0f;
                return;
            } else {
                this.f32665u = (f11 - f12) / 275.0f;
                return;
            }
        }
        float f13 = this.f32663s;
        float f14 = this.f32664t;
        if (f13 > f14) {
            this.f32665u = (f13 - f14) / 320.0f;
        } else {
            this.f32665u = (f13 - f14) / 375.0f;
        }
    }

    public final void e(float f10, float f11) {
        if (LiteMode.isEnabled(this.f32662r)) {
            for (int i9 = 0; i9 < this.f32658n; i9++) {
                float[] fArr = this.f32653i;
                float f12 = fArr[i9];
                float f13 = this.f32654j[i9];
                float f14 = (f13 * f10 * 8.2f * f11) + (0.8f * f13) + f12;
                fArr[i9] = f14;
                if (f14 >= 1.0f) {
                    fArr[i9] = 0.0f;
                    float[] fArr2 = this.f32652g;
                    this.f32650e[i9] = fArr2[i9];
                    float[] fArr3 = this.h;
                    this.f32651f[i9] = fArr3[i9];
                    c(fArr2, fArr3, i9);
                }
            }
        }
    }

    public final void f(long j10) {
        float f10 = this.f32663s;
        float f11 = this.f32664t;
        if (f10 != f11) {
            float f12 = this.f32665u;
            float f13 = (((float) j10) * f12) + f11;
            this.f32664t = f13;
            if (f12 > 0.0f) {
                if (f13 > f10) {
                    this.f32664t = f10;
                }
            } else if (f13 < f10) {
                this.f32664t = f10;
            }
        }
    }

    public t9(int i9, int i10) {
        float f10;
        this.f32649c = new Path();
        this.d = new Paint(1);
        this.f32655k = new float[4];
        this.f32656l = new float[4];
        this.f32657m = new Random();
        this.f32660p = 1.0f;
        this.f32661q = new Matrix();
        this.f32658n = i9;
        this.f32659o = (float) (Math.tan(3.141592653589793d / (f10 * 2.0f)) * 1.3333333333333333d);
        this.f32650e = new float[i9];
        this.f32651f = new float[i9];
        this.f32652g = new float[i9];
        this.h = new float[i9];
        this.f32653i = new float[i9];
        this.f32654j = new float[i9];
        for (int i11 = 0; i11 < this.f32658n; i11++) {
            c(this.f32650e, this.f32651f, i11);
            c(this.f32652g, this.h, i11);
            this.f32653i[i11] = 0.0f;
        }
        this.f32662r = i10;
    }
}
