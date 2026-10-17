package org.telegram.ui;
public final class bl implements Runnable {
    public final int f35704a;
    public final cl f35705b;

    public bl(cl clVar, int i10) {
        this.f35704a = i10;
        this.f35705b = clVar;
    }

    @Override
    public final void run() {
        switch (this.f35704a) {
            case 0:
                hk hkVar = this.f35705b.H.Y;
                if (hkVar != null) {
                    hkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = hkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                hk hkVar2 = this.f35705b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
        }
    }
}
