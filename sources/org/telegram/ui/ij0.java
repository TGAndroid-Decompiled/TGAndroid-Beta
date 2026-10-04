package org.telegram.ui;
public final class ij0 implements Runnable {
    public final int f37446a;
    public final oj0 f37447b;

    public ij0(oj0 oj0Var, int i10) {
        this.f37446a = i10;
        this.f37447b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37446a) {
            case 0:
                this.f37447b.dismiss();
                return;
            case 1:
                this.f37447b.S(true, false);
                return;
            default:
                this.f37447b.S(true, false);
                return;
        }
    }
}
