package org.telegram.ui.Components;
public final class mf0 implements Runnable {
    public final int f28442a;
    public final qf0 f28443b;

    public mf0(qf0 qf0Var, int i10) {
        this.f28442a = i10;
        this.f28443b = qf0Var;
    }

    @Override
    public final void run() {
        switch (this.f28442a) {
            case 0:
                this.f28443b.e();
                return;
            default:
                this.f28443b.g();
                return;
        }
    }
}
