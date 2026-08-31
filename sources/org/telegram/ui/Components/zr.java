package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f33950a;
    public final gs f33951b;

    public zr(gs gsVar, int i10) {
        this.f33950a = i10;
        this.f33951b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f33950a) {
            case 0:
                this.f33951b.W(false);
                return;
            default:
                gs.Q(this.f33951b);
                return;
        }
    }
}
