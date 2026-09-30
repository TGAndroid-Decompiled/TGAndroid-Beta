package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class po0 implements Utilities.Callback {
    public final int f36693a;
    public final sp0 f36694b;

    public po0(sp0 sp0Var, int i10) {
        this.f36693a = i10;
        this.f36694b = sp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36693a) {
            case 0:
                sp0 sp0Var = this.f36694b;
                sp0Var.f37951r = false;
                sp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    sp0Var.x0();
                    sp0Var.finishFragment();
                    sp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.f36694b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
