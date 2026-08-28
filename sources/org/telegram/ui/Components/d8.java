package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class d8 {
    public float f27676f;
    public boolean f27677g;
    public final Paint h;
    public org.telegram.ui.Cells.t1 f27678i;
    public int f27685p;
    public int f27686q;
    public float f27687r;
    public final int[] f27673b = new int[3];
    public final float[] f27674c = new float[8];
    public final float[] d = new float[8];
    public final float[] f27675e = new float[8];
    public final Random f27679j = new Random();
    public final float f27680k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f27681l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f27682m = 120.0f;
    public final int f27683n = 61;
    public final float[] f27684o = new float[6];
    public final ip[] f27672a = new ip[2];

    public d8() {
        for (int i9 = 0; i9 < 2; i9++) {
            ip[] ipVarArr = this.f27672a;
            ip ipVar = new ip();
            ipVarArr[i9] = ipVar;
            ipVar.f29501g = AndroidUtilities.dp(24.0f);
            ipVar.f29504k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f10, float f11, float f12, int i9, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i9);
        paint.setAlpha((int) (this.f27683n * f12));
        b(canvas, f10, f11);
    }

    public final void b(Canvas canvas, float f10, float f11) {
        float[] fArr;
        float f12;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i9 = 0;
            while (true) {
                fArr = this.d;
                if (i9 >= 8) {
                    break;
                }
                float[] fArr2 = this.f27674c;
                float f13 = fArr2[i9];
                float f14 = fArr[i9];
                if (f13 != f14) {
                    float[] fArr3 = this.f27675e;
                    float f15 = (fArr3[i9] * 16.0f) + f14;
                    fArr[i9] = f15;
                    float f16 = fArr3[i9];
                    if ((f16 > 0.0f && f15 > fArr2[i9]) || (f16 < 0.0f && f15 < fArr2[i9])) {
                        fArr[i9] = fArr2[i9];
                    }
                    this.f27678i.invalidate();
                }
                i9++;
            }
            if (this.f27677g) {
                float f17 = this.f27676f + 0.02f;
                this.f27676f = f17;
                if (f17 > 1.0f) {
                    this.f27677g = false;
                    this.f27676f = 1.0f;
                }
            } else {
                float f18 = this.f27676f - 0.02f;
                this.f27676f = f18;
                if (f18 < 0.0f) {
                    this.f27677g = true;
                    this.f27676f = 0.0f;
                }
            }
            float f19 = fArr[7];
            float f20 = fArr[6] * fArr[0];
            if (f19 == 0.0f && f20 == 0.0f) {
                return;
            }
            int i10 = 0;
            while (true) {
                f12 = this.f27681l;
                iArr = this.f27673b;
                if (i10 >= 3) {
                    break;
                }
                iArr[i10] = (int) (fArr[i10] * f12);
                i10++;
            }
            ip[] ipVarArr = this.f27672a;
            ip ipVar = ipVarArr[0];
            for (int i11 = 0; i11 < ipVar.f29500f; i11 += 2) {
                float[] fArr4 = ipVar.f29503j;
                fArr4[i11] = iArr[i11 / 2];
                fArr4[i11 + 1] = 0.0f;
            }
            for (int i12 = 0; i12 < 3; i12++) {
                iArr[i12] = (int) (fArr[i12 + 3] * f12);
            }
            ip ipVar2 = ipVarArr[1];
            for (int i13 = 0; i13 < ipVar2.f29500f; i13 += 2) {
                float[] fArr5 = ipVar2.f29503j;
                fArr5[i13] = iArr[i13 / 2];
                fArr5[i13 + 1] = 0.0f;
            }
            float dp = (this.f27680k * f19) + (AndroidUtilities.dp(4.0f) * f20) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            ip ipVar3 = ipVarArr[0];
            ipVarArr[1].f29501g = dp;
            ipVar3.f29501g = dp;
            canvas.save();
            float f21 = (float) (this.f27687r + 0.6d);
            this.f27687r = f21;
            canvas.rotate(f21, f10, f11);
            canvas.save();
            float f22 = (this.f27676f * 0.04f) + 1.0f;
            canvas.scale(f22, f22, f10, f11);
            ip ipVar4 = ipVarArr[0];
            Paint paint = this.h;
            ipVar4.a(f10, f11, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f10, f11);
            float z10 = e2.c.z(1.0f, this.f27676f, 0.04f, 1.0f);
            canvas.scale(z10, z10, f10, f11);
            ipVarArr[1].a(f10, f11, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f10, float f11, boolean z10, float f12, org.telegram.ui.ActionBar.b6 b6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i9 = this.f27683n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Nb, b6Var));
            paint.setAlpha((int) (i9 * f12));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23099ie, b6Var));
            paint.setAlpha((int) (i9 * f12));
        }
        b(canvas, f10, f11);
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var) {
        this.f27678i = t1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f10;
        float f11;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f12 = 0.0f;
            float[] fArr4 = this.f27674c;
            int i9 = 0;
            if (!z10 && !z11) {
                while (i9 < 8) {
                    fArr3[i9] = 0.0f;
                    fArr4[i9] = 0.0f;
                    i9++;
                }
                return;
            }
            if (fArr != null && fArr[6] == 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (fArr == null) {
                f10 = 0.0f;
            } else {
                f10 = fArr[6];
            }
            float[] fArr5 = this.f27684o;
            if (fArr != null && f10 > 0.4d) {
                int i10 = this.f27686q;
                fArr5[i10] = f10;
                int i11 = i10 + 1;
                this.f27686q = i11;
                if (i11 > 5) {
                    this.f27686q = 0;
                }
                this.f27685p++;
            } else {
                this.f27685p = 0;
            }
            if (z12) {
                for (int i12 = 0; i12 < 6; i12++) {
                    fArr[i12] = (this.f27679j.nextInt() % 500) / 1000.0f;
                }
            }
            float f13 = this.f27682m;
            if (z12) {
                f11 = 2.0f * f13;
            } else {
                f11 = f13;
            }
            if (this.f27685p > 6) {
                float f14 = 0.0f;
                for (int i13 = 0; i13 < 6; i13++) {
                    f14 += fArr5[i13];
                }
                float f15 = f14 / 6.0f;
                if (f15 > 0.52f) {
                    f11 = j3.r0.C(f15, 0.4f, f13, f11);
                }
            }
            while (true) {
                fArr2 = this.f27675e;
                if (i9 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i9] = 0.0f;
                } else {
                    fArr4[i9] = fArr[i9];
                }
                if (this.f27678i == null) {
                    fArr3[i9] = fArr4[i9];
                } else if (i9 == 6) {
                    fArr2[i9] = (fArr4[i9] - fArr3[i9]) / (80.0f + f13);
                } else {
                    fArr2[i9] = (fArr4[i9] - fArr3[i9]) / f11;
                }
                i9++;
            }
            if (z10) {
                f12 = 1.0f;
            }
            fArr4[7] = f12;
            fArr2[7] = (f12 - fArr3[7]) / 120.0f;
        }
    }
}
