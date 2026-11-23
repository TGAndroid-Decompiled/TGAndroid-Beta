package org.telegram.ui.Wallet;
public final class j7 implements Runnable {
    public final int f44454a;
    public final m7 f44455b;

    public j7(m7 m7Var, int i7) {
        this.f44454a = i7;
        this.f44455b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f44454a) {
            case 0:
                m7.a(this.f44455b);
                return;
            default:
                m7 m7Var = this.f44455b;
                Runnable runnable = m7Var.f44618d0;
                m7Var.f44618d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
