package org.telegram.ui.Wallet;
public final class b6 implements Runnable {
    public final int f34510a;
    public final e6 f34511b;

    public b6(e6 e6Var, int i10) {
        this.f34510a = i10;
        this.f34511b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f34510a) {
            case 0:
                e6.a(this.f34511b);
                return;
            default:
                e6 e6Var = this.f34511b;
                Runnable runnable = e6Var.f34664c0;
                e6Var.f34664c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
