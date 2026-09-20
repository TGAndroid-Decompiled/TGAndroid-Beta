package org.telegram.ui;
public final class el implements Runnable {
    public final int f33360a;
    public final fl f33361b;

    public el(fl flVar, int i10) {
        this.f33360a = i10;
        this.f33361b = flVar;
    }

    @Override
    public final void run() {
        switch (this.f33360a) {
            case 0:
                lk lkVar = this.f33361b.H.Y;
                if (lkVar != null) {
                    lkVar.H0();
                    return;
                }
                return;
            default:
                lk lkVar2 = this.f33361b.H.Y;
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
