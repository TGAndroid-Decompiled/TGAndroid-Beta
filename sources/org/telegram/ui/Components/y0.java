package org.telegram.ui.Components;
public final class y0 implements org.telegram.ui.ActionBar.b2 {
    public final int f34819a;
    public final Runnable f34820b;

    public y0(int i9, Runnable runnable) {
        this.f34819a = i9;
        this.f34820b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f34819a) {
            case 0:
                Runnable runnable = this.f34820b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f34820b.run();
                return;
            case 2:
                this.f34820b.run();
                return;
            case 3:
                this.f34820b.run();
                return;
            case 4:
                this.f34820b.run();
                c2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f34820b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                c2Var.dismiss();
                Runnable runnable3 = this.f34820b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
