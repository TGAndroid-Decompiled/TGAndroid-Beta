package org.telegram.ui;

import android.content.Context;
public final class hf0 extends dd0 {
    public final int e;
    public final org.telegram.ui.Components.ax0 f40001f;

    public hf0(jf0 jf0Var, Context context, int i10) {
        super(jf0Var.f40619u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f40001f = jf0Var;
                super(jf0Var.f40619u0, context);
                return;
            default:
                this.f40001f = jf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((jf0) this.f40001f).f40607k0;
            case 1:
                return ((jf0) this.f40001f).f40607k0;
            default:
                return ((ge0) this.f40001f).M;
        }
    }

    @Override
    public final boolean b() {
        hf0 hf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    jf0 jf0Var = (jf0) this.f40001f;
                    if (jf0Var.f40594a0 <= 0 || jf0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                jf0 jf0Var2 = (jf0) this.f40001f;
                if (isClickable() && getVisibility() == 0 && !jf0Var2.f40602f0 && (((hf0Var = jf0Var2.v) == null || hf0Var.getVisibility() == 8) && !jf0Var2.f40607k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ge0 ge0Var = (ge0) this.f40001f;
                    if (ge0Var.P <= 0 || ge0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public hf0(ge0 ge0Var, Context context) {
        super(ge0Var.f39628a0, context);
        this.e = 2;
        this.f40001f = ge0Var;
    }
}
