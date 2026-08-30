package org.telegram.ui;

import android.content.Context;
public final class pf0 extends org.telegram.ui.Components.voip.n2 {
    public final int e;
    public final org.telegram.ui.Components.vv0 f37301f;

    public pf0(rf0 rf0Var, Context context, int i10) {
        super(rf0Var.f38034p0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f37301f = rf0Var;
                super(rf0Var.f38034p0, context);
                return;
            default:
                this.f37301f = rf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((rf0) this.f37301f).f38024f0;
            case 1:
                return ((rf0) this.f37301f).f38024f0;
            default:
                return ((pe0) this.f37301f).J;
        }
    }

    @Override
    public final boolean b() {
        pf0 pf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    rf0 rf0Var = (rf0) this.f37301f;
                    if (rf0Var.S <= 0 || rf0Var.O == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                rf0 rf0Var2 = (rf0) this.f37301f;
                if (isClickable() && getVisibility() == 0 && !rf0Var2.f38016a0 && (((pf0Var = rf0Var2.v) == null || pf0Var.getVisibility() == 8) && !rf0Var2.f38024f0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    pe0 pe0Var = (pe0) this.f37301f;
                    if (pe0Var.M <= 0 || pe0Var.K == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public pf0(pe0 pe0Var, Context context) {
        super(pe0Var.U, context);
        this.e = 2;
        this.f37301f = pe0Var;
    }
}
