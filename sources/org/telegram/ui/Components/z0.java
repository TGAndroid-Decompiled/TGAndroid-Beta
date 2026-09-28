package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.z1 {
    public final int f30780a;
    public final Runnable f30781b;

    public z0(int i10, Runnable runnable) {
        this.f30780a = i10;
        this.f30781b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30780a) {
            case 0:
                Runnable runnable = this.f30781b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f30781b.run();
                return;
            case 2:
                this.f30781b.run();
                return;
            case 3:
                this.f30781b.run();
                return;
            case 4:
                this.f30781b.run();
                a2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f30781b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                a2Var.dismiss();
                Runnable runnable3 = this.f30781b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
