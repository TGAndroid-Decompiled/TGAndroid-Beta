package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f28441a;
    public final qf0 f28442b;

    public mf0(qf0 qf0Var, int i10) {
        this.f28441a = i10;
        this.f28442b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28441a) {
            case 0:
                this.f28442b.e();
                return;
            default:
                this.f28442b.g();
                return;
        }
    }
}
