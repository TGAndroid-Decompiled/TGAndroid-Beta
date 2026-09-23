package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f26168a;
    public final qf0 f26169b;

    public mf0(qf0 qf0Var, int i10) {
        this.f26168a = i10;
        this.f26169b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26168a) {
            case 0:
                this.f26169b.e();
                return;
            default:
                this.f26169b.g();
                return;
        }
    }
}
