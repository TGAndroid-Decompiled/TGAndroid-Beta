package org.telegram.ui;
public final class ij0 implements Runnable {
    public final int f37439a;
    public final oj0 f37440b;

    public ij0(oj0 oj0Var, int i10) {
        this.f37439a = i10;
        this.f37440b = oj0Var;
    }

    @Override
    public final void run() {
        switch (this.f37439a) {
            case 0:
                this.f37440b.dismiss();
                return;
            case 1:
                this.f37440b.S(true, false);
                return;
            default:
                this.f37440b.S(true, false);
                return;
        }
    }
}
