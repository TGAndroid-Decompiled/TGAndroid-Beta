package org.telegram.ui.Components;
public final class w70 implements Runnable {
    public final int f41308a;
    public final n2.o0 f41309b;
    public final a80 f41310c;

    public w70(n2.o0 o0Var, a80 a80Var, int i7) {
        this.f41308a = i7;
        this.f41309b = o0Var;
        this.f41310c = a80Var;
    }

    @Override
    public final void run() {
        switch (this.f41308a) {
            case 0:
                this.f41309b.n(this.f41310c, false);
                return;
            default:
                this.f41309b.n(this.f41310c, false);
                return;
        }
    }
}
