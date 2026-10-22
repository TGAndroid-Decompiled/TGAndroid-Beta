package org.telegram.ui.Components;
public final class z0 implements org.telegram.ui.ActionBar.a2 {
    public final int f32788a;
    public final Runnable f32789b;

    public z0(int i10, Runnable runnable) {
        this.f32788a = i10;
        this.f32789b = runnable;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f32788a) {
            case 0:
                Runnable runnable = this.f32789b;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                this.f32789b.run();
                return;
            case 2:
                this.f32789b.run();
                return;
            case 3:
                this.f32789b.run();
                return;
            case 4:
                this.f32789b.run();
                b2Var.dismiss();
                return;
            case 5:
                Runnable runnable2 = this.f32789b;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            default:
                b2Var.dismiss();
                Runnable runnable3 = this.f32789b;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
        }
    }
}
