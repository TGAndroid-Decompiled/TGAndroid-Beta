package org.telegram.ui.Components;
public final class uc0 implements Runnable {
    public final int f33362a;
    public final vc0 f33363b;

    public uc0(vc0 vc0Var, int i10) {
        this.f33362a = i10;
        this.f33363b = vc0Var;
    }

    @Override
    public final void run() {
        switch (this.f33362a) {
            case 0:
                this.f33363b.y();
                return;
            default:
                this.f33363b.m(true);
                return;
        }
    }
}
