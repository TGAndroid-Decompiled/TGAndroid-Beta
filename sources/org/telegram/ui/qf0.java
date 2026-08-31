package org.telegram.ui;

import android.content.Context;
public final class qf0 extends org.telegram.ui.Components.voip.o2 {
    public final int f40468e;
    public final org.telegram.ui.Components.wv0 f40469f;

    public qf0(sf0 sf0Var, Context context, int i10) {
        super(sf0Var.f41271p0, context);
        this.f40468e = i10;
        switch (i10) {
            case 1:
                this.f40469f = sf0Var;
                super(sf0Var.f41271p0, context);
                return;
            default:
                this.f40469f = sf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f40468e) {
            case 0:
                return ((sf0) this.f40469f).f41261f0;
            case 1:
                return ((sf0) this.f40469f).f41261f0;
            default:
                return ((qe0) this.f40469f).J;
        }
    }

    @Override
    public final boolean b() {
        qf0 qf0Var;
        switch (this.f40468e) {
            case 0:
                if (getVisibility() == 0) {
                    sf0 sf0Var = (sf0) this.f40469f;
                    if (sf0Var.S <= 0 || sf0Var.O == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                sf0 sf0Var2 = (sf0) this.f40469f;
                if (isClickable() && getVisibility() == 0 && !sf0Var2.f41252a0 && (((qf0Var = sf0Var2.v) == null || qf0Var.getVisibility() == 8) && !sf0Var2.f41261f0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    qe0 qe0Var = (qe0) this.f40469f;
                    if (qe0Var.M <= 0 || qe0Var.K == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public qf0(qe0 qe0Var, Context context) {
        super(qe0Var.U, context);
        this.f40468e = 2;
        this.f40469f = qe0Var;
    }
}
