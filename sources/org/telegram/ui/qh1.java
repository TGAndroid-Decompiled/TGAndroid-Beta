package org.telegram.ui;
public final class qh1 implements Runnable {
    public final int f41130a;
    public final rh1 f41131b;

    public qh1(rh1 rh1Var, int i10) {
        this.f41130a = i10;
        this.f41131b = rh1Var;
    }

    @Override
    public final void run() {
        switch (this.f41130a) {
            case 0:
                org.telegram.ui.Components.e71 e71Var = this.f41131b.f26290a;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.e71 e71Var2 = this.f41131b.f26290a;
                if (e71Var2 != null) {
                    e71Var2.W2.N(true);
                    return;
                }
                return;
        }
    }
}
