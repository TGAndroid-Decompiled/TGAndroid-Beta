package org.telegram.ui.Components;
public final class v0 implements org.telegram.ui.ActionBar.r1 {
    public final int f38780a;
    public final Runnable f38781b;

    public v0(int i7, Runnable runnable) {
        this.f38780a = i7;
        this.f38781b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f38780a) {
            case 0:
                Runnable runnable = this.f38781b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f38781b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f38781b.run();
                return;
            case 3:
                this.f38781b.run();
                return;
            case 4:
                this.f38781b.run();
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                Runnable runnable3 = this.f38781b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
