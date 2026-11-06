package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f47162a;
    public final qg0 f47163b;

    public kg0(qg0 qg0Var, int i7) {
        this.f47162a = i7;
        this.f47163b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47162a) {
            case 0:
                this.f47163b.dismiss();
                return;
            case 1:
                this.f47163b.g1(true, false);
                return;
            default:
                this.f47163b.g1(true, false);
                return;
        }
    }
}
