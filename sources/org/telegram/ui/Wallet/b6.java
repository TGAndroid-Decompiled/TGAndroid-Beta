package org.telegram.ui.Wallet;
public final class b6 implements Runnable {
    public final int f34699a;
    public final e6 f34700b;

    public b6(e6 e6Var, int i10) {
        this.f34699a = i10;
        this.f34700b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f34699a) {
            case 0:
                e6.a(this.f34700b);
                return;
            default:
                e6 e6Var = this.f34700b;
                Runnable runnable = e6Var.f34853c0;
                e6Var.f34853c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
