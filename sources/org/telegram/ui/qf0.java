package org.telegram.ui;

import android.content.Context;
public final class qf0 extends org.telegram.ui.Components.voip.o2 {
    public final int f40460e;
    public final org.telegram.ui.Components.vv0 f40461f;

    public qf0(sf0 sf0Var, Context context, int i10) {
        super(sf0Var.f41181p0, context);
        this.f40460e = i10;
        switch (i10) {
            case 1:
                this.f40461f = sf0Var;
                super(sf0Var.f41181p0, context);
                return;
            default:
                this.f40461f = sf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f40460e) {
            case 0:
                return ((sf0) this.f40461f).f41171f0;
            case 1:
                return ((sf0) this.f40461f).f41171f0;
            default:
                return ((pe0) this.f40461f).J;
        }
    }

    @Override
    public final boolean b() {
        qf0 qf0Var;
        switch (this.f40460e) {
            case 0:
                if (getVisibility() == 0) {
                    sf0 sf0Var = (sf0) this.f40461f;
                    if (sf0Var.S <= 0 || sf0Var.O == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                sf0 sf0Var2 = (sf0) this.f40461f;
                if (isClickable() && getVisibility() == 0 && !sf0Var2.f41162a0 && (((qf0Var = sf0Var2.v) == null || qf0Var.getVisibility() == 8) && !sf0Var2.f41171f0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    pe0 pe0Var = (pe0) this.f40461f;
                    if (pe0Var.M <= 0 || pe0Var.K == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public qf0(pe0 pe0Var, Context context) {
        super(pe0Var.U, context);
        this.f40460e = 2;
        this.f40461f = pe0Var;
    }
}
