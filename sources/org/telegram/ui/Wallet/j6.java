package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34379a;
    public final m6 f34380b;

    public j6(m6 m6Var, int i10) {
        this.f34379a = i10;
        this.f34380b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34379a) {
            case 0:
                m6.a(this.f34380b);
                return;
            default:
                m6 m6Var = this.f34380b;
                Runnable runnable = m6Var.f34514c0;
                m6Var.f34514c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
