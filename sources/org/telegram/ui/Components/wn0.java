package org.telegram.ui.Components;
public final class wn0 implements Runnable {
    public final int f41686a;
    public final zo0 f41687b;

    public wn0(zo0 zo0Var, int i7) {
        this.f41686a = i7;
        this.f41687b = zo0Var;
    }

    @Override
    public final void run() {
        switch (this.f41686a) {
            case 0:
                zo0 zo0Var = this.f41687b;
                zo0Var.f43001w2 = true;
                c10 c10Var = zo0Var.f42997u2;
                c10Var.f33883r.setText("");
                org.telegram.messenger.g0.I3(c10Var.f33883r);
                return;
            default:
                ne neVar = new ne(11);
                zo0 zo0Var2 = this.f41687b;
                if (zo0Var2.d) {
                    c10 c10Var2 = zo0Var2.f42997u2;
                    if (c10Var2 != null) {
                        org.telegram.messenger.g0.v1(c10Var2.f33883r);
                    }
                    org.telegram.messenger.g0.h3(neVar, 300L);
                    return;
                }
                neVar.run();
                return;
        }
    }
}
