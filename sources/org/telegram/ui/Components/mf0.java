package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f28469a;
    public final qf0 f28470b;

    public mf0(qf0 qf0Var, int i10) {
        this.f28469a = i10;
        this.f28470b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28469a) {
            case 0:
                this.f28470b.e();
                return;
            default:
                this.f28470b.g();
                return;
        }
    }
}
