package org.telegram.ui.Wallet;
public final class j7 implements Runnable {
    public final int f44420a;
    public final m7 f44421b;

    public j7(m7 m7Var, int i7) {
        this.f44420a = i7;
        this.f44421b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f44420a) {
            case 0:
                m7.a(this.f44421b);
                return;
            default:
                m7 m7Var = this.f44421b;
                Runnable runnable = m7Var.f44584d0;
                m7Var.f44584d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
