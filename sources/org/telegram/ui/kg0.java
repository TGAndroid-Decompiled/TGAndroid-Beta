package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f48700a;
    public final qg0 f48701b;

    public kg0(qg0 qg0Var, int i7) {
        this.f48700a = i7;
        this.f48701b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f48700a) {
            case 0:
                this.f48701b.dismiss();
                return;
            case 1:
                this.f48701b.g1(true, false);
                return;
            default:
                this.f48701b.g1(true, false);
                return;
        }
    }
}
