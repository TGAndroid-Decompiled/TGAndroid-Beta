package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.a2 {
    public final int f30432a;
    public final Runnable f30433b;

    public z0(int i10, Runnable runnable) {
        this.f30432a = i10;
        this.f30433b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f30432a) {
            case 0:
                Runnable runnable = this.f30433b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f30433b.run();
                return;
            case 2:
                this.f30433b.run();
                return;
            case 3:
                this.f30433b.run();
                return;
            case 4:
                this.f30433b.run();
                b2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f30433b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                b2Var.dismiss();
                Runnable runnable3 = this.f30433b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
