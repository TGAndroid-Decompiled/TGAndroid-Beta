package org.telegram.ui.Components;
public final class qa0 implements Runnable {
    public final int f38601a;
    public final ra0 f38602b;

    public qa0(ra0 ra0Var, int i7) {
        this.f38601a = i7;
        this.f38602b = ra0Var;
    }

    @Override
    public final void run() {
        switch (this.f38601a) {
            case 0:
                this.f38602b.y();
                return;
            default:
                this.f38602b.m(true);
                return;
        }
    }
}
