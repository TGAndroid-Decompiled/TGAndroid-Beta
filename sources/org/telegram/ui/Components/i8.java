package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
public final class i8 {
    public float f24857f;
    public boolean f24858g;
    public final Paint h;
    public org.telegram.ui.Cells.t1 f24859i;
    public int f24866p;
    public int f24867q;
    public float f24868r;
    public final int[] f24855b = new int[3];
    public final float[] f24856c = new float[8];
    public final float[] d = new float[8];
    public final float[] e = new float[8];
    public final Random f24860j = new Random();
    public final float f24861k = AndroidUtilities.dp(6.0f) * 0.33f;
    public final float f24862l = AndroidUtilities.dp(12.0f) * 0.36f;
    public final float f24863m = 120.0f;
    public final int f24864n = 61;
    public final float[] f24865o = new float[6];
    public final sp[] f24854a = new sp[2];

    public i8() {
        for (int i10 = 0; i10 < 2; i10++) {
            sp[] spVarArr = this.f24854a;
            sp spVar = new sp();
            spVarArr[i10] = spVar;
            spVar.f27903g = AndroidUtilities.dp(24.0f);
            spVar.f27906k = 1.0f;
        }
        this.h = new Paint(1);
    }

    public final void a(float f7, float f10, float f11, int i10, Canvas canvas) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        Paint paint = this.h;
        paint.setColor(i10);
        paint.setAlpha((int) (this.f24864n * f11));
        b(canvas, f7, f10);
    }

    public final void b(Canvas canvas, float f7, float f10) {
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
                float[] fArr2 = this.f24856c;
                float f12 = fArr2[i10];
                float f13 = fArr[i10];
                if (f12 != f13) {
                    float[] fArr3 = this.e;
                    float f14 = (fArr3[i10] * 16.0f) + f13;
                    fArr[i10] = f14;
                    float f15 = fArr3[i10];
                    if ((f15 > 0.0f && f14 > fArr2[i10]) || (f15 < 0.0f && f14 < fArr2[i10])) {
                        fArr[i10] = fArr2[i10];
                    }
                    this.f24859i.invalidate();
                }
                i10++;
            }
            if (this.f24858g) {
                float f16 = this.f24857f + 0.02f;
                this.f24857f = f16;
                if (f16 > 1.0f) {
                    this.f24858g = false;
                    this.f24857f = 1.0f;
                }
            } else {
                float f17 = this.f24857f - 0.02f;
                this.f24857f = f17;
                if (f17 < 0.0f) {
                    this.f24858g = true;
                    this.f24857f = 0.0f;
                }
            }
            float f18 = fArr[7];
            float f19 = fArr[6] * fArr[0];
            if (f18 == 0.0f && f19 == 0.0f) {
                return;
            }
            int i11 = 0;
            while (true) {
                f11 = this.f24862l;
                iArr = this.f24855b;
                if (i11 >= 3) {
                    break;
                }
                iArr[i11] = (int) (fArr[i11] * f11);
                i11++;
            }
            sp[] spVarArr = this.f24854a;
            sp spVar = spVarArr[0];
            for (int i12 = 0; i12 < spVar.f27902f; i12 += 2) {
                float[] fArr4 = spVar.f27905j;
                fArr4[i12] = iArr[i12 / 2];
                fArr4[i12 + 1] = 0.0f;
            }
            for (int i13 = 0; i13 < 3; i13++) {
                iArr[i13] = (int) (fArr[i13 + 3] * f11);
            }
            sp spVar2 = spVarArr[1];
            for (int i14 = 0; i14 < spVar2.f27902f; i14 += 2) {
                float[] fArr5 = spVar2.f27905j;
                fArr5[i14] = iArr[i14 / 2];
                fArr5[i14 + 1] = 0.0f;
            }
            float dp = (this.f24861k * f18) + (AndroidUtilities.dp(4.0f) * f19) + AndroidUtilities.dp(22.0f);
            if (dp > AndroidUtilities.dp(26.0f)) {
                dp = AndroidUtilities.dp(26.0f);
            }
            sp spVar3 = spVarArr[0];
            spVarArr[1].f27903g = dp;
            spVar3.f27903g = dp;
            canvas.save();
            float f20 = (float) (this.f24868r + 0.6d);
            this.f24868r = f20;
            canvas.rotate(f20, f7, f10);
            canvas.save();
            float f21 = (this.f24857f * 0.04f) + 1.0f;
            canvas.scale(f21, f21, f7, f10);
            sp spVar4 = spVarArr[0];
            Paint paint = this.h;
            spVar4.a(f7, f10, canvas, paint);
            canvas.restore();
            canvas.rotate(60.0f, f7, f10);
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f24857f, 0.04f, 1.0f);
            canvas.scale(z10, z10, f7, f10);
            spVarArr[1].a(f7, f10, canvas, paint);
            canvas.restore();
        }
    }

    public final void c(Canvas canvas, float f7, float f10, boolean z10, float f11, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!LiteMode.isEnabled(32)) {
            return;
        }
        int i10 = this.f24864n;
        Paint paint = this.h;
        if (z10) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Nb, f6Var));
            paint.setAlpha((int) (i10 * f11));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18961ie, f6Var));
            paint.setAlpha((int) (i10 * f11));
        }
        b(canvas, f7, f10);
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var) {
        this.f24859i = t1Var;
    }

    public final void e(boolean z10, boolean z11, float[] fArr) {
        boolean z12;
        float f7;
        float f10;
        float[] fArr2;
        if (LiteMode.isEnabled(32)) {
            float[] fArr3 = this.d;
            float f11 = 0.0f;
            float[] fArr4 = this.f24856c;
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
            float[] fArr5 = this.f24865o;
            if (fArr != null && f7 > 0.4d) {
                int i11 = this.f24867q;
                fArr5[i11] = f7;
                int i12 = i11 + 1;
                this.f24867q = i12;
                if (i12 > 5) {
                    this.f24867q = 0;
                }
                this.f24866p++;
            } else {
                this.f24866p = 0;
            }
            if (z12) {
                for (int i13 = 0; i13 < 6; i13++) {
                    fArr[i13] = (this.f24860j.nextInt() % 500) / 1000.0f;
                }
            }
            float f12 = this.f24863m;
            if (z12) {
                f10 = 2.0f * f12;
            } else {
                f10 = f12;
            }
            if (this.f24866p > 6) {
                float f13 = 0.0f;
                for (int i14 = 0; i14 < 6; i14++) {
                    f13 += fArr5[i14];
                }
                float f14 = f13 / 6.0f;
                if (f14 > 0.52f) {
                    f10 = com.google.android.gms.internal.vision.e2.b(f14, 0.4f, f12, f10);
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
                if (this.f24859i == null) {
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
