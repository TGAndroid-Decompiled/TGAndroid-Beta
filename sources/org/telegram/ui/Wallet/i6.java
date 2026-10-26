package org.telegram.ui.Wallet;
public final class i6 implements Runnable {
    public final int f36679a;
    public final l6 f36680b;

    public i6(l6 l6Var, int i10) {
        this.f36679a = i10;
        this.f36680b = l6Var;
    }

    @Override
    public final void run() {
        switch (this.f36679a) {
            case 0:
                l6.a(this.f36680b);
                return;
            default:
                l6 l6Var = this.f36680b;
                Runnable runnable = l6Var.f36851c0;
                l6Var.f36851c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
