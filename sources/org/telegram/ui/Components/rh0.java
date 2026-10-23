package org.telegram.ui.Components;
public final class rh0 implements Runnable {
    public final int f29939a;
    public final uh0 f29940b;

    public rh0(uh0 uh0Var, int i10) {
        this.f29939a = i10;
        this.f29940b = uh0Var;
    }

    @Override
    public final void run() {
        switch (this.f29939a) {
            case 0:
                this.f29940b.a(true);
                return;
            default:
                this.f29940b.d();
                return;
        }
    }
}
