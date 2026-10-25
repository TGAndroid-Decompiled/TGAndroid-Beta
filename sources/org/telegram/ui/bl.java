package org.telegram.ui;
public final class bl implements Runnable {
    public final int f38113a;
    public final cl f38114b;

    public bl(cl clVar, int i10) {
        this.f38113a = i10;
        this.f38114b = clVar;
    }

    @Override
    public final void run() {
        switch (this.f38113a) {
            case 0:
                hk hkVar = this.f38114b.H.Y;
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
                hk hkVar2 = this.f38114b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
        }
    }
}
