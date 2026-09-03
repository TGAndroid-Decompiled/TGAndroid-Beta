package org.telegram.ui.Cells;

import android.content.Context;
public final class y3 extends org.telegram.ui.ActionBar.k5 {
    public float J0;
    public final int K0;
    public final d4 L0;

    public y3(d4 d4Var, Context context, int i10) {
        super(context);
        this.L0 = d4Var;
        this.K0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.J0;
    }

    @Override
    public final void setAlpha(float f10) {
        this.J0 = f10;
        d4 d4Var = this.L0;
        if (this.K0 == 4) {
            float fullAlpha = d4Var.d[4].getFullAlpha();
            if (d4Var.c()) {
                float f11 = d4Var.f20921b0;
                if (f11 > 0.0f) {
                    super.setAlpha(1.0f - f11);
                    return;
                }
            }
            if (fullAlpha > 0.0f) {
                super.setAlpha(Math.max(f10, fullAlpha));
                return;
            } else {
                super.setAlpha(f10);
                return;
            }
        }
        super.setAlpha((1.0f - d4Var.d[4].getFullAlpha()) * f10);
    }

    @Override
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.L0.d;
            if (i10 < k5VarArr.length) {
                org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i10];
                k5Var.setAlpha(k5Var.getAlpha());
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (this.K0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
