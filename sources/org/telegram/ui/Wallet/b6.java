package org.telegram.ui.Wallet;
public final class b6 implements Runnable {
    public final int f34733a;
    public final e6 f34734b;

    public b6(e6 e6Var, int i10) {
        this.f34733a = i10;
        this.f34734b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f34733a) {
            case 0:
                e6.a(this.f34734b);
                return;
            default:
                e6 e6Var = this.f34734b;
                Runnable runnable = e6Var.f34887c0;
                e6Var.f34887c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
