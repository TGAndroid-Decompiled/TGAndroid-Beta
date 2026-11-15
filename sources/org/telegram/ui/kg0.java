package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f48654a;
    public final qg0 f48655b;

    public kg0(qg0 qg0Var, int i7) {
        this.f48654a = i7;
        this.f48655b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f48654a) {
            case 0:
                this.f48655b.dismiss();
                return;
            case 1:
                this.f48655b.g1(true, false);
                return;
            default:
                this.f48655b.g1(true, false);
                return;
        }
    }
}
