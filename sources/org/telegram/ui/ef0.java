package org.telegram.ui;

import android.content.Context;
public final class ef0 extends org.telegram.ui.Components.voip.l2 {
    public final int e;
    public final org.telegram.ui.Components.pw0 f36654f;

    public ef0(gf0 gf0Var, Context context, int i10) {
        super(gf0Var.f37335s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f36654f = gf0Var;
                super(gf0Var.f37335s0, context);
                return;
            default:
                this.f36654f = gf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((gf0) this.f36654f).f37323i0;
            case 1:
                return ((gf0) this.f36654f).f37323i0;
            default:
                return ((de0) this.f36654f).M;
        }
    }

    @Override
    public final boolean b() {
        ef0 ef0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    gf0 gf0Var = (gf0) this.f36654f;
                    if (gf0Var.V <= 0 || gf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                gf0 gf0Var2 = (gf0) this.f36654f;
                if (isClickable() && getVisibility() == 0 && !gf0Var2.f37317d0 && (((ef0Var = gf0Var2.v) == null || ef0Var.getVisibility() == 8) && !gf0Var2.f37323i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    de0 de0Var = (de0) this.f36654f;
                    if (de0Var.P <= 0 || de0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ef0(de0 de0Var, Context context) {
        super(de0Var.f36366a0, context);
        this.e = 2;
        this.f36654f = de0Var;
    }
}
