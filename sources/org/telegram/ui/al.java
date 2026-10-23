package org.telegram.ui;
public final class al implements Runnable {
    public final int f35692a;
    public final bl f35693b;

    public al(bl blVar, int i10) {
        this.f35692a = i10;
        this.f35693b = blVar;
    }

    @Override
    public final void run() {
        switch (this.f35692a) {
            case 0:
                gk gkVar = this.f35693b.H.Y;
                if (gkVar != null) {
                    gkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = gkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                gk gkVar2 = this.f35693b.H.Y;
                if (gkVar2 != null) {
                    gkVar2.F0();
                    return;
                }
                return;
        }
    }
}
