package org.telegram.ui.Components;
public final class ze0 implements Runnable {
    public final int f42348a;
    public final cf0 f42349b;

    public ze0(cf0 cf0Var, int i7) {
        this.f42348a = i7;
        this.f42349b = cf0Var;
    }

    @Override
    public final void run() {
        switch (this.f42348a) {
            case 0:
                this.f42349b.a(true);
                return;
            default:
                this.f42349b.d();
                return;
        }
    }
}
