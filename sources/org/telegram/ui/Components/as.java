package org.telegram.ui.Components;
public final class as implements Runnable {
    public final int f22743a;
    public final gs f22744b;

    public as(gs gsVar, int i10) {
        this.f22743a = i10;
        this.f22744b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f22743a) {
            case 0:
                this.f22744b.W(false);
                return;
            default:
                gs.Q(this.f22744b);
                return;
        }
    }
}
