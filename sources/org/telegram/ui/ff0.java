package org.telegram.ui;

import android.content.Context;
public final class ff0 extends org.telegram.ui.Components.voip.l2 {
    public final int e;
    public final org.telegram.ui.Components.qw0 f36991f;

    public ff0(hf0 hf0Var, Context context, int i10) {
        super(hf0Var.f37617s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f36991f = hf0Var;
                super(hf0Var.f37617s0, context);
                return;
            default:
                this.f36991f = hf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((hf0) this.f36991f).f37605i0;
            case 1:
                return ((hf0) this.f36991f).f37605i0;
            default:
                return ((de0) this.f36991f).M;
        }
    }

    @Override
    public final boolean b() {
        ff0 ff0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    hf0 hf0Var = (hf0) this.f36991f;
                    if (hf0Var.V <= 0 || hf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                hf0 hf0Var2 = (hf0) this.f36991f;
                if (isClickable() && getVisibility() == 0 && !hf0Var2.f37599d0 && (((ff0Var = hf0Var2.v) == null || ff0Var.getVisibility() == 8) && !hf0Var2.f37605i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    de0 de0Var = (de0) this.f36991f;
                    if (de0Var.P <= 0 || de0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public ff0(de0 de0Var, Context context) {
        super(de0Var.f36345a0, context);
        this.e = 2;
        this.f36991f = de0Var;
    }
}
