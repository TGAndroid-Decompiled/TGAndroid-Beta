package org.telegram.ui.Wallet;
public final class t6 implements Runnable {
    public final int f43167a;
    public final w6 f43168b;

    public t6(w6 w6Var, int i7) {
        this.f43167a = i7;
        this.f43168b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f43167a) {
            case 0:
                w6.a(this.f43168b);
                return;
            default:
                w6 w6Var = this.f43168b;
                Runnable runnable = w6Var.f43291c0;
                w6Var.f43291c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
