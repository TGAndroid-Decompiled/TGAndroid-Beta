package org.telegram.ui.Wallet;
public final class y5 implements Runnable {
    public final int f35658a;
    public final b6 f35659b;

    public y5(b6 b6Var, int i10) {
        this.f35658a = i10;
        this.f35659b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f35658a) {
            case 0:
                b6.a(this.f35659b);
                return;
            default:
                b6 b6Var = this.f35659b;
                Runnable runnable = b6Var.f34663c0;
                b6Var.f34663c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
