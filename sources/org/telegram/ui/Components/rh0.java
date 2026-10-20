package org.telegram.ui.Components;
public final class rh0 implements Runnable {
    public final int f29934a;
    public final uh0 f29935b;

    public rh0(uh0 uh0Var, int i10) {
        this.f29934a = i10;
        this.f29935b = uh0Var;
    }

    @Override
    public final void run() {
        switch (this.f29934a) {
            case 0:
                this.f29935b.a(true);
                return;
            default:
                this.f29935b.d();
                return;
        }
    }
}
