package org.telegram.ui.Components;
public final class rg0 implements Runnable {
    public final int f30153a;
    public final vg0 f30154b;

    public rg0(vg0 vg0Var, int i10) {
        this.f30153a = i10;
        this.f30154b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30153a) {
            case 0:
                this.f30154b.e();
                return;
            default:
                this.f30154b.g();
                return;
        }
    }
}
