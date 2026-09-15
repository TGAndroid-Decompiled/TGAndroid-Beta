package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f26156a;
    public final qf0 f26157b;

    public mf0(qf0 qf0Var, int i10) {
        this.f26156a = i10;
        this.f26157b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26156a) {
            case 0:
                this.f26157b.e();
                return;
            default:
                this.f26157b.g();
                return;
        }
    }
}
