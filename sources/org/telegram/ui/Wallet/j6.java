package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34390a;
    public final m6 f34391b;

    public j6(m6 m6Var, int i10) {
        this.f34390a = i10;
        this.f34391b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34390a) {
            case 0:
                m6.a(this.f34391b);
                return;
            default:
                m6 m6Var = this.f34391b;
                Runnable runnable = m6Var.f34525c0;
                m6Var.f34525c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
