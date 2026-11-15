package org.telegram.ui;

import android.content.Context;
public final class cd0 extends db0 {
    public final int f46081e;
    public final org.telegram.ui.Components.xt0 f46082f;

    public cd0(ed0 ed0Var, Context context, int i7) {
        super(ed0Var.f46759v0, context);
        this.f46081e = i7;
        switch (i7) {
            case 1:
                this.f46082f = ed0Var;
                super(ed0Var.f46759v0, context);
                return;
            default:
                this.f46082f = ed0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f46081e) {
            case 0:
                return ((ed0) this.f46082f).f46747l0;
            case 1:
                return ((ed0) this.f46082f).f46747l0;
            default:
                return ((dc0) this.f46082f).N;
        }
    }

    @Override
    public final boolean b() {
        cd0 cd0Var;
        switch (this.f46081e) {
            case 0:
                if (getVisibility() == 0) {
                    ed0 ed0Var = (ed0) this.f46082f;
                    if (ed0Var.f46734b0 <= 0 || ed0Var.U == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                ed0 ed0Var2 = (ed0) this.f46082f;
                if (isClickable() && getVisibility() == 0 && !ed0Var2.f46742g0 && (((cd0Var = ed0Var2.f46760w) == null || cd0Var.getVisibility() == 8) && !ed0Var2.f46747l0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    dc0 dc0Var = (dc0) this.f46082f;
                    if (dc0Var.Q <= 0 || dc0Var.O == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public cd0(dc0 dc0Var, Context context) {
        super(dc0Var.f46357b0, context);
        this.f46081e = 2;
        this.f46082f = dc0Var;
    }
}
