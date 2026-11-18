package org.telegram.ui.Components;
public final class h1 implements Runnable {
    public final int f35690a;
    public final a5 f35691b;
    public final org.telegram.ui.ActionBar.u1 f35692c;
    public final org.telegram.ui.ActionBar.h2 d;

    public h1(a5 a5Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.h2 h2Var, int i7) {
        this.f35690a = i7;
        this.f35691b = a5Var;
        this.f35692c = u1Var;
        this.d = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f35690a) {
            case 0:
                org.telegram.messenger.g0.g3(new h1(this.f35691b, this.f35692c, this.d, 1));
                return;
            default:
                b5.b0(this.f35691b, this.f35692c, this.d);
                return;
        }
    }
}
