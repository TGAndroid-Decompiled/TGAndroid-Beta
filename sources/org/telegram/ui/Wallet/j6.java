package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34647a;
    public final m6 f34648b;

    public j6(m6 m6Var, int i10) {
        this.f34647a = i10;
        this.f34648b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34647a) {
            case 0:
                m6.a(this.f34648b);
                return;
            default:
                m6 m6Var = this.f34648b;
                Runnable runnable = m6Var.f34864c0;
                m6Var.f34864c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
