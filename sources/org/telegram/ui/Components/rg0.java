package org.telegram.ui.Components;
public final class rg0 implements Runnable {
    public final int f30154a;
    public final vg0 f30155b;

    public rg0(vg0 vg0Var, int i10) {
        this.f30154a = i10;
        this.f30155b = vg0Var;
    }

    @Override
    public final void run() {
        switch (this.f30154a) {
            case 0:
                this.f30155b.e();
                return;
            default:
                this.f30155b.g();
                return;
        }
    }
}
