package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f37733a;
    public final f10 f37734b;

    public g00(f10 f10Var, int i10) {
        this.f37733a = i10;
        this.f37734b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f37733a) {
            case 0:
                f10.V(this.f37734b);
                return;
            default:
                f10.W(this.f37734b);
                return;
        }
    }
}
