package org.telegram.ui.Components;
public final class xn0 implements Runnable {
    public final int f42180a;
    public final ap0 f42181b;

    public xn0(ap0 ap0Var, int i7) {
        this.f42180a = i7;
        this.f42181b = ap0Var;
    }

    @Override
    public final void run() {
        switch (this.f42180a) {
            case 0:
                ap0 ap0Var = this.f42181b;
                ap0Var.f33580w2 = true;
                e10 e10Var = ap0Var.f33576u2;
                e10Var.f34647r.setText("");
                org.telegram.messenger.g0.I3(e10Var.f34647r);
                return;
            default:
                me meVar = new me(11);
                ap0 ap0Var2 = this.f42181b;
                if (ap0Var2.d) {
                    e10 e10Var2 = ap0Var2.f33576u2;
                    if (e10Var2 != null) {
                        org.telegram.messenger.g0.v1(e10Var2.f34647r);
                    }
                    org.telegram.messenger.g0.h3(meVar, 300L);
                    return;
                }
                meVar.run();
                return;
        }
    }
}
