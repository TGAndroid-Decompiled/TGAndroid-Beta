package org.telegram.ui.Cells;

import android.content.Context;
public final class b4 extends org.telegram.ui.ActionBar.j5 {
    public float M0;
    public final int N0;
    public final f4 O0;

    public b4(f4 f4Var, Context context, int i10) {
        super(context);
        this.O0 = f4Var;
        this.N0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.M0;
    }

    @Override
    public final void setAlpha(float f7) {
        this.M0 = f7;
        f4 f4Var = this.O0;
        if (this.N0 == 4) {
            float fullAlpha = f4Var.d[4].getFullAlpha();
            if (f4Var.c()) {
                float f10 = f4Var.f20293e0;
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
        super.setAlpha((1.0f - f4Var.d[4].getFullAlpha()) * f7);
    }

    @Override
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.O0.d;
            if (i10 < j5VarArr.length) {
                org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i10];
                j5Var.setAlpha(j5Var.getAlpha());
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
