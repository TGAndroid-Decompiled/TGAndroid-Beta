package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class go0 implements Utilities.Callback {
    public final int f37369a;
    public final ip0 f37370b;

    public go0(ip0 ip0Var, int i10) {
        this.f37369a = i10;
        this.f37370b = ip0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37369a) {
            case 0:
                ip0 ip0Var = this.f37370b;
                ip0Var.f38089r = false;
                ip0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    ip0Var.x0();
                    ip0Var.finishFragment();
                    ip0Var.E0();
                    return;
                }
                return;
            default:
                Integer num = (Integer) obj;
                ei.h1 h1Var = this.f37370b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
