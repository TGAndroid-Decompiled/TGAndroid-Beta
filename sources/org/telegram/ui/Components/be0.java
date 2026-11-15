package org.telegram.ui.Components;
public final class be0 implements Runnable {
    public final int f33268a;
    public final de0 f33269b;

    public be0(de0 de0Var, int i7) {
        this.f33268a = i7;
        this.f33269b = de0Var;
    }

    @Override
    public final void run() {
        switch (this.f33268a) {
            case 0:
                this.f33269b.f33917c.a(false);
                return;
            default:
                de0 de0Var = this.f33269b;
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
