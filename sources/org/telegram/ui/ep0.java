package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ep0 implements Utilities.Callback {
    public final int f35652a;
    public final gq0 f35653b;

    public ep0(gq0 gq0Var, int i10) {
        this.f35652a = i10;
        this.f35653b = gq0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35652a) {
            case 0:
                gq0 gq0Var = this.f35653b;
                gq0Var.f36464r = false;
                gq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    gq0Var.x0();
                    gq0Var.finishFragment();
                    gq0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                di.h1 h1Var = this.f35653b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
