package org.telegram.ui.Components;

public final class l80 implements Runnable {

    public final int f30322a;

    public final m80 f30323b;

    public final q80 f30324c;

    public l80(m80 m80Var, q80 q80Var, int i10) {
        this.f30322a = i10;
        this.f30323b = m80Var;
        this.f30324c = q80Var;
    }

    @Override
    public final void run() {
        switch (this.f30322a) {
            case 0:
                this.f30323b.k(this.f30324c, false);
                break;
            default:
                this.f30323b.k(this.f30324c, false);
                break;
        }
    }
}
