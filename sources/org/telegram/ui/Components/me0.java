package org.telegram.ui.Components;
public final class me0 implements Runnable {
    public final int f37460a;
    public final pe0 f37461b;

    public me0(pe0 pe0Var, int i7) {
        this.f37460a = i7;
        this.f37461b = pe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37460a) {
            case 0:
                this.f37461b.d.a(false);
                return;
            default:
                pe0 pe0Var = this.f37461b;
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
