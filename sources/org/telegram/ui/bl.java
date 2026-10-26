package org.telegram.ui;
public final class bl implements Runnable {
    public final int f38116a;
    public final cl f38117b;

    public bl(cl clVar, int i10) {
        this.f38116a = i10;
        this.f38117b = clVar;
    }

    @Override
    public final void run() {
        switch (this.f38116a) {
            case 0:
                hk hkVar = this.f38117b.H.Y;
                if (hkVar != null) {
                    hkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = hkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                hk hkVar2 = this.f38117b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
        }
    }
}
