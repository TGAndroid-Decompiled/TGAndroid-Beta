package org.telegram.ui.Cells;

import android.content.Context;
public final class a4 extends org.telegram.ui.ActionBar.h5 {
    public float M0;
    public final int N0;
    public final e4 O0;

    public a4(e4 e4Var, Context context, int i10) {
        super(context);
        this.O0 = e4Var;
        this.N0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.M0;
    }

    @Override
    public final void setAlpha(float f7) {
        this.M0 = f7;
        e4 e4Var = this.O0;
        if (this.N0 == 4) {
            float fullAlpha = e4Var.d[4].getFullAlpha();
            if (e4Var.c()) {
                float f10 = e4Var.f20232e0;
                if (f10 > 0.0f) {
                    super.setAlpha(1.0f - f10);
                    return;
                }
            }
            if (fullAlpha > 0.0f) {
                super.setAlpha(Math.max(f7, fullAlpha));
                return;
            } else {
                super.setAlpha(f7);
                return;
            }
        }
        super.setAlpha((1.0f - e4Var.d[4].getFullAlpha()) * f7);
    }

    @Override
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.O0.d;
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
    public final void setTranslationY(float f7) {
        if (this.N0 == 4 && getFullAlpha() > 0.0f) {
            f7 = 0.0f;
        }
        super.setTranslationY(f7);
    }
}
