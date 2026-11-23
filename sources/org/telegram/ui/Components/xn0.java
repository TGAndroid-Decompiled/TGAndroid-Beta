package org.telegram.ui.Components;
public final class xn0 implements Runnable {
    public final int f42172a;
    public final ap0 f42173b;

    public xn0(ap0 ap0Var, int i7) {
        this.f42172a = i7;
        this.f42173b = ap0Var;
    }

    @Override
    public final void run() {
        switch (this.f42172a) {
            case 0:
                ap0 ap0Var = this.f42173b;
                ap0Var.f33593w2 = true;
                e10 e10Var = ap0Var.f33589u2;
                e10Var.f34642r.setText("");
                org.telegram.messenger.g0.I3(e10Var.f34642r);
                return;
            default:
                me meVar = new me(11);
                ap0 ap0Var2 = this.f42173b;
                if (ap0Var2.d) {
                    e10 e10Var2 = ap0Var2.f33589u2;
                    if (e10Var2 != null) {
                        org.telegram.messenger.g0.v1(e10Var2.f34642r);
                    }
                    org.telegram.messenger.g0.h3(meVar, 300L);
                    return;
                }
                meVar.run();
                return;
        }
    }
}
