package org.telegram.ui.Components;
public final class b90 implements Runnable {
    public final int f23590a;
    public final c90 f23591b;
    public final g90 f23592c;

    public b90(c90 c90Var, g90 g90Var, int i10) {
        this.f23590a = i10;
        this.f23591b = c90Var;
        this.f23592c = g90Var;
    }

    @Override
    public final void run() {
        switch (this.f23590a) {
            case 0:
                this.f23591b.k(this.f23592c, false);
                return;
            default:
                this.f23591b.k(this.f23592c, false);
                return;
        }
    }
}
