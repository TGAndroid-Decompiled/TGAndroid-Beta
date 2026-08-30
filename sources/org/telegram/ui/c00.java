package org.telegram.ui;
public final class c00 implements Runnable {
    public final int f33061a;
    public final b10 f33062b;

    public c00(b10 b10Var, int i10) {
        this.f33061a = i10;
        this.f33062b = b10Var;
    }

    @Override
    public final void run() {
        switch (this.f33061a) {
            case 0:
                b10.V(this.f33062b);
                return;
            default:
                b10.W(this.f33062b);
                return;
        }
    }
}
