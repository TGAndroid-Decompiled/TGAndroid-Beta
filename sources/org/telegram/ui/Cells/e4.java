package org.telegram.ui.Cells;

import android.content.Context;
public final class e4 extends org.telegram.ui.ActionBar.b6 {
    public float M0;
    public final int N0;
    public final i4 O0;

    public e4(i4 i4Var, Context context, int i10) {
        super(context);
        this.O0 = i4Var;
        this.N0 = i10;
    }

    @Override
    public final float getAlpha() {
        return this.M0;
    }

    @Override
    public final void setAlpha(float f7) {
        this.M0 = f7;
        i4 i4Var = this.O0;
        if (this.N0 == 4) {
            float fullAlpha = i4Var.d[4].getFullAlpha();
            if (i4Var.c()) {
                float f10 = i4Var.f24228e0;
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
        super.setAlpha((1.0f - i4Var.d[4].getFullAlpha()) * f7);
    }

    @Override
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.b6[] b6VarArr = this.O0.d;
            if (i10 < b6VarArr.length) {
                org.telegram.ui.ActionBar.b6 b6Var = b6VarArr[i10];
                b6Var.setAlpha(b6Var.getAlpha());
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
