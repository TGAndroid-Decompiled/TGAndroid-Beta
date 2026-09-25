package org.telegram.ui.Components;
public final class as implements Runnable {
    public final int f22762a;
    public final gs f22763b;

    public as(gs gsVar, int i10) {
        this.f22762a = i10;
        this.f22763b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f22762a) {
            case 0:
                this.f22763b.W(false);
                return;
            default:
                gs.Q(this.f22763b);
                return;
        }
    }
}
