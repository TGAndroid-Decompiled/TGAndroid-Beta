package org.telegram.ui.Wallet;
public final class a6 implements Runnable {
    public final int f34671a;
    public final d6 f34672b;

    public a6(d6 d6Var, int i10) {
        this.f34671a = i10;
        this.f34672b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f34671a) {
            case 0:
                d6.a(this.f34672b);
                return;
            default:
                d6 d6Var = this.f34672b;
                Runnable runnable = d6Var.f34823c0;
                d6Var.f34823c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
