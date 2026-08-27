package org.telegram.ui.Components;

public final class y0 implements org.telegram.ui.ActionBar.a2 {

    public final int f34747a;

    public final Runnable f34748b;

    public y0(int i10, Runnable runnable) {
        this.f34747a = i10;
        this.f34748b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34747a) {
            case 0:
                Runnable runnable = this.f34748b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                this.f34748b.run();
                break;
            case 2:
                this.f34748b.run();
                break;
            case 3:
                this.f34748b.run();
                break;
            case 4:
                this.f34748b.run();
                b2Var.dismiss();
                break;
            case 5:
                Runnable runnable2 = this.f34748b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            default:
                b2Var.dismiss();
                Runnable runnable3 = this.f34748b;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
        }
    }
}
