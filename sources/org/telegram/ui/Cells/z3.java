package org.telegram.ui.Cells;

import android.content.Context;
public final class z3 extends org.telegram.ui.ActionBar.l5 {
    public float J0;
    public final int K0;
    public final e4 L0;

    public z3(e4 e4Var, Context context, int i10) {
        super(context);
        this.L0 = e4Var;
        this.K0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.J0;
    }

    @Override
    public final void setAlpha(float f10) {
        this.J0 = f10;
        e4 e4Var = this.L0;
        if (this.K0 == 4) {
            float fullAlpha = e4Var.d[4].getFullAlpha();
            if (e4Var.c()) {
                float f11 = e4Var.f22745b0;
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
        super.setAlpha((1.0f - e4Var.d[4].getFullAlpha()) * f10);
    }

    @Override
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.L0.d;
            if (i10 < l5VarArr.length) {
                org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i10];
                l5Var.setAlpha(l5Var.getAlpha());
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
