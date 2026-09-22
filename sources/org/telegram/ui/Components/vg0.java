package org.telegram.ui.Components;
public final class vg0 implements Runnable {
    public final int f28715a;
    public final yg0 f28716b;

    public vg0(yg0 yg0Var, int i10) {
        this.f28715a = i10;
        this.f28716b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f28715a) {
            case 0:
                this.f28716b.a(true);
                return;
            default:
                this.f28716b.d();
                return;
        }
    }
}
