package org.telegram.ui.Components;
public final class xn0 implements Runnable {
    public final int f42150a;
    public final ap0 f42151b;

    public xn0(ap0 ap0Var, int i7) {
        this.f42150a = i7;
        this.f42151b = ap0Var;
    }

    @Override
    public final void run() {
        switch (this.f42150a) {
            case 0:
                ap0 ap0Var = this.f42151b;
                ap0Var.f33577w2 = true;
                e10 e10Var = ap0Var.f33573u2;
                e10Var.f34632r.setText("");
                org.telegram.messenger.g0.I3(e10Var.f34632r);
                return;
            default:
                me meVar = new me(11);
                ap0 ap0Var2 = this.f42151b;
                if (ap0Var2.d) {
                    e10 e10Var2 = ap0Var2.f33573u2;
                    if (e10Var2 != null) {
                        org.telegram.messenger.g0.v1(e10Var2.f34632r);
                    }
                    org.telegram.messenger.g0.h3(meVar, 300L);
                    return;
                }
                meVar.run();
                return;
        }
    }
}
