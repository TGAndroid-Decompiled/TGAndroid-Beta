package org.telegram.ui.Components;
public final class ba0 implements Runnable {
    public final int f24891a;
    public final ca0 f24892b;
    public final ga0 f24893c;

    public ba0(ca0 ca0Var, ga0 ga0Var, int i10) {
        this.f24891a = i10;
        this.f24892b = ca0Var;
        this.f24893c = ga0Var;
    }

    @Override
    public final void run() {
        switch (this.f24891a) {
            case 0:
                this.f24892b.k(this.f24893c, false);
                return;
            default:
                this.f24892b.k(this.f24893c, false);
                return;
        }
    }
}
