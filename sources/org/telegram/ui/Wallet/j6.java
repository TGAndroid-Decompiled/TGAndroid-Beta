package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f36762a;
    public final m6 f36763b;

    public j6(m6 m6Var, int i10) {
        this.f36762a = i10;
        this.f36763b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f36762a) {
            case 0:
                m6.a(this.f36763b);
                return;
            default:
                m6 m6Var = this.f36763b;
                Runnable runnable = m6Var.f36978c0;
                m6Var.f36978c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
