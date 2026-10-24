package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class jo0 implements Utilities.Callback {
    public final int f38597a;
    public final kp0 f38598b;

    public jo0(kp0 kp0Var, int i10) {
        this.f38597a = i10;
        this.f38598b = kp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38597a) {
            case 0:
                kp0 kp0Var = this.f38598b;
                kp0Var.f39014r = false;
                kp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    kp0Var.x0();
                    kp0Var.finishFragment();
                    kp0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ei.h1 h1Var = this.f38598b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
