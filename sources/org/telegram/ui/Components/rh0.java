package org.telegram.ui.Components;
public final class rh0 implements Runnable {
    public final int f29938a;
    public final uh0 f29939b;

    public rh0(uh0 uh0Var, int i10) {
        this.f29938a = i10;
        this.f29939b = uh0Var;
    }

    @Override
    public final void run() {
        switch (this.f29938a) {
            case 0:
                this.f29939b.a(true);
                return;
            default:
                this.f29939b.d();
                return;
        }
    }
}
