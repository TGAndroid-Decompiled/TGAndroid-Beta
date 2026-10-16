package org.telegram.ui.Wallet;
public final class z5 implements Runnable {
    public final int f33657a;
    public final c6 f33658b;

    public z5(c6 c6Var, int i10) {
        this.f33657a = i10;
        this.f33658b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f33657a) {
            case 0:
                c6.a(this.f33658b);
                return;
            default:
                c6 c6Var = this.f33658b;
                Runnable runnable = c6Var.f32746c0;
                c6Var.f32746c0 = null;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
