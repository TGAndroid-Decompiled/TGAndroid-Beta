package org.telegram.ui.Components;
public final class j80 implements Runnable {
    public final int f36401a;
    public final n2.o0 f36402b;
    public final n80 f36403c;

    public j80(n2.o0 o0Var, n80 n80Var, int i7) {
        this.f36401a = i7;
        this.f36402b = o0Var;
        this.f36403c = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f36401a) {
            case 0:
                this.f36402b.m(this.f36403c, false);
                return;
            default:
                this.f36402b.m(this.f36403c, false);
                return;
        }
    }
}
