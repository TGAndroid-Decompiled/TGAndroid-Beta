package org.telegram.ui.Wallet;
public final class r6 implements Runnable {
    public final int f43128a;
    public final u6 f43129b;

    public r6(u6 u6Var, int i3) {
        this.f43128a = i3;
        this.f43129b = u6Var;
    }

    @Override
    public final void run() {
        switch (this.f43128a) {
            case 0:
                u6.a(this.f43129b);
                return;
            default:
                u6 u6Var = this.f43129b;
                Runnable runnable = u6Var.f43251d0;
                u6Var.f43251d0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
