package org.telegram.ui.Components;
public final class s0 implements org.telegram.ui.ActionBar.q1 {
    public final int f39117a;
    public final Runnable f39118b;

    public s0(int i7, Runnable runnable) {
        this.f39117a = i7;
        this.f39118b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f39117a) {
            case 0:
                Runnable runnable = this.f39118b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f39118b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f39118b.run();
                return;
            case 3:
                this.f39118b.run();
                return;
            case 4:
                this.f39118b.run();
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                Runnable runnable3 = this.f39118b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
