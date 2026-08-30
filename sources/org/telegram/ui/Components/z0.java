package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.c2 {
    public final int f31193a;
    public final Runnable f31194b;

    public z0(int i10, Runnable runnable) {
        this.f31193a = i10;
        this.f31194b = runnable;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f31193a) {
            case 0:
                Runnable runnable = this.f31194b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f31194b.run();
                return;
            case 2:
                this.f31194b.run();
                return;
            case 3:
                this.f31194b.run();
                return;
            case 4:
                this.f31194b.run();
                d2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f31194b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                d2Var.dismiss();
                Runnable runnable3 = this.f31194b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
