package org.telegram.ui.Cells;

import android.content.Context;
public final class c4 extends org.telegram.ui.ActionBar.l5 {
    public float M0;
    public final int N0;
    public final f4 O0;

    public c4(f4 f4Var, Context context, int i7) {
        super(context);
        this.O0 = f4Var;
        this.N0 = i7;
    }

    @Override
    public final float getAlpha() {
        return this.M0;
    }

    @Override
    public final void setAlpha(float f10) {
        this.M0 = f10;
        f4 f4Var = this.O0;
        if (this.N0 == 4) {
            float fullAlpha = f4Var.d[4].getFullAlpha();
            if (f4Var.c()) {
                float f11 = f4Var.f29113e0;
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
        super.setAlpha((1.0f - f4Var.d[4].getFullAlpha()) * f10);
    }

    @Override
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.l5[] l5VarArr = this.O0.d;
            if (i7 < l5VarArr.length) {
                org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[i7];
                l5Var.setAlpha(l5Var.getAlpha());
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (this.N0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
