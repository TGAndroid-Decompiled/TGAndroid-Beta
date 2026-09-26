package org.telegram.ui.Components;
public final class as implements Runnable {
    public final int f22761a;
    public final gs f22762b;

    public as(gs gsVar, int i10) {
        this.f22761a = i10;
        this.f22762b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f22761a) {
            case 0:
                this.f22762b.W(false);
                return;
            default:
                gs.Q(this.f22762b);
                return;
        }
    }
}
