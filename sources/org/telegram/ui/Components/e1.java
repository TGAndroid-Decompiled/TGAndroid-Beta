package org.telegram.ui.Components;
public final class e1 implements org.telegram.ui.ActionBar.q1 {
    public final int f34639a;
    public final Runnable f34640b;

    public e1(int i7, Runnable runnable) {
        this.f34639a = i7;
        this.f34640b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f34639a) {
            case 0:
                Runnable runnable = this.f34640b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                Runnable runnable2 = this.f34640b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 2:
                this.f34640b.run();
                return;
            case 3:
                this.f34640b.run();
                return;
            case 4:
                this.f34640b.run();
                t1Var.dismiss();
                return;
            default:
                t1Var.dismiss();
                Runnable runnable3 = this.f34640b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
