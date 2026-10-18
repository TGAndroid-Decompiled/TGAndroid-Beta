package org.telegram.ui.Wallet;
public final class p6 implements Runnable {
    public final int f34743a;
    public final s6 f34744b;

    public p6(s6 s6Var, int i10) {
        this.f34743a = i10;
        this.f34744b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f34743a) {
            case 0:
                s6.a(this.f34744b);
                return;
            default:
                s6 s6Var = this.f34744b;
                Runnable runnable = s6Var.f34902c0;
                s6Var.f34902c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
