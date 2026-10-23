package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ko0 implements Utilities.Callback {
    public final int f39018a;
    public final lp0 f39019b;

    public ko0(lp0 lp0Var, int i10) {
        this.f39018a = i10;
        this.f39019b = lp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39018a) {
            case 0:
                lp0 lp0Var = this.f39019b;
                lp0Var.f39306r = false;
                lp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    lp0Var.x0();
                    lp0Var.finishFragment();
                    lp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ei.h1 h1Var = this.f39019b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
