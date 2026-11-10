package org.telegram.ui;

import android.content.Context;
public final class hd0 extends gb0 {
    public final int f46323e;
    public final org.telegram.ui.Components.xt0 f46324f;

    public hd0(jd0 jd0Var, Context context, int i7) {
        super(jd0Var.f46985u0, context);
        this.f46323e = i7;
        switch (i7) {
            case 1:
                this.f46324f = jd0Var;
                super(jd0Var.f46985u0, context);
                return;
            default:
                this.f46324f = jd0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f46323e) {
            case 0:
                return ((jd0) this.f46324f).f46973k0;
            case 1:
                return ((jd0) this.f46324f).f46973k0;
            default:
                return ((hc0) this.f46324f).M;
        }
    }

    @Override
    public final boolean b() {
        hd0 hd0Var;
        switch (this.f46323e) {
            case 0:
                if (getVisibility() == 0) {
                    jd0 jd0Var = (jd0) this.f46324f;
                    if (jd0Var.f46959a0 <= 0 || jd0Var.T == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                jd0 jd0Var2 = (jd0) this.f46324f;
                if (isClickable() && getVisibility() == 0 && !jd0Var2.f46968f0 && (((hd0Var = jd0Var2.f46986w) == null || hd0Var.getVisibility() == 8) && !jd0Var2.f46973k0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    hc0 hc0Var = (hc0) this.f46324f;
                    if (hc0Var.P <= 0 || hc0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public hd0(hc0 hc0Var, Context context) {
        super(hc0Var.f46307a0, context);
        this.f46323e = 2;
        this.f46324f = hc0Var;
    }
}
