package org.telegram.ui.Components;
public final class b1 implements org.telegram.ui.ActionBar.c2 {
    public final int f21675a;
    public final Runnable f21676b;

    public b1(int i10, Runnable runnable) {
        this.f21675a = i10;
        this.f21676b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f21675a) {
            case 0:
                Runnable runnable = this.f21676b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f21676b.run();
                return;
            case 2:
                this.f21676b.run();
                return;
            case 3:
                this.f21676b.run();
                return;
            case 4:
                this.f21676b.run();
                d2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f21676b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                d2Var.dismiss();
                Runnable runnable3 = this.f21676b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
