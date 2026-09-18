package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f26144a;
    public final qf0 f26145b;

    public mf0(qf0 qf0Var, int i10) {
        this.f26144a = i10;
        this.f26145b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f26144a) {
            case 0:
                this.f26145b.e();
                return;
            default:
                this.f26145b.g();
                return;
        }
    }
}
