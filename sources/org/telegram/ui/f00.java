package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f37530a;
    public final e10 f37531b;

    public f00(e10 e10Var, int i10) {
        this.f37530a = i10;
        this.f37531b = e10Var;
    }

    @Override
    public final void run() {
        switch (this.f37530a) {
            case 0:
                e10.V(this.f37531b);
                return;
            default:
                e10.W(this.f37531b);
                return;
        }
    }
}
