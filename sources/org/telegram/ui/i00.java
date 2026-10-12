package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f38577a;
    public final h10 f38578b;

    public i00(h10 h10Var, int i10) {
        this.f38577a = i10;
        this.f38578b = h10Var;
    }

    @Override
    public final void run() {
        switch (this.f38577a) {
            case 0:
                h10.V(this.f38578b);
                return;
            default:
                h10.W(this.f38578b);
                return;
        }
    }
}
