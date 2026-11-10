package org.telegram.ui.Wallet;
public final class u6 implements Runnable {
    public final int f43228a;
    public final x6 f43229b;

    public u6(x6 x6Var, int i7) {
        this.f43228a = i7;
        this.f43229b = x6Var;
    }

    @Override
    public final void run() {
        switch (this.f43228a) {
            case 0:
                x6.a(this.f43229b);
                return;
            default:
                x6 x6Var = this.f43229b;
                Runnable runnable = x6Var.f43338c0;
                x6Var.f43338c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
