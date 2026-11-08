package org.telegram.ui;

import android.content.Context;
public final class ed0 extends db0 {
    public final int f45280e;
    public final org.telegram.ui.Components.wt0 f45281f;

    public ed0(gd0 gd0Var, Context context, int i7) {
        super(gd0Var.f45982u0, context);
        this.f45280e = i7;
        switch (i7) {
            case 1:
                this.f45281f = gd0Var;
                super(gd0Var.f45982u0, context);
                return;
            default:
                this.f45281f = gd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f45280e) {
            case 0:
                return ((gd0) this.f45281f).f45970k0;
            case 1:
                return ((gd0) this.f45281f).f45970k0;
            default:
                return ((ec0) this.f45281f).M;
        }
    }

    @Override
    public final boolean b() {
        ed0 ed0Var;
        switch (this.f45280e) {
            case 0:
                if (getVisibility() == 0) {
                    gd0 gd0Var = (gd0) this.f45281f;
                    if (gd0Var.f45956a0 <= 0 || gd0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                gd0 gd0Var2 = (gd0) this.f45281f;
                if (isClickable() && getVisibility() == 0 && !gd0Var2.f45965f0 && (((ed0Var = gd0Var2.f45983w) == null || ed0Var.getVisibility() == 8) && !gd0Var2.f45970k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f45281f;
                    if (ec0Var.P <= 0 || ec0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ed0(ec0 ec0Var, Context context) {
        super(ec0Var.f45263a0, context);
        this.f45280e = 2;
        this.f45281f = ec0Var;
    }
}
