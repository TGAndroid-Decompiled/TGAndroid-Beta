package org.telegram.ui;

import android.content.Context;
public final class gf0 extends org.telegram.ui.Components.voip.p2 {
    public final int f38575e;
    public final org.telegram.ui.Components.mv0 f38576f;

    public gf0(if0 if0Var, Context context, int i10) {
        super(if0Var.f39249o0, context);
        this.f38575e = i10;
        switch (i10) {
            case 1:
                this.f38576f = if0Var;
                super(if0Var.f39249o0, context);
                return;
            default:
                this.f38576f = if0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.f38575e) {
            case 0:
                return ((if0) this.f38576f).f39238e0;
            case 1:
                return ((if0) this.f38576f).f39238e0;
            default:
                return ((fe0) this.f38576f).I;
        }
    }

    @Override
    public final boolean b() {
        gf0 gf0Var;
        switch (this.f38575e) {
            case 0:
                if (getVisibility() == 0) {
                    if0 if0Var = (if0) this.f38576f;
                    if (if0Var.R <= 0 || if0Var.N == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                if0 if0Var2 = (if0) this.f38576f;
                if (isClickable() && getVisibility() == 0 && !if0Var2.W && (((gf0Var = if0Var2.v) == null || gf0Var.getVisibility() == 8) && !if0Var2.f39238e0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    fe0 fe0Var = (fe0) this.f38576f;
                    if (fe0Var.L <= 0 || fe0Var.J == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public gf0(fe0 fe0Var, Context context) {
        super(fe0Var.T, context);
        this.f38575e = 2;
        this.f38576f = fe0Var;
    }
}
