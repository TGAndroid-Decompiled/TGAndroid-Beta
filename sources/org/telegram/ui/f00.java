package org.telegram.ui;
public final class f00 implements Runnable {
    public final int f37496a;
    public final e10 f37497b;

    public f00(e10 e10Var, int i10) {
        this.f37496a = i10;
        this.f37497b = e10Var;
    }

    @Override
    public final void run() {
        switch (this.f37496a) {
            case 0:
                e10.V(this.f37497b);
                return;
            default:
                e10.W(this.f37497b);
                return;
        }
    }
}
