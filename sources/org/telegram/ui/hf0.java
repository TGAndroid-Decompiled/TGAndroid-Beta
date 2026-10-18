package org.telegram.ui;

import android.content.Context;
public final class hf0 extends org.telegram.ui.Components.voip.l2 {
    public final int e;
    public final org.telegram.ui.Components.ow0 f37555f;

    public hf0(jf0 jf0Var, Context context, int i10) {
        super(jf0Var.f38174s0, context);
        this.e = i10;
        switch (i10) {
            case 1:
                this.f37555f = jf0Var;
                super(jf0Var.f38174s0, context);
                return;
            default:
                this.f37555f = jf0Var;
                return;
        }
    }

    @Override
    public final boolean a() {
        switch (this.e) {
            case 0:
                return ((jf0) this.f37555f).f38162i0;
            case 1:
                return ((jf0) this.f37555f).f38162i0;
            default:
                return ((fe0) this.f37555f).M;
        }
    }

    @Override
    public final boolean b() {
        hf0 hf0Var;
        switch (this.e) {
            case 0:
                if (getVisibility() == 0) {
                    jf0 jf0Var = (jf0) this.f37555f;
                    if (jf0Var.V <= 0 || jf0Var.R == null) {
                        return true;
                    }
                }
                return false;
            case 1:
                jf0 jf0Var2 = (jf0) this.f37555f;
                if (isClickable() && getVisibility() == 0 && !jf0Var2.f38156d0 && (((hf0Var = jf0Var2.v) == null || hf0Var.getVisibility() == 8) && !jf0Var2.f38162i0)) {
                    return true;
                }
                return false;
            default:
                if (getVisibility() == 0) {
                    fe0 fe0Var = (fe0) this.f37555f;
                    if (fe0Var.P <= 0 || fe0Var.N == null) {
                        return true;
                    }
                }
                return false;
        }
    }

    public hf0(fe0 fe0Var, Context context) {
        super(fe0Var.f36904a0, context);
        this.e = 2;
        this.f37555f = fe0Var;
    }
}
