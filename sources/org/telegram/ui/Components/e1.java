package org.telegram.ui.Components;
public final class e1 implements org.telegram.ui.ActionBar.q1 {
    public final int f34624a;
    public final Runnable f34625b;

    public e1(int i7, Runnable runnable) {
        this.f34624a = i7;
        this.f34625b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f34624a) {
            case 0:
                Runnable runnable = this.f34625b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f34625b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f34625b.run();
                return;
            case 3:
                this.f34625b.run();
                return;
            case 4:
                this.f34625b.run();
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                Runnable runnable3 = this.f34625b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
