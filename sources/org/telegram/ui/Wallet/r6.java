package org.telegram.ui.Wallet;
public final class r6 implements Runnable {
    public final int f43054a;
    public final u6 f43055b;

    public r6(u6 u6Var, int i7) {
        this.f43054a = i7;
        this.f43055b = u6Var;
    }

    @Override
    public final void run() {
        switch (this.f43054a) {
            case 0:
                u6.a(this.f43055b);
                return;
            default:
                u6 u6Var = this.f43055b;
                Runnable runnable = u6Var.f43179c0;
                u6Var.f43179c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
