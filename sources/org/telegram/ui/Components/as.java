package org.telegram.ui.Components;
public final class as implements Runnable {
    public final int f22496a;
    public final gs f22497b;

    public as(gs gsVar, int i10) {
        this.f22496a = i10;
        this.f22497b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f22496a) {
            case 0:
                this.f22497b.W(false);
                return;
            default:
                gs.Q(this.f22497b);
                return;
        }
    }
}
