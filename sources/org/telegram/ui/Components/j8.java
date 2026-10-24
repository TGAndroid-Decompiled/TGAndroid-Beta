package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class j8 {
    public float f27607f;
    public boolean f27608g;
    public final Paint h;
    public org.telegram.ui.Cells.t1 f27609i;
    public int f27616p;
    public int f27617q;
    public float f27618r;
    public final int[] f27605b = new int[3];
    public final float[] f27606c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random f27610j = new Random();
    public final float f27611k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f27612l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f27613m = 120.0f;
    public final int f27614n = 61;
    public final float[] f27615o = new float[6];
    public final bq[] f27604a = new bq[2];

    public j8() {
        for (int i10 = 0; i10 < 2; i10++) {
            bq[] bqVarArr = this.f27604a;
            bq bqVar = new bq();
            bqVarArr[i10] = bqVar;
            bqVar.f25070g = AndroidUtilities.dp(24.0f);
            bqVar.f25073k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f7, float f10, float f11, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f27614n * f11));
        b(canvas, f7, f10);
    }

    public final void b(Canvas canvas, float f7, float f10) {
        float[] fArr;
        float f11;
        int[] iArr;
        if (LiteMode.isEnabled(32)) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                fArr = this.d;
                if (i11 >= 8) {
                    break;
                }
                float[] fArr2 = this.f27606c;
                float f12 = fArr2[i11];
                float f13 = fArr[i11];
                if (f12 != f13) {
                    float[] fArr3 = this.e;
                    float f14 = (fArr3[i11] * 16.0f) + f13;
                    fArr[i11] = f14;
                    float f15 = fArr3[i11];
                    if ((f15 > 0.0f && f14 > fArr2[i11]) || (f15 < 0.0f && f14 < fArr2[i11])) {
                        fArr[i11] = fArr2[i11];
                    }
                    this.f27609i.invalidate();
                }
                i11++;
            }
            char c10 = 1;
            if (this.f27608g) {
                float f16 = this.f27607f + 0.02f;
                this.f27607f = f16;
                if (f16 > 1.0f) {
                    this.f27608g = false;
                    this.f27607f = 1.0f;
                }
            } else {
                float f17 = this.f27607f - 0.02f;
                this.f27607f = f17;
                if (f17 < 0.0f) {
                    this.f27608g = true;
                    this.f27607f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i12 = 0;
            while (true) {
                f11 = this.f27612l;
                iArr = this.f27605b;
                if (i12 >= 3) {
                    break;
                }
                iArr[i12] = (int) (fArr[i12] * f11);
                i12++;
            }
            bq[] bqVarArr = this.f27604a;
            bq bqVar = bqVarArr[0];
            while (i10 < bqVar.f25069f) {
                float[] fArr4 = bqVar.f25072j;
                fArr4[i10] = iArr[i10 / 2];
                fArr4[i10 + 1] = 0.0f;
                i10 += 2;
                c10 = c10;
            }
            char c11 = c10;
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            bq bqVar2 = bqVarArr[c11];
            for (int i14 = 0; i14 < bqVar2.f25069f; i14 += 2) {
                float[] fArr5 = bqVar2.f25072j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f27611k * f18) + (AndroidUtilities.dp(4.0f) * f19) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            bq bqVar3 = bqVarArr[0];
            bqVarArr[c11].f25070g = dp;
            bqVar3.f25070g = dp;
            canvas.save();
            float f20 = (float) (this.f27618r + 0.6d);
            this.f27618r = f20;
            canvas.rotate(f20, f7, f10);
            canvas.save();
            float f21 = (this.f27607f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f7, f10);
            bq bqVar4 = bqVarArr[0];
            Paint paint = this.h;
            bqVar4.a(f7, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f7, f10);
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.f27607f, 0.04f, 1.0f);
            canvas.scale(y3, y3, f7, f10);
            bqVarArr[c11].a(f7, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f7, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.g6 g6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f27614n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Nb, g6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21280ie, g6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f7, f10);
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var) {
        this.f27609i = t1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f7;
        float f10;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f11 = 0.0f;
            float[] fArr4 = this.f27606c;
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
                f7 = 0.0f;
            } else {
                f7 = fArr[6];
            }
            float[] fArr5 = this.f27615o;
            if (fArr != null && f7 > 0.4d) {
                int i11 = this.f27617q;
                fArr5[i11] = f7;
                int i12 = i11 + 1;
                this.f27617q = i12;
                if (i12 > 5) {
                    this.f27617q = 0;
                }
                this.f27616p++;
            } else {
                this.f27616p = 0;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f27610j.nextInt() % 500) / 1000.0f;
                }
            }
            float f12 = this.f27613m;
            if (z12) {
                f10 = 2.0f * f12;
            } else {
                f10 = f12;
            }
            if (this.f27616p > 6) {
                float f13 = 0.0f;
                for (int i14 = 0; i14 < 6; i14++) {
                    f13 += fArr5[i14];
                }
                float f14 = f13 / 6.0f;
                if (f14 > 0.52f) {
                    f10 = com.google.android.gms.internal.play_billing.k3.D(f14, 0.4f, f12, f10);
                }
            }
            while (true) {
                fArr2 = this.e;
                if (i10 >= 7) {
                    break;
                }
                if (fArr == null) {
                    fArr4[i10] = 0.0f;
                } else {
                    fArr4[i10] = fArr[i10];
                }
                if (this.f27609i == null) {
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
