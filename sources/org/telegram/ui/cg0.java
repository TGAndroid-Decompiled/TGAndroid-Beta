package org.telegram.ui;

import android.content.Context;
public final class cg0 extends org.telegram.ui.Components.voip.l2 {
    public final int e;
    public final org.telegram.ui.Components.tw0 f34946f;

    public cg0(eg0 eg0Var, Context context, int i10) {
        super(eg0Var.f35566s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f34946f = eg0Var;
                super(eg0Var.f35566s0, context);
                return;
            default:
                this.f34946f = eg0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((eg0) this.f34946f).f35554i0;
            case 1:
                return ((eg0) this.f34946f).f35554i0;
            default:
                return ((cf0) this.f34946f).M;
        }
    }

    @Override
    public final boolean b() {
        cg0 cg0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    eg0 eg0Var = (eg0) this.f34946f;
                    if (eg0Var.V <= 0 || eg0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                eg0 eg0Var2 = (eg0) this.f34946f;
                if (isClickable() && getVisibility() == 0 && !eg0Var2.f35548d0 && (((cg0Var = eg0Var2.v) == null || cg0Var.getVisibility() == 8) && !eg0Var2.f35554i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    cf0 cf0Var = (cf0) this.f34946f;
                    if (cf0Var.P <= 0 || cf0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public cg0(cf0 cf0Var, Context context) {
        super(cf0Var.f34926a0, context);
        this.e = 2;
        this.f34946f = cf0Var;
    }
}
