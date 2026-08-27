package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;

public final class c8 {

    public float f27361f;

    public boolean f27362g;
    public final Paint h;

    public org.telegram.ui.Cells.s1 f27363i;

    public int f27370p;

    public int f27371q;

    public float f27372r;

    public final int[] f27358b = new int[3];

    public final float[] f27359c = new float[8];
    public final float[] d = new float[8];

    public final float[] f27360e = new float[8];

    public final Random f27364j = new Random();

    public final float f27365k = AndroidUtilities.dp(6.0f) * 0.33f;

    public final float f27366l = AndroidUtilities.dp(12.0f) * 0.36f;

    public final float f27367m = 120.0f;

    public final int f27368n = 61;

    public final float[] f27369o = new float[6];

    public final gp[] f27357a = new gp[2];

    public c8() {
        for (int i10 = 0; i10 < 2; i10++) {
            gp[] gpVarArr = this.f27357a;
            gp gpVar = new gp();
            gpVarArr[i10] = gpVar;
            gpVar.f28792g = AndroidUtilities.dp(24.0f);
            gpVar.f28795k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i10, Canvas canvas) {
        if (LiteMode.isEnabled(32)) {
            Paint paint = this.h;
            paint.setColor(i10);
            paint.setAlpha((int) (this.f27368n * f12));
            b(canvas, f10, f11);
        }
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f27359c;
                float f13 = fArr2[i10];
                float f14 = fArr[i10];
                if (f13 != f14) {
                    float[] fArr3 = this.f27360e;
                    float f15 = (fArr3[i10] * 16.0f) + f14;
                    fArr[i10] = f15;
                    float f16 = fArr3[i10];
                    if ((f16 > 0.0f && f15 > fArr2[i10]) || (f16 < 0.0f && f15 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f27363i.invalidate();
                }
                i10++;
            }
            if (this.f27362g) {
                float f17 = this.f27361f + 0.02f;
                this.f27361f = f17;
                if (f17 > 1.0f) {
                    this.f27362g = false;
                    this.f27361f = 1.0f;
                }
            } else {
                float f18 = this.f27361f - 0.02f;
                this.f27361f = f18;
                if (f18 < 0.0f) {
                    this.f27362g = true;
                    this.f27361f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f12 = this.f27366l;
                iArr = this.f27358b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f12);
                i11++;
            }
            gp[] gpVarArr = this.f27357a;
            gp gpVar = gpVarArr[0];
            for (int i12 = 0; i12 < gpVar.f28791f; i12 += 2) {
                float[] fArr4 = gpVar.f28794j;
                fArr4[i12] = iArr[i12 / 2];
                fArr4[i12 + 1] = 0.0f;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f12);
            }
            gp gpVar2 = gpVarArr[1];
            for (int i14 = 0; i14 < gpVar2.f28791f; i14 += 2) {
                float[] fArr5 = gpVar2.f28794j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float fDp = (this.f27365k * f19) + (AndroidUtilities.dp(4.0f) * f20) + AndroidUtilities.dp(22.0f);
            if (fDp > AndroidUtilities.dp(26.0f)) {
                fDp = AndroidUtilities.dp(26.0f);
            }
            gp gpVar3 = gpVarArr[0];
            gpVarArr[1].f28792g = fDp;
            gpVar3.f28792g = fDp;
            canvas.save();
            float f21 = (float) (((double) this.f27372r) + 0.6d);
            this.f27372r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f27361f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            gp gpVar4 = gpVarArr[0];
            Paint paint = this.h;
            gpVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float fZ = com.google.android.recaptcha.internal.a.z(1.0f, this.f27361f, 0.04f, 1.0f);
            canvas.scale(fZ, fZ, f10, f11);
            gpVarArr[1].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z10, float f12, org.telegram.ui.ActionBar.c6 c6Var) {
        if (LiteMode.isEnabled(32)) {
            int i10 = this.f27368n;
            Paint paint = this.h;
            if (z10) {
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Nb, c6Var));
                paint.setAlpha((int) (i10 * f12));
            } else {
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152ie, c6Var));
                paint.setAlpha((int) (i10 * f12));
            }
            b(canvas, f10, f11);
        }
    }

    public final void d(org.telegram.ui.Cells.s1 s1Var) {
        this.f27363i = s1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float[] fArr4 = this.f27359c;
            int i10 = 0;
            if (!z10 && !z11) {
                while (i10 < 8) {
                    fArr3[i10] = 0.0f;
                    fArr4[i10] = 0.0f;
                    i10++;
                }
                return;
            }
            boolean z12 = fArr != null && fArr[6] == 0.0f;
            float f10 = fArr == null ? 0.0f : fArr[6];
            float[] fArr5 = this.f27369o;
            if (fArr == null || f10 <= 0.4d) {
                this.f27370p = 0;
            } else {
                int i11 = this.f27371q;
                fArr5[i11] = f10;
                int i12 = i11 + 1;
                this.f27371q = i12;
                if (i12 > 5) {
                    this.f27371q = 0;
                }
                this.f27370p++;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f27364j.nextInt() % 500) / 1000.0f;
                }
            }
            float f11 = this.f27367m;
            float fB = z12 ? 2.0f * f11 : f11;
            if (this.f27370p > 6) {
                float f12 = 0.0f;
                for (int i14 = 0; i14 < 6; i14++) {
                    f12 += fArr5[i14];
                }
                float f13 = f12 / 6.0f;
                if (f13 > 0.52f) {
                    fB = org.telegram.ui.Cells.pa.b(f13, 0.4f, f11, fB);
                }
            }
            while (true) {
                fArr2 = this.f27360e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f27363i == null) {
                    fArr3[i10] = fArr4[i10];
                } else if (i10 == 6) {
                    fArr2[i10] = (fArr4[i10] - fArr3[i10]) / (80.0f + f11);
                } else {
                    fArr2[i10] = (fArr4[i10] - fArr3[i10]) / fB;
                }
                i10++;
            }
            float f14 = z10 ? 1.0f : 0.0f;
            fArr4[7] = f14;
            fArr2[7] = (f14 - fArr3[7]) / 120.0f;
        }
    }
}
