package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f37779a;
    public final f10 f37780b;

    public g00(f10 f10Var, int i10) {
        this.f37779a = i10;
        this.f37780b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f37779a) {
            case 0:
                f10.V(this.f37780b);
                return;
            default:
                f10.W(this.f37780b);
                return;
        }
    }
}
