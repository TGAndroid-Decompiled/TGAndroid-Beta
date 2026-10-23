package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34645a;
    public final m6 f34646b;

    public j6(m6 m6Var, int i10) {
        this.f34645a = i10;
        this.f34646b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34645a) {
            case 0:
                m6.a(this.f34646b);
                return;
            default:
                m6 m6Var = this.f34646b;
                Runnable runnable = m6Var.f34862c0;
                m6Var.f34862c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
