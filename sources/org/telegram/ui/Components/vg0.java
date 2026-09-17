package org.telegram.ui.Components;
public final class vg0 implements Runnable {
    public final int f31245a;
    public final yg0 f31246b;

    public vg0(yg0 yg0Var, int i10) {
        this.f31245a = i10;
        this.f31246b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f31245a) {
            case 0:
                this.f31246b.a(true);
                return;
            default:
                this.f31246b.d();
                return;
        }
    }
}
