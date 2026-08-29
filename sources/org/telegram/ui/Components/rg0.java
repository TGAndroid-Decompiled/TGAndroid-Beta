package org.telegram.ui.Components;
public final class rg0 implements Runnable {
    public final int f32298a;
    public final ug0 f32299b;

    public rg0(ug0 ug0Var, int i10) {
        this.f32298a = i10;
        this.f32299b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f32298a) {
            case 0:
                this.f32299b.a(true);
                return;
            default:
                this.f32299b.d();
                return;
        }
    }
}
