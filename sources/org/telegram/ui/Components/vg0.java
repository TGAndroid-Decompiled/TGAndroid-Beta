package org.telegram.ui.Components;
public final class vg0 implements Runnable {
    public final int f31244a;
    public final yg0 f31245b;

    public vg0(yg0 yg0Var, int i10) {
        this.f31244a = i10;
        this.f31245b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f31244a) {
            case 0:
                this.f31245b.a(true);
                return;
            default:
                this.f31245b.d();
                return;
        }
    }
}
