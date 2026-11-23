package org.telegram.ui;

import android.content.Context;
public final class ed0 extends db0 {
    public final int f47508e;
    public final org.telegram.ui.Components.hu0 f47509f;

    public ed0(gd0 gd0Var, Context context, int i7) {
        super(gd0Var.f48275v0, context);
        this.f47508e = i7;
        switch (i7) {
            case 1:
                this.f47509f = gd0Var;
                super(gd0Var.f48275v0, context);
                return;
            default:
                this.f47509f = gd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f47508e) {
            case 0:
                return ((gd0) this.f47509f).f48263l0;
            case 1:
                return ((gd0) this.f47509f).f48263l0;
            default:
                return ((dc0) this.f47509f).N;
        }
    }

    @Override
    public final boolean b() {
        ed0 ed0Var;
        switch (this.f47508e) {
            case 0:
                if (getVisibility() == 0) {
                    gd0 gd0Var = (gd0) this.f47509f;
                    if (gd0Var.f48250b0 <= 0 || gd0Var.U == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                gd0 gd0Var2 = (gd0) this.f47509f;
                if (isClickable() && getVisibility() == 0 && !gd0Var2.f48258g0 && (((ed0Var = gd0Var2.f48276w) == null || ed0Var.getVisibility() == 8) && !gd0Var2.f48263l0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    dc0 dc0Var = (dc0) this.f47509f;
                    if (dc0Var.Q <= 0 || dc0Var.O == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ed0(dc0 dc0Var, Context context) {
        super(dc0Var.f47031b0, context);
        this.f47508e = 2;
        this.f47509f = dc0Var;
    }
}
