package org.telegram.ui.Components;
public final class h80 implements Runnable {
    public final int f35816a;
    public final n2.o0 f35817b;
    public final l80 f35818c;

    public h80(n2.o0 o0Var, l80 l80Var, int i7) {
        this.f35816a = i7;
        this.f35817b = o0Var;
        this.f35818c = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f35816a) {
            case 0:
                this.f35817b.m(this.f35818c, false);
                return;
            default:
                this.f35817b.m(this.f35818c, false);
                return;
        }
    }
}
