package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f47189a;
    public final qg0 f47190b;

    public kg0(qg0 qg0Var, int i7) {
        this.f47189a = i7;
        this.f47190b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47189a) {
            case 0:
                this.f47190b.dismiss();
                return;
            case 1:
                this.f47190b.g1(true, false);
                return;
            default:
                this.f47190b.g1(true, false);
                return;
        }
    }
}
