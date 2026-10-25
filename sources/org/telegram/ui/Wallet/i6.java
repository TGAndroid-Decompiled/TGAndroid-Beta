package org.telegram.ui.Wallet;
public final class i6 implements Runnable {
    public final int f36676a;
    public final l6 f36677b;

    public i6(l6 l6Var, int i10) {
        this.f36676a = i10;
        this.f36677b = l6Var;
    }

    @Override
    public final void run() {
        switch (this.f36676a) {
            case 0:
                l6.a(this.f36677b);
                return;
            default:
                l6 l6Var = this.f36677b;
                Runnable runnable = l6Var.f36848c0;
                l6Var.f36848c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
