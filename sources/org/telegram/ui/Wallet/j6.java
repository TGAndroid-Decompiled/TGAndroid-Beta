package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34362a;
    public final m6 f34363b;

    public j6(m6 m6Var, int i10) {
        this.f34362a = i10;
        this.f34363b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34362a) {
            case 0:
                m6.a(this.f34363b);
                return;
            default:
                m6 m6Var = this.f34363b;
                Runnable runnable = m6Var.f34540c0;
                m6Var.f34540c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
