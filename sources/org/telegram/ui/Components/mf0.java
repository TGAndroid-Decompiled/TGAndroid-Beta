package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f28468a;
    public final qf0 f28469b;

    public mf0(qf0 qf0Var, int i10) {
        this.f28468a = i10;
        this.f28469b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28468a) {
            case 0:
                this.f28469b.e();
                return;
            default:
                this.f28469b.g();
                return;
        }
    }
}
