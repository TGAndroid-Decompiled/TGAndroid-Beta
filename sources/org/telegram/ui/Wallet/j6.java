package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34389a;
    public final m6 f34390b;

    public j6(m6 m6Var, int i10) {
        this.f34389a = i10;
        this.f34390b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34389a) {
            case 0:
                m6.a(this.f34390b);
                return;
            default:
                m6 m6Var = this.f34390b;
                Runnable runnable = m6Var.f34524c0;
                m6Var.f34524c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
