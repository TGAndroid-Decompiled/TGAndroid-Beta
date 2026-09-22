package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f26155a;
    public final qf0 f26156b;

    public mf0(qf0 qf0Var, int i10) {
        this.f26155a = i10;
        this.f26156b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26155a) {
            case 0:
                this.f26156b.e();
                return;
            default:
                this.f26156b.g();
                return;
        }
    }
}
