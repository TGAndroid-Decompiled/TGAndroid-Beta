package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f33773a;
    public final f10 f33774b;

    public g00(f10 f10Var, int i10) {
        this.f33773a = i10;
        this.f33774b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f33773a) {
            case 0:
                f10.V(this.f33774b);
                return;
            default:
                f10.W(this.f33774b);
                return;
        }
    }
}
