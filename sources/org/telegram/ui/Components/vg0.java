package org.telegram.ui.Components;
public final class vg0 implements Runnable {
    public final int f31272a;
    public final yg0 f31273b;

    public vg0(yg0 yg0Var, int i10) {
        this.f31272a = i10;
        this.f31273b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f31272a) {
            case 0:
                this.f31273b.a(true);
                return;
            default:
                this.f31273b.d();
                return;
        }
    }
}
