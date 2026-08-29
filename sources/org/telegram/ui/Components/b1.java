package org.telegram.ui.Components;
public final class b1 implements org.telegram.ui.ActionBar.b2 {
    public final int f26931a;
    public final Runnable f26932b;

    public b1(int i10, Runnable runnable) {
        this.f26931a = i10;
        this.f26932b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26931a) {
            case 0:
                Runnable runnable = this.f26932b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f26932b.run();
                return;
            case 2:
                this.f26932b.run();
                return;
            case 3:
                this.f26932b.run();
                return;
            case 4:
                this.f26932b.run();
                c2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f26932b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                c2Var.dismiss();
                Runnable runnable3 = this.f26932b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
