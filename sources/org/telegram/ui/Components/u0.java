package org.telegram.ui.Components;
public final class u0 implements org.telegram.ui.ActionBar.p1 {
    public final int f38589a;
    public final Runnable f38590b;

    public u0(int i3, Runnable runnable) {
        this.f38589a = i3;
        this.f38590b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f38589a) {
            case 0:
                Runnable runnable = this.f38590b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f38590b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f38590b.run();
                return;
            case 3:
                this.f38590b.run();
                return;
            case 4:
                this.f38590b.run();
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                Runnable runnable3 = this.f38590b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
