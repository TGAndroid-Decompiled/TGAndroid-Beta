package org.telegram.ui.Components;
public final class b1 implements org.telegram.ui.ActionBar.b2 {
    public final int f26718a;
    public final Runnable f26719b;

    public b1(int i10, Runnable runnable) {
        this.f26718a = i10;
        this.f26719b = runnable;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f26718a) {
            case 0:
                Runnable runnable = this.f26719b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f26719b.run();
                return;
            case 2:
                this.f26719b.run();
                return;
            case 3:
                this.f26719b.run();
                e2Var.dismiss();
                return;
            case 4:
                Runnable runnable2 = this.f26719b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                e2Var.dismiss();
                Runnable runnable3 = this.f26719b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
