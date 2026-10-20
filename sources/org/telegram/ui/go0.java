package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class go0 implements Utilities.Callback {
    public final int f37375a;
    public final ip0 f37376b;

    public go0(ip0 ip0Var, int i10) {
        this.f37375a = i10;
        this.f37376b = ip0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37375a) {
            case 0:
                ip0 ip0Var = this.f37376b;
                ip0Var.f38095r = false;
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
                ei.h1 h1Var = this.f37376b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
