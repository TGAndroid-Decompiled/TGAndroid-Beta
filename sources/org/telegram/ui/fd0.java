package org.telegram.ui;

import android.content.Context;
public final class fd0 extends eb0 {
    public final int f47599e;
    public final org.telegram.ui.Components.fu0 f47600f;

    public fd0(hd0 hd0Var, Context context, int i7) {
        super(hd0Var.f48331v0, context);
        this.f47599e = i7;
        switch (i7) {
            case 1:
                this.f47600f = hd0Var;
                super(hd0Var.f48331v0, context);
                return;
            default:
                this.f47600f = hd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f47599e) {
            case 0:
                return ((hd0) this.f47600f).f48319l0;
            case 1:
                return ((hd0) this.f47600f).f48319l0;
            default:
                return ((ec0) this.f47600f).N;
        }
    }

    @Override
    public final boolean b() {
        fd0 fd0Var;
        switch (this.f47599e) {
            case 0:
                if (getVisibility() == 0) {
                    hd0 hd0Var = (hd0) this.f47600f;
                    if (hd0Var.f48306b0 <= 0 || hd0Var.U == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                hd0 hd0Var2 = (hd0) this.f47600f;
                if (isClickable() && getVisibility() == 0 && !hd0Var2.f48314g0 && (((fd0Var = hd0Var2.f48332w) == null || fd0Var.getVisibility() == 8) && !hd0Var2.f48319l0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    ec0 ec0Var = (ec0) this.f47600f;
                    if (ec0Var.Q <= 0 || ec0Var.O == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public fd0(ec0 ec0Var, Context context) {
        super(ec0Var.f47162b0, context);
        this.f47599e = 2;
        this.f47600f = ec0Var;
    }
}
