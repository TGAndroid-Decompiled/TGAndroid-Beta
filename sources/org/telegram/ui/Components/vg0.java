package org.telegram.ui.Components;
public final class vg0 implements Runnable {
    public final int f28718a;
    public final yg0 f28719b;

    public vg0(yg0 yg0Var, int i10) {
        this.f28718a = i10;
        this.f28719b = yg0Var;
    }

    @Override
    public final void run() {
        switch (this.f28718a) {
            case 0:
                this.f28719b.a(true);
                return;
            default:
                this.f28719b.d();
                return;
        }
    }
}
