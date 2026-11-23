package org.telegram.ui.Components;
public final class e1 implements org.telegram.ui.ActionBar.q1 {
    public final int f34634a;
    public final Runnable f34635b;

    public e1(int i7, Runnable runnable) {
        this.f34634a = i7;
        this.f34635b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f34634a) {
            case 0:
                Runnable runnable = this.f34635b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f34635b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f34635b.run();
                return;
            case 3:
                this.f34635b.run();
                return;
            case 4:
                this.f34635b.run();
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                Runnable runnable3 = this.f34635b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
