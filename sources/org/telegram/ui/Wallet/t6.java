package org.telegram.ui.Wallet;
public final class t6 implements Runnable {
    public final int f44521a;
    public final w6 f44522b;

    public t6(w6 w6Var, int i7) {
        this.f44521a = i7;
        this.f44522b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f44521a) {
            case 0:
                w6.a(this.f44522b);
                return;
            default:
                w6 w6Var = this.f44522b;
                Runnable runnable = w6Var.f44638d0;
                w6Var.f44638d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
