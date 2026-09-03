package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.c2 {
    public final int f33706a;
    public final Runnable f33707b;

    public z0(int i10, Runnable runnable) {
        this.f33706a = i10;
        this.f33707b = runnable;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f33706a) {
            case 0:
                Runnable runnable = this.f33707b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f33707b.run();
                return;
            case 2:
                this.f33707b.run();
                return;
            case 3:
                this.f33707b.run();
                return;
            case 4:
                this.f33707b.run();
                d2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f33707b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                d2Var.dismiss();
                Runnable runnable3 = this.f33707b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
