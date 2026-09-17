package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f26141a;
    public final qf0 f26142b;

    public mf0(qf0 qf0Var, int i10) {
        this.f26141a = i10;
        this.f26142b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26141a) {
            case 0:
                this.f26142b.e();
                return;
            default:
                this.f26142b.g();
                return;
        }
    }
}
