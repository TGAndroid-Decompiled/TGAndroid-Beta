package org.telegram.ui.Wallet;
public final class j7 implements Runnable {
    public final int f44410a;
    public final m7 f44411b;

    public j7(m7 m7Var, int i7) {
        this.f44410a = i7;
        this.f44411b = m7Var;
    }

    @Override
    public final void run() {
        switch (this.f44410a) {
            case 0:
                m7.a(this.f44411b);
                return;
            default:
                m7 m7Var = this.f44411b;
                Runnable runnable = m7Var.f44574d0;
                m7Var.f44574d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
