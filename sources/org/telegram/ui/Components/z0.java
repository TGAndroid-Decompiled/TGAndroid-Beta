package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.z1 {
    public final int f30743a;
    public final Runnable f30744b;

    public z0(int i10, Runnable runnable) {
        this.f30743a = i10;
        this.f30744b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f30743a) {
            case 0:
                Runnable runnable = this.f30744b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f30744b.run();
                return;
            case 2:
                this.f30744b.run();
                return;
            case 3:
                this.f30744b.run();
                return;
            case 4:
                this.f30744b.run();
                a2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f30744b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                a2Var.dismiss();
                Runnable runnable3 = this.f30744b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
