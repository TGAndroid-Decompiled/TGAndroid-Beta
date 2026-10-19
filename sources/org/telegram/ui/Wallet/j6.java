package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34377a;
    public final m6 f34378b;

    public j6(m6 m6Var, int i10) {
        this.f34377a = i10;
        this.f34378b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34377a) {
            case 0:
                m6.a(this.f34378b);
                return;
            default:
                m6 m6Var = this.f34378b;
                Runnable runnable = m6Var.f34512c0;
                m6Var.f34512c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
