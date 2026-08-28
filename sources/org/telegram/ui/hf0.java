package org.telegram.ui;

import android.content.Context;
public final class hf0 extends org.telegram.ui.Components.voip.m2 {
    public final int f38770e;
    public final org.telegram.ui.Components.cv0 f38771f;

    public hf0(jf0 jf0Var, Context context, int i9) {
        super(jf0Var.f39488o0, context);
        this.f38770e = i9;
        switch (i9) {
            case 1:
                this.f38771f = jf0Var;
                super(jf0Var.f39488o0, context);
                return;
            default:
                this.f38771f = jf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f38770e) {
            case 0:
                return ((jf0) this.f38771f).f39477e0;
            case 1:
                return ((jf0) this.f38771f).f39477e0;
            default:
                return ((ge0) this.f38771f).I;
        }
    }

    @Override
    public final boolean b() {
        hf0 hf0Var;
        switch (this.f38770e) {
            case 0:
                if (getVisibility() == 0) {
                    jf0 jf0Var = (jf0) this.f38771f;
                    if (jf0Var.R <= 0 || jf0Var.N == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                jf0 jf0Var2 = (jf0) this.f38771f;
                if (isClickable() && getVisibility() == 0 && !jf0Var2.W && (((hf0Var = jf0Var2.v) == null || hf0Var.getVisibility() == 8) && !jf0Var2.f39477e0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ge0 ge0Var = (ge0) this.f38771f;
                    if (ge0Var.L <= 0 || ge0Var.J == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public hf0(ge0 ge0Var, Context context) {
        super(ge0Var.T, context);
        this.f38770e = 2;
        this.f38771f = ge0Var;
    }
}
