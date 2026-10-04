package org.telegram.ui;
public final class ij0 implements Runnable {
    public final int f37447a;
    public final oj0 f37448b;

    public ij0(oj0 oj0Var, int i10) {
        this.f37447a = i10;
        this.f37448b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37447a) {
            case 0:
                this.f37448b.dismiss();
                return;
            case 1:
                this.f37448b.S(true, false);
                return;
            default:
                this.f37448b.S(true, false);
                return;
        }
    }
}
