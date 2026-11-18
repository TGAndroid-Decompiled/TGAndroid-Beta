package org.telegram.ui.Components;
public final class vn0 implements Runnable {
    public final int f40732a;
    public final yo0 f40733b;

    public vn0(yo0 yo0Var, int i7) {
        this.f40732a = i7;
        this.f40733b = yo0Var;
    }

    @Override
    public final void run() {
        switch (this.f40732a) {
            case 0:
                yo0 yo0Var = this.f40733b;
                yo0Var.f42584w2 = true;
                c10 c10Var = yo0Var.f42580u2;
                c10Var.f33845r.setText("");
                org.telegram.messenger.g0.I3(c10Var.f33845r);
                return;
            default:
                me meVar = new me(11);
                yo0 yo0Var2 = this.f40733b;
                if (yo0Var2.d) {
                    c10 c10Var2 = yo0Var2.f42580u2;
                    if (c10Var2 != null) {
                        org.telegram.messenger.g0.v1(c10Var2.f33845r);
                    }
                    org.telegram.messenger.g0.h3(meVar, 300L);
                    return;
                }
                meVar.run();
                return;
        }
    }
}
