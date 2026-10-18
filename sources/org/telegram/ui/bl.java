package org.telegram.ui;
public final class bl implements Runnable {
    public final int f35681a;
    public final cl f35682b;

    public bl(cl clVar, int i10) {
        this.f35681a = i10;
        this.f35682b = clVar;
    }

    @Override
    public final void run() {
        switch (this.f35681a) {
            case 0:
                hk hkVar = this.f35682b.H.Y;
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
                hk hkVar2 = this.f35682b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
        }
    }
}
