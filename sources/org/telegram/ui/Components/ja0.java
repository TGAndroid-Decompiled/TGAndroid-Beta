package org.telegram.ui.Components;
public final class ja0 implements Runnable {
    public final int f36393a;
    public final ka0 f36394b;

    public ja0(ka0 ka0Var, int i7) {
        this.f36393a = i7;
        this.f36394b = ka0Var;
    }

    @Override
    public final void run() {
        switch (this.f36393a) {
            case 0:
                ka0 ka0Var = this.f36394b;
                if (ka0Var.W != -1) {
                    org.telegram.messenger.ks.f(ka0Var.Y.f38045d0.f40286x).j(ka0Var.W);
                    ka0Var.W = -1;
                    return;
                }
                return;
            case 1:
                this.f36394b.Y.i();
                return;
            default:
                ka0 ka0Var2 = this.f36394b;
                if (ka0Var2.W != -1) {
                    org.telegram.messenger.ks.f(ka0Var2.Y.f38045d0.f40286x).j(ka0Var2.W);
                    ka0Var2.W = -1;
                    return;
                }
                return;
        }
    }
}
