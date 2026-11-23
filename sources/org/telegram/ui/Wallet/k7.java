package org.telegram.ui.Wallet;
public final class k7 implements Runnable {
    public final int f44581a;
    public final n7 f44582b;

    public k7(n7 n7Var, int i7) {
        this.f44581a = i7;
        this.f44582b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f44581a) {
            case 0:
                n7.a(this.f44582b);
                return;
            default:
                n7 n7Var = this.f44582b;
                Runnable runnable = n7Var.f44758d0;
                n7Var.f44758d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
