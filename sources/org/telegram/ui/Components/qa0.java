package org.telegram.ui.Components;
public final class qa0 implements Runnable {
    public final int f38603a;
    public final ra0 f38604b;

    public qa0(ra0 ra0Var, int i7) {
        this.f38603a = i7;
        this.f38604b = ra0Var;
    }

    @Override
    public final void run() {
        switch (this.f38603a) {
            case 0:
                this.f38604b.y();
                return;
            default:
                this.f38604b.m(true);
                return;
        }
    }
}
