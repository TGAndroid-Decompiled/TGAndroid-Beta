package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f37735a;
    public final f10 f37736b;

    public g00(f10 f10Var, int i10) {
        this.f37735a = i10;
        this.f37736b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f37735a) {
            case 0:
                f10.V(this.f37736b);
                return;
            default:
                f10.W(this.f37736b);
                return;
        }
    }
}
