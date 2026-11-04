package org.telegram.ui;

import android.content.Context;
public final class bd0 extends za0 {
    public final int f44025e;
    public final org.telegram.ui.Components.vt0 f44026f;

    public bd0(dd0 dd0Var, Context context, int i3) {
        super(dd0Var.f44663v0, context);
        this.f44025e = i3;
        switch (i3) {
            case 1:
                this.f44026f = dd0Var;
                super(dd0Var.f44663v0, context);
                return;
            default:
                this.f44026f = dd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f44025e) {
            case 0:
                return ((dd0) this.f44026f).f44651l0;
            case 1:
                return ((dd0) this.f44026f).f44651l0;
            default:
                return ((cc0) this.f44026f).N;
        }
    }

    @Override
    public final boolean b() {
        bd0 bd0Var;
        switch (this.f44025e) {
            case 0:
                if (getVisibility() == 0) {
                    dd0 dd0Var = (dd0) this.f44026f;
                    if (dd0Var.f44638b0 <= 0 || dd0Var.U == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                dd0 dd0Var2 = (dd0) this.f44026f;
                if (isClickable() && getVisibility() == 0 && !dd0Var2.f44646g0 && (((bd0Var = dd0Var2.f44664w) == null || bd0Var.getVisibility() == 8) && !dd0Var2.f44651l0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    cc0 cc0Var = (cc0) this.f44026f;
                    if (cc0Var.Q <= 0 || cc0Var.O == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public bd0(cc0 cc0Var, Context context) {
        super(cc0Var.f44298b0, context);
        this.f44025e = 2;
        this.f44026f = cc0Var;
    }
}
