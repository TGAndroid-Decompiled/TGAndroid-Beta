package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class ho0 implements Utilities.Callback {
    public final int f37597a;
    public final jp0 f37598b;

    public ho0(jp0 jp0Var, int i10) {
        this.f37597a = i10;
        this.f37598b = jp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37597a) {
            case 0:
                jp0 jp0Var = this.f37598b;
                jp0Var.f38255r = false;
                jp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    jp0Var.x0();
                    jp0Var.finishFragment();
                    jp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ei.h1 h1Var = this.f37598b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
