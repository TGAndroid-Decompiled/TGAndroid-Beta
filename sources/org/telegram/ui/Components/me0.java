package org.telegram.ui.Components;
public final class me0 implements Runnable {
    public final int f37500a;
    public final pe0 f37501b;

    public me0(pe0 pe0Var, int i7) {
        this.f37500a = i7;
        this.f37501b = pe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37500a) {
            case 0:
                this.f37501b.d.a(false);
                return;
            default:
                pe0 pe0Var = this.f37501b;
                Runnable runnable = pe0Var.I;
                pe0Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = pe0Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
