package org.telegram.ui;
public final class g00 implements Runnable {
    public final int f33801a;
    public final f10 f33802b;

    public g00(f10 f10Var, int i10) {
        this.f33801a = i10;
        this.f33802b = f10Var;
    }

    @Override
    public final void run() {
        switch (this.f33801a) {
            case 0:
                f10.V(this.f33802b);
                return;
            default:
                f10.W(this.f33802b);
                return;
        }
    }
}
