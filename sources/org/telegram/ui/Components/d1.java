package org.telegram.ui.Components;
public final class d1 implements org.telegram.ui.ActionBar.r1 {
    public final int f34237a;
    public final Runnable f34238b;

    public d1(int i7, Runnable runnable) {
        this.f34237a = i7;
        this.f34238b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f34237a) {
            case 0:
                Runnable runnable = this.f34238b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f34238b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f34238b.run();
                return;
            case 3:
                this.f34238b.run();
                return;
            case 4:
                this.f34238b.run();
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                Runnable runnable3 = this.f34238b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
