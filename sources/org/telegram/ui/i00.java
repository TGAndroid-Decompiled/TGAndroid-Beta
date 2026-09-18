package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f34407a;
    public final h10 f34408b;

    public i00(h10 h10Var, int i10) {
        this.f34407a = i10;
        this.f34408b = h10Var;
    }

    @Override
    public final void run() {
        switch (this.f34407a) {
            case 0:
                h10.V(this.f34408b);
                return;
            default:
                h10.W(this.f34408b);
                return;
        }
    }
}
