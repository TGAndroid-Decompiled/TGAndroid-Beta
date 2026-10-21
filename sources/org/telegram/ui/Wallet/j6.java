package org.telegram.ui.Wallet;
public final class j6 implements Runnable {
    public final int f34386a;
    public final m6 f34387b;

    public j6(m6 m6Var, int i10) {
        this.f34386a = i10;
        this.f34387b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f34386a) {
            case 0:
                m6.a(this.f34387b);
                return;
            default:
                m6 m6Var = this.f34387b;
                Runnable runnable = m6Var.f34521c0;
                m6Var.f34521c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
