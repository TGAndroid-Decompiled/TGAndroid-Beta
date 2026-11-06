package org.telegram.ui;

import android.content.Context;
public final class ed0 extends db0 {
    public final int f45322e;
    public final org.telegram.ui.Components.wt0 f45323f;

    public ed0(gd0 gd0Var, Context context, int i7) {
        super(gd0Var.f45981u0, context);
        this.f45322e = i7;
        switch (i7) {
            case 1:
                this.f45323f = gd0Var;
                super(gd0Var.f45981u0, context);
                return;
            default:
                this.f45323f = gd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f45322e) {
            case 0:
                return ((gd0) this.f45323f).f45969k0;
            case 1:
                return ((gd0) this.f45323f).f45969k0;
            default:
                return ((ec0) this.f45323f).M;
        }
    }

    @Override
    public final boolean b() {
        ed0 ed0Var;
        switch (this.f45322e) {
            case 0:
                if (getVisibility() == 0) {
                    gd0 gd0Var = (gd0) this.f45323f;
                    if (gd0Var.f45955a0 <= 0 || gd0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                gd0 gd0Var2 = (gd0) this.f45323f;
                if (isClickable() && getVisibility() == 0 && !gd0Var2.f45964f0 && (((ed0Var = gd0Var2.f45982w) == null || ed0Var.getVisibility() == 8) && !gd0Var2.f45969k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f45323f;
                    if (ec0Var.P <= 0 || ec0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ed0(ec0 ec0Var, Context context) {
        super(ec0Var.f45261a0, context);
        this.f45322e = 2;
        this.f45323f = ec0Var;
    }
}
