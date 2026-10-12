package org.telegram.ui.Components;
public final class wh0 implements Runnable {
    public final int f30891a;
    public final zh0 f30892b;

    public wh0(zh0 zh0Var, int i10) {
        this.f30891a = i10;
        this.f30892b = zh0Var;
    }

    @Override
    public final void run() {
        switch (this.f30891a) {
            case 0:
                this.f30892b.a(true);
                return;
            default:
                this.f30892b.d();
                return;
        }
    }
}
