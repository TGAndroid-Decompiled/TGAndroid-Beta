package org.telegram.ui;
public final class i00 implements Runnable {
    public final int f38574a;
    public final h10 f38575b;

    public i00(h10 h10Var, int i10) {
        this.f38574a = i10;
        this.f38575b = h10Var;
    }

    @Override
    public final void run() {
        switch (this.f38574a) {
            case 0:
                h10.V(this.f38575b);
                return;
            default:
                h10.W(this.f38575b);
                return;
        }
    }
}
