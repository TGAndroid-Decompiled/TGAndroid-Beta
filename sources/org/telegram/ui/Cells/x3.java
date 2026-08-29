package org.telegram.ui.Cells;

import android.content.Context;
public final class x3 extends org.telegram.ui.ActionBar.h5 {
    public float I0;
    public final int J0;
    public final c4 K0;

    public x3(c4 c4Var, Context context, int i10) {
        super(context);
        this.K0 = c4Var;
        this.J0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.I0;
    }

    @Override
    public final void setAlpha(float f9) {
        this.I0 = f9;
        c4 c4Var = this.K0;
        if (this.J0 == 4) {
            float fullAlpha = c4Var.d[4].getFullAlpha();
            if (c4Var.c()) {
                float f10 = c4Var.f24153a0;
                if (f10 > 0.0f) {
                    super.setAlpha(1.0f - f10);
                    return;
                }
            }
            if (fullAlpha > 0.0f) {
                super.setAlpha(Math.max(f9, fullAlpha));
                return;
            } else {
                super.setAlpha(f9);
                return;
            }
        }
        super.setAlpha((1.0f - c4Var.d[4].getFullAlpha()) * f9);
    }

    @Override
    public final void setFullAlpha(float f9) {
        super.setFullAlpha(f9);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.K0.d;
            if (i10 < h5VarArr.length) {
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
                h5Var.setAlpha(h5Var.getAlpha());
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        if (this.J0 == 4 && getFullAlpha() > 0.0f) {
            f9 = 0.0f;
        }
        super.setTranslationY(f9);
    }
}
