package org.telegram.ui.Cells;

import android.content.Context;
public final class c4 extends org.telegram.ui.ActionBar.k5 {
    public float N0;
    public final int O0;
    public final f4 P0;

    public c4(f4 f4Var, Context context, int i3) {
        super(context);
        this.P0 = f4Var;
        this.O0 = i3;
    }

    @Override
    public final float getAlpha() {
        return this.N0;
    }

    @Override
    public final void setAlpha(float f10) {
        this.N0 = f10;
        f4 f4Var = this.P0;
        if (this.O0 == 4) {
            float fullAlpha = f4Var.d[4].getFullAlpha();
            if (f4Var.c()) {
                float f11 = f4Var.f29166f0;
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
        int i3 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.P0.d;
            if (i3 < k5VarArr.length) {
                org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i3];
                k5Var.setAlpha(k5Var.getAlpha());
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        if (this.O0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
