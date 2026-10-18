package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class io0 implements Utilities.Callback {
    public final int f37937a;
    public final kp0 f37938b;

    public io0(kp0 kp0Var, int i10) {
        this.f37937a = i10;
        this.f37938b = kp0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37937a) {
            case 0:
                kp0 kp0Var = this.f37938b;
                kp0Var.f38609r = false;
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
                ei.h1 h1Var = this.f37938b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
