package org.telegram.ui.Components;
public final class j80 implements Runnable {
    public final int f36442a;
    public final n2.o0 f36443b;
    public final n80 f36444c;

    public j80(n2.o0 o0Var, n80 n80Var, int i7) {
        this.f36442a = i7;
        this.f36443b = o0Var;
        this.f36444c = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f36442a) {
            case 0:
                this.f36443b.m(this.f36444c, false);
                return;
            default:
                this.f36443b.m(this.f36444c, false);
                return;
        }
    }
}
