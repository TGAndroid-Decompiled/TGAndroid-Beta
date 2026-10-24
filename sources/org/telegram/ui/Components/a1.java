package org.telegram.ui.Components;
public final class a1 implements org.telegram.ui.ActionBar.z1 {
    public final int f24599a;
    public final Runnable f24600b;

    public a1(int i10, Runnable runnable) {
        this.f24599a = i10;
        this.f24600b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f24599a) {
            case 0:
                Runnable runnable = this.f24600b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f24600b.run();
                return;
            case 2:
                this.f24600b.run();
                return;
            case 3:
                this.f24600b.run();
                c2Var.dismiss();
                return;
            case 4:
                Runnable runnable2 = this.f24600b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                c2Var.dismiss();
                Runnable runnable3 = this.f24600b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
