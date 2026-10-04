package org.telegram.ui;
public final class ij0 implements Runnable {
    public final int f37452a;
    public final oj0 f37453b;

    public ij0(oj0 oj0Var, int i10) {
        this.f37452a = i10;
        this.f37453b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37452a) {
            case 0:
                this.f37453b.dismiss();
                return;
            case 1:
                this.f37453b.S(true, false);
                return;
            default:
                this.f37453b.S(true, false);
                return;
        }
    }
}
