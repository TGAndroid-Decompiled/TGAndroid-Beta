package org.telegram.ui.Components;
public final class be0 implements Runnable {
    public final int f33265a;
    public final de0 f33266b;

    public be0(de0 de0Var, int i7) {
        this.f33265a = i7;
        this.f33266b = de0Var;
    }

    @Override
    public final void run() {
        switch (this.f33265a) {
            case 0:
                this.f33266b.f33930c.a(false);
                return;
            default:
                de0 de0Var = this.f33266b;
                Runnable runnable = de0Var.H;
                de0Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = de0Var.I;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }
}
