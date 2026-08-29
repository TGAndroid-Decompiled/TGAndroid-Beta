package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class h8 {
    public float f29113f;
    public boolean f29114g;
    public final Paint h;
    public org.telegram.ui.Cells.s1 f29115i;
    public int f29122p;
    public int f29123q;
    public float f29124r;
    public final int[] f29110b = new int[3];
    public final float[] f29111c = new float[8];
    public final float[] d = new float[8];
    public final float[] f29112e = new float[8];
    public final Random f29116j = new Random();
    public final float f29117k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f29118l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f29119m = 120.0f;
    public final int f29120n = 61;
    public final float[] f29121o = new float[6];
    public final mp[] f29109a = new mp[2];

    public h8() {
        for (int i10 = 0; i10 < 2; i10++) {
            mp[] mpVarArr = this.f29109a;
            mp mpVar = new mp();
            mpVarArr[i10] = mpVar;
            mpVar.f30747g = AndroidUtilities.dp(24.0f);
            mpVar.f30750k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f9, float f10, float f11, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f29120n * f11));
        b(canvas, f9, f10);
    }

    public final void b(Canvas canvas, float f9, float f10) {
        float[] fArr;
        float f11;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i10 = 0;
            while (true) {
                fArr = this.d;
                if (i10 >= 8) {
                    break;
                }
                float[] fArr2 = this.f29111c;
                float f12 = fArr2[i10];
                float f13 = fArr[i10];
                if (f12 != f13) {
                    float[] fArr3 = this.f29112e;
                    float f14 = (fArr3[i10] * 16.0f) + f13;
                    fArr[i10] = f14;
                    float f15 = fArr3[i10];
                    if ((f15 > 0.0f && f14 > fArr2[i10]) || (f15 < 0.0f && f14 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f29115i.invalidate();
                }
                i10++;
            }
            if (this.f29114g) {
                float f16 = this.f29113f + 0.02f;
                this.f29113f = f16;
                if (f16 > 1.0f) {
                    this.f29114g = false;
                    this.f29113f = 1.0f;
                }
            } else {
                float f17 = this.f29113f - 0.02f;
                this.f29113f = f17;
                if (f17 < 0.0f) {
                    this.f29114g = true;
                    this.f29113f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f11 = this.f29118l;
                iArr = this.f29110b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f11);
                i11++;
            }
            mp[] mpVarArr = this.f29109a;
            mp mpVar = mpVarArr[0];
            for (int i12 = 0; i12 < mpVar.f30746f; i12 += 2) {
                float[] fArr4 = mpVar.f30749j;
                fArr4[i12] = iArr[i12 / 2];
                fArr4[i12 + 1] = 0.0f;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            mp mpVar2 = mpVarArr[1];
            for (int i14 = 0; i14 < mpVar2.f30746f; i14 += 2) {
                float[] fArr5 = mpVar2.f30749j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f29117k * f18) + (AndroidUtilities.dp(4.0f) * f19) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            mp mpVar3 = mpVarArr[0];
            mpVarArr[1].f30747g = dp;
            mpVar3.f30747g = dp;
            canvas.save();
            float f20 = (float) (this.f29124r + 0.6d);
            this.f29124r = f20;
            canvas.rotate(f20, f9, f10);
            canvas.save();
            float f21 = (this.f29113f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f9, f10);
            mp mpVar4 = mpVarArr[0];
            Paint paint = this.h;
            mpVar4.a(f9, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f9, f10);
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.f29113f, 0.04f, 1.0f);
            canvas.scale(z10, z10, f9, f10);
            mpVarArr[1].a(f9, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f9, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f29120n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Nb, c6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23160ie, c6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f9, f10);
    }

    public final void d(org.telegram.ui.Cells.s1 s1Var) {
        this.f29115i = s1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f9;
        float f10;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f11 = 0.0f;
            float[] fArr4 = this.f29111c;
            int i10 = 0;
            if (!z10 && !z11) {
                while (i10 < 8) {
                    fArr3[i10] = 0.0f;
                    fArr4[i10] = 0.0f;
                    i10++;
                }
                return;
            }
            if (fArr != null && fArr[6] == 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (fArr == null) {
                f9 = 0.0f;
            } else {
                f9 = fArr[6];
            }
            float[] fArr5 = this.f29121o;
            if (fArr != null && f9 > 0.4d) {
                int i11 = this.f29123q;
                fArr5[i11] = f9;
                int i12 = i11 + 1;
                this.f29123q = i12;
                if (i12 > 5) {
                    this.f29123q = 0;
                }
                this.f29122p++;
            } else {
                this.f29122p = 0;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f29116j.nextInt() % 500) / 1000.0f;
                }
            }
            float f12 = this.f29119m;
            if (z12) {
                f10 = 2.0f * f12;
            } else {
                f10 = f12;
            }
            if (this.f29122p > 6) {
                float f13 = 0.0f;
                for (int i14 = 0; i14 < 6; i14++) {
                    f13 += fArr5[i14];
                }
                float f14 = f13 / 6.0f;
                if (f14 > 0.52f) {
                    f10 = org.telegram.ui.th.b(f14, 0.4f, f12, f10);
                }
            }
            while (true) {
                fArr2 = this.f29112e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f29115i == null) {
                    fArr3[i10] = fArr4[i10];
                } else if (i10 == 6) {
                    fArr2[i10] = (fArr4[i10] - fArr3[i10]) / (80.0f + f12);
                } else {
                    fArr2[i10] = (fArr4[i10] - fArr3[i10]) / f10;
                }
                i10++;
            }
            if (z10) {
                f11 = 1.0f;
            }
            fArr4[7] = f11;
            fArr2[7] = (f11 - fArr3[7]) / 120.0f;
        }
    }
}
