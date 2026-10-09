package org.telegram.ui.Wallet;
public final class z5 implements Runnable {
    public final int f35743a;
    public final c6 f35744b;

    public z5(c6 c6Var, int i10) {
        this.f35743a = i10;
        this.f35744b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f35743a) {
            case 0:
                c6.a(this.f35744b);
                return;
            default:
                c6 c6Var = this.f35744b;
                Runnable runnable = c6Var.f34734c0;
                c6Var.f34734c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
