package org.telegram.ui.Wallet;
public final class j7 implements Runnable {
    public final int f44450a;
    public final m7 f44451b;

    public j7(m7 m7Var, int i7) {
        this.f44450a = i7;
        this.f44451b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f44450a) {
            case 0:
                m7.a(this.f44451b);
                return;
            default:
                m7 m7Var = this.f44451b;
                Runnable runnable = m7Var.f44614d0;
                m7Var.f44614d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
