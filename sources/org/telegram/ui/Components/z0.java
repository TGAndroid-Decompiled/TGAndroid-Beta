package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.b2 {
    public final int f30356a;
    public final Runnable f30357b;

    public z0(int i10, Runnable runnable) {
        this.f30356a = i10;
        this.f30357b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f30356a) {
            case 0:
                Runnable runnable = this.f30357b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f30357b.run();
                return;
            case 2:
                this.f30357b.run();
                return;
            case 3:
                this.f30357b.run();
                return;
            case 4:
                this.f30357b.run();
                c2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f30357b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                c2Var.dismiss();
                Runnable runnable3 = this.f30357b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
