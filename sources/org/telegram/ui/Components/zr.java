package org.telegram.ui.Components;
public final class zr implements Runnable {
    public final int f34006a;
    public final gs f34007b;

    public zr(gs gsVar, int i10) {
        this.f34006a = i10;
        this.f34007b = gsVar;
    }

    @Override
    public final void run() {
        switch (this.f34006a) {
            case 0:
                this.f34007b.W(false);
                return;
            default:
                gs.Q(this.f34007b);
                return;
        }
    }
}
