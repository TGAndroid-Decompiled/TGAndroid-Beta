package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.z1 {
    public final int f33238a;
    public final Runnable f33239b;

    public z0(int i10, Runnable runnable) {
        this.f33238a = i10;
        this.f33239b = runnable;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f33238a) {
            case 0:
                Runnable runnable = this.f33239b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f33239b.run();
                return;
            case 2:
                this.f33239b.run();
                return;
            case 3:
                this.f33239b.run();
                return;
            case 4:
                this.f33239b.run();
                a2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f33239b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                a2Var.dismiss();
                Runnable runnable3 = this.f33239b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
