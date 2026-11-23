package org.telegram.ui.Components;
public final class le0 implements Runnable {
    public final int f37119a;
    public final oe0 f37120b;

    public le0(oe0 oe0Var, int i7) {
        this.f37119a = i7;
        this.f37120b = oe0Var;
    }

    @Override
    public final void run() {
        switch (this.f37119a) {
            case 0:
                this.f37120b.d.a(false);
                return;
            default:
                oe0 oe0Var = this.f37120b;
                Runnable runnable = oe0Var.I;
                oe0Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = oe0Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
