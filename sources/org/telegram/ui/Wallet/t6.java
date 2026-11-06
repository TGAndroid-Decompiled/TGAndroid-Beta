package org.telegram.ui.Wallet;
public final class t6 implements Runnable {
    public final int f43166a;
    public final w6 f43167b;

    public t6(w6 w6Var, int i7) {
        this.f43166a = i7;
        this.f43167b = w6Var;
    }

    @Override
    public final void run() {
        switch (this.f43166a) {
            case 0:
                w6.a(this.f43167b);
                return;
            default:
                w6 w6Var = this.f43167b;
                Runnable runnable = w6Var.f43290c0;
                w6Var.f43290c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
