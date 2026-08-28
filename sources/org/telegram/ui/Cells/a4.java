package org.telegram.ui.Cells;

import android.content.Context;
public final class a4 extends org.telegram.ui.ActionBar.h5 {
    public float I0;
    public final int J0;
    public final e4 K0;

    public a4(e4 e4Var, Context context, int i9) {
        super(context);
        this.K0 = e4Var;
        this.J0 = i9;
    }

    @Override
    public final float getAlpha() {
        return this.I0;
    }

    @Override
    public final void setAlpha(float f10) {
        this.I0 = f10;
        e4 e4Var = this.K0;
        if (this.J0 == 4) {
            float fullAlpha = e4Var.d[4].getFullAlpha();
            if (e4Var.c()) {
                float f11 = e4Var.f24289a0;
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
        int i9 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.K0.d;
            if (i9 < h5VarArr.length) {
                org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i9];
                h5Var.setAlpha(h5Var.getAlpha());
                i9++;
            } else {
                return;
            }
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
