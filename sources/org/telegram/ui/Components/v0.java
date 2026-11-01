package org.telegram.ui.Components;
public final class v0 implements org.telegram.ui.ActionBar.u1 {
    public final int f31130a;
    public final Runnable f31131b;

    public v0(int i10, Runnable runnable) {
        this.f31130a = i10;
        this.f31131b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f31130a) {
            case 0:
                Runnable runnable = this.f31131b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f31131b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f31131b.run();
                return;
            case 3:
                this.f31131b.run();
                return;
            case 4:
                this.f31131b.run();
                x1Var.dismiss();
                return;
            default:
                x1Var.dismiss();
                Runnable runnable3 = this.f31131b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
