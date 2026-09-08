package org.telegram.ui.Components;
public final class vg0 implements Runnable {
    public final int f31271a;
    public final yg0 f31272b;

    public vg0(yg0 yg0Var, int i10) {
        this.f31271a = i10;
        this.f31272b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f31271a) {
            case 0:
                this.f31272b.a(true);
                return;
            default:
                this.f31272b.d();
                return;
        }
    }
}
