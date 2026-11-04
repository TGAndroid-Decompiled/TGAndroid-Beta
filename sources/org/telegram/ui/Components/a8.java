package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
public final class a8 {
    public float f31754f;
    public boolean f31755g;
    public final Paint h;
    public org.telegram.ui.Cells.q1 f31756i;
    public int f31763p;
    public int f31764q;
    public float f31765r;
    public final int[] f31751b = new int[3];
    public final float[] f31752c = new float[8];
    public final float[] d = new float[8];
    public final float[] f31753e = new float[8];
    public final Random f31757j = new Random();
    public final float f31758k = org.telegram.messenger.g0.L(6.0f) * 0.33f;
    public final float f31759l = org.telegram.messenger.g0.L(12.0f) * 0.36f;
    public final float f31760m = 120.0f;
    public final int f31761n = 61;
    public final float[] f31762o = new float[6];
    public final bp[] f31750a = new bp[2];

    public a8() {
        for (int i3 = 0; i3 < 2; i3++) {
            bp[] bpVarArr = this.f31750a;
            bp bpVar = new bp();
            bpVarArr[i3] = bpVar;
            bpVar.f32349g = org.telegram.messenger.g0.L(24.0f);
            bpVar.f32352k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i3, Canvas canvas) {
        if (!org.telegram.messenger.lc.e(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i3);
        paint.setAlpha((int) (this.f31761n * f12));
        b(canvas, f10, f11);
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (org.telegram.messenger.lc.e(32)) {
            int i3 = 0;
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f31752c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.f31753e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f31756i.invalidate();
                }
                i10++;
            }
            char c2 = 1;
            if (this.f31755g) {
                float f17 = this.f31754f + 0.02f;
                this.f31754f = f17;
                if (f17 > 1.0f) {
                    this.f31755g = false;
                    this.f31754f = 1.0f;
                }
            } else {
                float f18 = this.f31754f - 0.02f;
                this.f31754f = f18;
                if (f18 < 0.0f) {
                    this.f31755g = true;
                    this.f31754f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.f31759l;
                iArr = this.f31751b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            bp[] bpVarArr = this.f31750a;
            bp bpVar = bpVarArr[0];
            while (i3 < bpVar.f32348f) {
                float[] fArr4 = bpVar.f32351j;
                fArr4[i3] = iArr[i3 / 2];
                fArr4[i3 + 1] = 0.0f;
                i3 += 2;
                c2 = c2;
            }
            char c10 = c2;
            for (int i12 = 0; i12 < 3; i12++) {
                iArr[i12] = (int) (fArr[i12 + 3] * f12);
            }
            bp bpVar2 = bpVarArr[c10];
            for (int i13 = 0; i13 < bpVar2.f32348f; i13 += 2) {
                float[] fArr5 = bpVar2.f32351j;
                fArr5[i13] = iArr[i13 / 2];
                fArr5[i13 + 1] = 0.0f;
            }
            float L = (this.f31758k * f19) + (org.telegram.messenger.g0.L(4.0f) * f20) + org.telegram.messenger.g0.L(22.0f);
            if (L > org.telegram.messenger.g0.L(26.0f)) {
                L = org.telegram.messenger.g0.L(26.0f);
            }
            bp bpVar3 = bpVarArr[0];
            bpVarArr[c10].f32349g = L;
            bpVar3.f32349g = L;
            canvas.save();
            float f21 = (float) (this.f31765r + 0.6d);
            this.f31765r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f31754f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            bp bpVar4 = bpVarArr[0];
            Paint paint = this.h;
            bpVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.f31754f, 0.04f, 1.0f);
            canvas.scale(y9, y9, f10, f11);
            bpVarArr[c10].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z10, float f12, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!org.telegram.messenger.lc.e(32)) {
            return;
        }
        int i3 = this.f31761n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bc, e6Var));
            paint.setAlpha((int) (i3 * f12));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.We, e6Var));
            paint.setAlpha((int) (i3 * f12));
        }
        b(canvas, f10, f11);
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var) {
        this.f31756i = q1Var;
    }

    public final void e(boolean z10, float[] fArr) {
        boolean z11;
        float f10;
        float f11;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (!org.telegram.messenger.lc.e(32)) {
            return;
        }
        float f12 = 0.0f;
        int i3 = 0;
        if (fArr != null && fArr[6] == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (fArr == null) {
            f10 = 0.0f;
        } else {
            f10 = fArr[6];
        }
        float[] fArr5 = this.f31762o;
        if (fArr != null && f10 > 0.4d) {
            int i10 = this.f31764q;
            fArr5[i10] = f10;
            int i11 = i10 + 1;
            this.f31764q = i11;
            if (i11 > 5) {
                this.f31764q = 0;
            }
            this.f31763p++;
        } else {
            this.f31763p = 0;
        }
        if (z11) {
            for (int i12 = 0; i12 < 6; i12++) {
                fArr[i12] = (this.f31757j.nextInt() % 500) / 1000.0f;
            }
        }
        float f13 = this.f31760m;
        if (z11) {
            f11 = 2.0f * f13;
        } else {
            f11 = f13;
        }
        if (this.f31763p > 6) {
            float f14 = 0.0f;
            for (int i13 = 0; i13 < 6; i13++) {
                f14 += fArr5[i13];
            }
            float f15 = f14 / 6.0f;
            if (f15 > 0.52f) {
                f11 = a1.g.D(f15, 0.4f, f13, f11);
            }
        }
        while (true) {
            fArr2 = this.f31753e;
            fArr3 = this.d;
            fArr4 = this.f31752c;
            if (i3 >= 7) {
                break;
            }
            if (fArr == null) {
                fArr4[i3] = 0.0f;
            } else {
                fArr4[i3] = fArr[i3];
            }
            if (this.f31756i == null) {
                fArr3[i3] = fArr4[i3];
            } else if (i3 == 6) {
                fArr2[i3] = (fArr4[i3] - fArr3[i3]) / (80.0f + f13);
            } else {
                fArr2[i3] = (fArr4[i3] - fArr3[i3]) / f11;
            }
            i3++;
        }
        if (z10) {
            f12 = 1.0f;
        }
        fArr4[7] = f12;
        fArr2[7] = (f12 - fArr3[7]) / 120.0f;
    }
}
