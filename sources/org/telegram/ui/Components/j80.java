package org.telegram.ui.Components;
public final class j80 implements Runnable {
    public final int f36443a;
    public final n2.o0 f36444b;
    public final n80 f36445c;

    public j80(n2.o0 o0Var, n80 n80Var, int i7) {
        this.f36443a = i7;
        this.f36444b = o0Var;
        this.f36445c = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f36443a) {
            case 0:
                this.f36444b.m(this.f36445c, false);
                return;
            default:
                this.f36444b.m(this.f36445c, false);
                return;
        }
    }
}
