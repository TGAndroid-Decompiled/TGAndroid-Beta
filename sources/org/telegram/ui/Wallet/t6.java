package org.telegram.ui.Wallet;
public final class t6 implements Runnable {
    public final int f43142a;
    public final w6 f43143b;

    public t6(w6 w6Var, int i7) {
        this.f43142a = i7;
        this.f43143b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f43142a) {
            case 0:
                w6.a(this.f43143b);
                return;
            default:
                w6 w6Var = this.f43143b;
                Runnable runnable = w6Var.f43266c0;
                w6Var.f43266c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
