package org.telegram.ui;
public final class dh1 implements Runnable {
    public final int f36198a;
    public final eh1 f36199b;

    public dh1(eh1 eh1Var, int i10) {
        this.f36198a = i10;
        this.f36199b = eh1Var;
    }

    @Override
    public final void run() {
        switch (this.f36198a) {
            case 0:
                org.telegram.ui.Components.a61 a61Var = this.f36199b.f25523a;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.a61 a61Var2 = this.f36199b.f25523a;
                if (a61Var2 != null) {
                    a61Var2.V2.N(true);
                    return;
                }
                return;
        }
    }
}
