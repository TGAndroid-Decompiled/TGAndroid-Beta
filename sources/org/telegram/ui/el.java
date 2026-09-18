package org.telegram.ui;
public final class el implements Runnable {
    public final int f33316a;
    public final fl f33317b;

    public el(fl flVar, int i10) {
        this.f33316a = i10;
        this.f33317b = flVar;
    }

    @Override
    public final void run() {
        switch (this.f33316a) {
            case 0:
                lk lkVar = this.f33317b.H.Y;
                if (lkVar != null) {
                    lkVar.H0();
                    return;
                }
                return;
            default:
                lk lkVar2 = this.f33317b.H.Y;
                if (lkVar2 != null) {
                    lkVar2.T0 = false;
                    org.telegram.ui.Components.dg dgVar = lkVar2.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
