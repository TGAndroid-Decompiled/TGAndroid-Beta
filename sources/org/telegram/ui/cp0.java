package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class cp0 implements Utilities.Callback {
    public final int f34754a;
    public final eq0 f34755b;

    public cp0(eq0 eq0Var, int i10) {
        this.f34754a = i10;
        this.f34755b = eq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34754a) {
            case 0:
                eq0 eq0Var = this.f34755b;
                eq0Var.f35363r = false;
                eq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    eq0Var.x0();
                    eq0Var.finishFragment();
                    eq0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                di.h1 h1Var = this.f34755b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
