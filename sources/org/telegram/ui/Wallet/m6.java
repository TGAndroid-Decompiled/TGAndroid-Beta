package org.telegram.ui.Wallet;
public final class m6 implements Runnable {
    public final int f34597a;
    public final p6 f34598b;

    public m6(p6 p6Var, int i10) {
        this.f34597a = i10;
        this.f34598b = p6Var;
    }

    @Override
    public final void run() {
        switch (this.f34597a) {
            case 0:
                p6.a(this.f34598b);
                return;
            default:
                p6 p6Var = this.f34598b;
                Runnable runnable = p6Var.f34732c0;
                p6Var.f34732c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
