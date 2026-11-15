package org.telegram.ui.Components;
public final class w70 implements Runnable {
    public final int f41311a;
    public final n2.o0 f41312b;
    public final a80 f41313c;

    public w70(n2.o0 o0Var, a80 a80Var, int i7) {
        this.f41311a = i7;
        this.f41312b = o0Var;
        this.f41313c = a80Var;
    }

    @Override
    public final void run() {
        switch (this.f41311a) {
            case 0:
                this.f41312b.n(this.f41313c, false);
                return;
            default:
                this.f41312b.n(this.f41313c, false);
                return;
        }
    }
}
