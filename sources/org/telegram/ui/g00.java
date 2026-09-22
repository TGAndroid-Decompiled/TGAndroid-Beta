package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f33740a;
    public final f10 f33741b;

    public g00(f10 f10Var, int i10) {
        this.f33740a = i10;
        this.f33741b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f33740a) {
            case 0:
                f10.V(this.f33741b);
                return;
            default:
                f10.W(this.f33741b);
                return;
        }
    }
}
