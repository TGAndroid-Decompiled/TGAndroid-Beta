package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.z1 {
    public final int f33089a;
    public final Runnable f33090b;

    public z0(int i10, Runnable runnable) {
        this.f33089a = i10;
        this.f33090b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f33089a) {
            case 0:
                Runnable runnable = this.f33090b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f33090b.run();
                return;
            case 2:
                this.f33090b.run();
                return;
            case 3:
                this.f33090b.run();
                return;
            case 4:
                this.f33090b.run();
                c2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f33090b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                c2Var.dismiss();
                Runnable runnable3 = this.f33090b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
