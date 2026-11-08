package org.telegram.ui.Wallet;
public final class s6 implements Runnable {
    public final int f43136a;
    public final v6 f43137b;

    public s6(v6 v6Var, int i7) {
        this.f43136a = i7;
        this.f43137b = v6Var;
    }

    @Override
    public final void run() {
        switch (this.f43136a) {
            case 0:
                v6.a(this.f43137b);
                return;
            default:
                v6 v6Var = this.f43137b;
                Runnable runnable = v6Var.f43261c0;
                v6Var.f43261c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
