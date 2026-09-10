package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f33508a;
    public final h10 f33509b;

    public i00(h10 h10Var, int i10) {
        this.f33508a = i10;
        this.f33509b = h10Var;
    }

    @Override
    public final void run() {
        switch (this.f33508a) {
            case 0:
                h10.V(this.f33509b);
                return;
            default:
                h10.W(this.f33509b);
                return;
        }
    }
}
