package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f47184a;
    public final qg0 f47185b;

    public kg0(qg0 qg0Var, int i7) {
        this.f47184a = i7;
        this.f47185b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47184a) {
            case 0:
                this.f47185b.dismiss();
                return;
            case 1:
                this.f47185b.g1(true, false);
                return;
            default:
                this.f47185b.g1(true, false);
                return;
        }
    }
}
