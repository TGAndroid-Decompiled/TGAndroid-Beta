package org.telegram.ui.Components;
public final class le0 implements Runnable {
    public final int f37111a;
    public final ne0 f37112b;

    public le0(ne0 ne0Var, int i7) {
        this.f37111a = i7;
        this.f37112b = ne0Var;
    }

    @Override
    public final void run() {
        switch (this.f37111a) {
            case 0:
                this.f37112b.f37769c.a(false);
                return;
            default:
                ne0 ne0Var = this.f37112b;
                Runnable runnable = ne0Var.H;
                ne0Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = ne0Var.I;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
