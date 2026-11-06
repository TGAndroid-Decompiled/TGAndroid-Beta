package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f47185a;
    public final qg0 f47186b;

    public kg0(qg0 qg0Var, int i7) {
        this.f47185a = i7;
        this.f47186b = qg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47185a) {
            case 0:
                this.f47186b.dismiss();
                return;
            case 1:
                this.f47186b.g1(true, false);
                return;
            default:
                this.f47186b.g1(true, false);
                return;
        }
    }
}
