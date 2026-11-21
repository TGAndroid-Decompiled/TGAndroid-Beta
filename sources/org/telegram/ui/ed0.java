package org.telegram.ui;

import android.content.Context;
public final class ed0 extends eb0 {
    public final int f47243e;
    public final org.telegram.ui.Components.iu0 f47244f;

    public ed0(gd0 gd0Var, Context context, int i7) {
        super(gd0Var.f48080v0, context);
        this.f47243e = i7;
        switch (i7) {
            case 1:
                this.f47244f = gd0Var;
                super(gd0Var.f48080v0, context);
                return;
            default:
                this.f47244f = gd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f47243e) {
            case 0:
                return ((gd0) this.f47244f).f48068l0;
            case 1:
                return ((gd0) this.f47244f).f48068l0;
            default:
                return ((ec0) this.f47244f).N;
        }
    }

    @Override
    public final boolean b() {
        ed0 ed0Var;
        switch (this.f47243e) {
            case 0:
                if (getVisibility() == 0) {
                    gd0 gd0Var = (gd0) this.f47244f;
                    if (gd0Var.f48055b0 <= 0 || gd0Var.U == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                gd0 gd0Var2 = (gd0) this.f47244f;
                if (isClickable() && getVisibility() == 0 && !gd0Var2.f48063g0 && (((ed0Var = gd0Var2.f48081w) == null || ed0Var.getVisibility() == 8) && !gd0Var2.f48068l0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f47244f;
                    if (ec0Var.Q <= 0 || ec0Var.O == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ed0(ec0 ec0Var, Context context) {
        super(ec0Var.f47231b0, context);
        this.f47243e = 2;
        this.f47244f = ec0Var;
    }
}
