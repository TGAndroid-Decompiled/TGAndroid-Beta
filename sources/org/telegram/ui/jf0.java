package org.telegram.ui;

import android.content.Context;
public final class jf0 extends fd0 {
    public final int e;
    public final org.telegram.ui.Components.bx0 f40525f;

    public jf0(lf0 lf0Var, Context context, int i10) {
        super(lf0Var.f41134u0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f40525f = lf0Var;
                super(lf0Var.f41134u0, context);
                return;
            default:
                this.f40525f = lf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((lf0) this.f40525f).f41122k0;
            case 1:
                return ((lf0) this.f40525f).f41122k0;
            default:
                return ((ie0) this.f40525f).M;
        }
    }

    @Override
    public final boolean b() {
        jf0 jf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    lf0 lf0Var = (lf0) this.f40525f;
                    if (lf0Var.f41109a0 <= 0 || lf0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                lf0 lf0Var2 = (lf0) this.f40525f;
                if (isClickable() && getVisibility() == 0 && !lf0Var2.f41117f0 && (((jf0Var = lf0Var2.v) == null || jf0Var.getVisibility() == 8) && !lf0Var2.f41122k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ie0 ie0Var = (ie0) this.f40525f;
                    if (ie0Var.P <= 0 || ie0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public jf0(ie0 ie0Var, Context context) {
        super(ie0Var.f40121a0, context);
        this.e = 2;
        this.f40525f = ie0Var;
    }
}
