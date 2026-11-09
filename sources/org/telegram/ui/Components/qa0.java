package org.telegram.ui.Components;
public final class qa0 implements Runnable {
    public final int f37283a;
    public final ra0 f37284b;

    public qa0(ra0 ra0Var, int i7) {
        this.f37283a = i7;
        this.f37284b = ra0Var;
    }

    @Override
    public final void run() {
        switch (this.f37283a) {
            case 0:
                this.f37284b.y();
                return;
            default:
                this.f37284b.m(true);
                return;
        }
    }
}
