package org.telegram.ui.Cells;

import android.content.Context;

public final class x3 extends org.telegram.ui.ActionBar.h5 {
    public float I0;
    public final int J0;
    public final b4 K0;

    public x3(b4 b4Var, Context context, int i10) {
        super(context);
        this.K0 = b4Var;
        this.J0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.I0;
    }

    @Override
    public final void setAlpha(float f10) {
        this.I0 = f10;
        b4 b4Var = this.K0;
        if (this.J0 != 4) {
            super.setAlpha((1.0f - b4Var.d[4].getFullAlpha()) * f10);
            return;
        }
        float fullAlpha = b4Var.d[4].getFullAlpha();
        if (b4Var.c()) {
            float f11 = b4Var.f24096a0;
            if (f11 > 0.0f) {
                super.setAlpha(1.0f - f11);
                return;
            }
        }
        if (fullAlpha > 0.0f) {
            super.setAlpha(Math.max(f10, fullAlpha));
        } else {
            super.setAlpha(f10);
        }
    }

    @Override
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.K0.d;
            if (i10 >= h5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i10];
            h5Var.setAlpha(h5Var.getAlpha());
            i10++;
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (this.J0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
