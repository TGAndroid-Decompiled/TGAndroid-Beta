package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34385a;
    public final m6 f34386b;

    public j6(m6 m6Var, int i10) {
        this.f34385a = i10;
        this.f34386b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34385a) {
            case 0:
                m6.a(this.f34386b);
                return;
            default:
                m6 m6Var = this.f34386b;
                Runnable runnable = m6Var.f34520c0;
                m6Var.f34520c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
