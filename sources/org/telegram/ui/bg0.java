package org.telegram.ui;

import android.content.Context;
public final class bg0 extends org.telegram.ui.Components.voip.l2 {
    public final int e;
    public final org.telegram.ui.Components.tw0 f34327f;

    public bg0(dg0 dg0Var, Context context, int i10) {
        super(dg0Var.f35010s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f34327f = dg0Var;
                super(dg0Var.f35010s0, context);
                return;
            default:
                this.f34327f = dg0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((dg0) this.f34327f).f34998i0;
            case 1:
                return ((dg0) this.f34327f).f34998i0;
            default:
                return ((bf0) this.f34327f).M;
        }
    }

    @Override
    public final boolean b() {
        bg0 bg0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    dg0 dg0Var = (dg0) this.f34327f;
                    if (dg0Var.V <= 0 || dg0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                dg0 dg0Var2 = (dg0) this.f34327f;
                if (isClickable() && getVisibility() == 0 && !dg0Var2.f34992d0 && (((bg0Var = dg0Var2.v) == null || bg0Var.getVisibility() == 8) && !dg0Var2.f34998i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    bf0 bf0Var = (bf0) this.f34327f;
                    if (bf0Var.P <= 0 || bf0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public bg0(bf0 bf0Var, Context context) {
        super(bf0Var.f34312a0, context);
        this.e = 2;
        this.f34327f = bf0Var;
    }
}
