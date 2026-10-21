package org.telegram.ui.Components;
public final class rh0 implements Runnable {
    public final int f29935a;
    public final uh0 f29936b;

    public rh0(uh0 uh0Var, int i10) {
        this.f29935a = i10;
        this.f29936b = uh0Var;
    }

    @Override
    public final void run() {
        switch (this.f29935a) {
            case 0:
                this.f29936b.a(true);
                return;
            default:
                this.f29936b.d();
                return;
        }
    }
}
