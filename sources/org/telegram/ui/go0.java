package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class go0 implements Utilities.Callback {
    public final int f37379a;
    public final ip0 f37380b;

    public go0(ip0 ip0Var, int i10) {
        this.f37379a = i10;
        this.f37380b = ip0Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37379a) {
            case 0:
                ip0 ip0Var = this.f37380b;
                ip0Var.f38099r = false;
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
                ei.h1 h1Var = this.f37380b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    return;
                }
                return;
        }
    }
}
