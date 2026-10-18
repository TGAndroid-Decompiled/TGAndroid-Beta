package org.telegram.ui;
public final class bl implements Runnable {
    public final int f35727a;
    public final cl f35728b;

    public bl(cl clVar, int i10) {
        this.f35727a = i10;
        this.f35728b = clVar;
    }

    @Override
    public final void run() {
        switch (this.f35727a) {
            case 0:
                hk hkVar = this.f35728b.H.Y;
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
                hk hkVar2 = this.f35728b.H.Y;
                if (hkVar2 != null) {
                    hkVar2.F0();
                    return;
                }
                return;
        }
    }
}
