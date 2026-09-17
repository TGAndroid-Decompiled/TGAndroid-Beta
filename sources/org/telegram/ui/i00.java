package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f34402a;
    public final h10 f34403b;

    public i00(h10 h10Var, int i10) {
        this.f34402a = i10;
        this.f34403b = h10Var;
    }

    @Override
    public final void run() {
        switch (this.f34402a) {
            case 0:
                h10.V(this.f34403b);
                return;
            default:
                h10.W(this.f34403b);
                return;
        }
    }
}
