package org.telegram.ui.Components;
public final class j80 implements Runnable {
    public final int f36448a;
    public final n2.o0 f36449b;
    public final n80 f36450c;

    public j80(n2.o0 o0Var, n80 n80Var, int i7) {
        this.f36448a = i7;
        this.f36449b = o0Var;
        this.f36450c = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f36448a) {
            case 0:
                this.f36449b.m(this.f36450c, false);
                return;
            default:
                this.f36449b.m(this.f36450c, false);
                return;
        }
    }
}
