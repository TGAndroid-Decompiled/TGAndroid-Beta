package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
public final class c8 {
    public float f32474f;
    public boolean f32475g;
    public final Paint h;
    public org.telegram.ui.Cells.q1 f32476i;
    public int f32483p;
    public int f32484q;
    public float f32485r;
    public final int[] f32471b = new int[3];
    public final float[] f32472c = new float[8];
    public final float[] d = new float[8];
    public final float[] f32473e = new float[8];
    public final Random f32477j = new Random();
    public final float f32478k = org.telegram.messenger.g0.L(6.0f) * 0.33f;
    public final float f32479l = org.telegram.messenger.g0.L(12.0f) * 0.36f;
    public final float f32480m = 120.0f;
    public final int f32481n = 61;
    public final float[] f32482o = new float[6];
    public final bp[] f32470a = new bp[2];

    public c8() {
        for (int i7 = 0; i7 < 2; i7++) {
            bp[] bpVarArr = this.f32470a;
            bp bpVar = new bp();
            bpVarArr[i7] = bpVar;
            bpVar.f32298g = org.telegram.messenger.g0.L(24.0f);
            bpVar.f32301k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i7, Canvas canvas) {
        if (!org.telegram.messenger.sc.e(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i7);
        paint.setAlpha((int) (this.f32481n * f12));
        b(canvas, f10, f11);
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (org.telegram.messenger.sc.e(32)) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f32472c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.f32473e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f32476i.invalidate();
                }
                i10++;
            }
            char c10 = 1;
            if (this.f32475g) {
                float f17 = this.f32474f + 0.02f;
                this.f32474f = f17;
                if (f17 > 1.0f) {
                    this.f32475g = false;
                    this.f32474f = 1.0f;
                }
            } else {
                float f18 = this.f32474f - 0.02f;
                this.f32474f = f18;
                if (f18 < 0.0f) {
                    this.f32475g = true;
                    this.f32474f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.f32479l;
                iArr = this.f32471b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            bp[] bpVarArr = this.f32470a;
            bp bpVar = bpVarArr[0];
            while (i7 < bpVar.f32297f) {
                float[] fArr4 = bpVar.f32300j;
                fArr4[i7] = iArr[i7 / 2];
                fArr4[i7 + 1] = 0.0f;
                i7 += 2;
                c10 = c10;
            }
            char c11 = c10;
            for (int i12 = 0; i12 < 3; i12++) {
                iArr[i12] = (int) (fArr[i12 + 3] * f12);
            }
            bp bpVar2 = bpVarArr[c11];
            for (int i13 = 0; i13 < bpVar2.f32297f; i13 += 2) {
                float[] fArr5 = bpVar2.f32300j;
                fArr5[i13] = iArr[i13 / 2];
                fArr5[i13 + 1] = 0.0f;
            }
            float L = (this.f32478k * f19) + (org.telegram.messenger.g0.L(4.0f) * f20) + org.telegram.messenger.g0.L(22.0f);
            if (L > org.telegram.messenger.g0.L(26.0f)) {
                L = org.telegram.messenger.g0.L(26.0f);
            }
            bp bpVar3 = bpVarArr[0];
            bpVarArr[c11].f32298g = L;
            bpVar3.f32298g = L;
            canvas.save();
            float f21 = (float) (this.f32485r + 0.6d);
            this.f32485r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f32474f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            bp bpVar4 = bpVarArr[0];
            Paint paint = this.h;
            bpVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, this.f32474f, 0.04f, 1.0f);
            canvas.scale(z9, z9, f10, f11);
            bpVarArr[c11].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z9, float f12, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!org.telegram.messenger.sc.e(32)) {
            return;
        }
        int i7 = this.f32481n;
        Paint paint = this.h;
        if (z9) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bc, f6Var));
            paint.setAlpha((int) (i7 * f12));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.We, f6Var));
            paint.setAlpha((int) (i7 * f12));
        }
        b(canvas, f10, f11);
    }

    public final void d(org.telegram.ui.Cells.q1 q1Var) {
        this.f32476i = q1Var;
    }

    public final void e(boolean z9, float[] fArr) {
        boolean z10;
        float f10;
        float f11;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        if (!org.telegram.messenger.sc.e(32)) {
            return;
        }
        float f12 = 0.0f;
        int i7 = 0;
        if (fArr != null && fArr[6] == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (fArr == null) {
            f10 = 0.0f;
        } else {
            f10 = fArr[6];
        }
        float[] fArr5 = this.f32482o;
        if (fArr != null && f10 > 0.4d) {
            int i10 = this.f32484q;
            fArr5[i10] = f10;
            int i11 = i10 + 1;
            this.f32484q = i11;
            if (i11 > 5) {
                this.f32484q = 0;
            }
            this.f32483p++;
        } else {
            this.f32483p = 0;
        }
        if (z10) {
            for (int i12 = 0; i12 < 6; i12++) {
                fArr[i12] = (this.f32477j.nextInt() % 500) / 1000.0f;
            }
        }
        float f13 = this.f32480m;
        if (z10) {
            f11 = 2.0f * f13;
        } else {
            f11 = f13;
        }
        if (this.f32483p > 6) {
            float f14 = 0.0f;
            for (int i13 = 0; i13 < 6; i13++) {
                f14 += fArr5[i13];
            }
            float f15 = f14 / 6.0f;
            if (f15 > 0.52f) {
                f11 = com.google.android.recaptcha.internal.a.v(f15, 0.4f, f13, f11);
            }
        }
        while (true) {
            fArr2 = this.f32473e;
            fArr3 = this.d;
            fArr4 = this.f32472c;
            if (i7 >= 7) {
                break;
            }
            if (fArr == null) {
                fArr4[i7] = 0.0f;
            } else {
                fArr4[i7] = fArr[i7];
            }
            if (this.f32476i == null) {
                fArr3[i7] = fArr4[i7];
            } else if (i7 == 6) {
                fArr2[i7] = (fArr4[i7] - fArr3[i7]) / (80.0f + f13);
            } else {
                fArr2[i7] = (fArr4[i7] - fArr3[i7]) / f11;
            }
            i7++;
        }
        if (z9) {
            f12 = 1.0f;
        }
        fArr4[7] = f12;
        fArr2[7] = (f12 - fArr3[7]) / 120.0f;
    }
}
