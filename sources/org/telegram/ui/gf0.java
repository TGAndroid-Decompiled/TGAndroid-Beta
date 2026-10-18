package org.telegram.ui;

import android.content.Context;
public final class gf0 extends org.telegram.ui.Components.voip.l2 {
    public final int e;
    public final org.telegram.ui.Components.ow0 f37171f;

    public gf0(if0 if0Var, Context context, int i10) {
        super(if0Var.f37877s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f37171f = if0Var;
                super(if0Var.f37877s0, context);
                return;
            default:
                this.f37171f = if0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((if0) this.f37171f).f37865i0;
            case 1:
                return ((if0) this.f37171f).f37865i0;
            default:
                return ((fe0) this.f37171f).M;
        }
    }

    @Override
    public final boolean b() {
        gf0 gf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    if0 if0Var = (if0) this.f37171f;
                    if (if0Var.V <= 0 || if0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                if0 if0Var2 = (if0) this.f37171f;
                if (isClickable() && getVisibility() == 0 && !if0Var2.f37859d0 && (((gf0Var = if0Var2.v) == null || gf0Var.getVisibility() == 8) && !if0Var2.f37865i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    fe0 fe0Var = (fe0) this.f37171f;
                    if (fe0Var.P <= 0 || fe0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public gf0(fe0 fe0Var, Context context) {
        super(fe0Var.f36888a0, context);
        this.e = 2;
        this.f37171f = fe0Var;
    }
}
