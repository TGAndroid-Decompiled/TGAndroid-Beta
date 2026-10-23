package org.telegram.ui;
public final class ig1 implements Runnable {
    public final int f38224a;
    public final jg1 f38225b;

    public ig1(jg1 jg1Var, int i10) {
        this.f38224a = i10;
        this.f38225b = jg1Var;
    }

    @Override
    public final void run() {
        switch (this.f38224a) {
            case 0:
                org.telegram.ui.Components.d71 d71Var = this.f38225b.f25907a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.d71 d71Var2 = this.f38225b.f25907a;
                if (d71Var2 != null) {
                    d71Var2.Z2.N(true);
                    return;
                }
                return;
        }
    }
}
