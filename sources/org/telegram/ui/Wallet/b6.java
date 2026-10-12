package org.telegram.ui.Wallet;
public final class b6 implements Runnable {
    public final int f34508a;
    public final e6 f34509b;

    public b6(e6 e6Var, int i10) {
        this.f34508a = i10;
        this.f34509b = e6Var;
    }

    @Override
    public final void run() {
        switch (this.f34508a) {
            case 0:
                e6.a(this.f34509b);
                return;
            default:
                e6 e6Var = this.f34509b;
                Runnable runnable = e6Var.f34662c0;
                e6Var.f34662c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
