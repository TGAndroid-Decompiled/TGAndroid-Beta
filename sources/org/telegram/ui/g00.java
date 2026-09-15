package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f33721a;
    public final f10 f33722b;

    public g00(f10 f10Var, int i10) {
        this.f33721a = i10;
        this.f33722b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f33721a) {
            case 0:
                f10.V(this.f33722b);
                return;
            default:
                f10.W(this.f33722b);
                return;
        }
    }
}
