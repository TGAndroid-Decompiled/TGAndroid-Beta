package org.telegram.ui;
public final class al implements Runnable {
    public final int f35797a;
    public final bl f35798b;

    public al(bl blVar, int i10) {
        this.f35797a = i10;
        this.f35798b = blVar;
    }

    @Override
    public final void run() {
        switch (this.f35797a) {
            case 0:
                gk gkVar = this.f35798b.H.Y;
                if (gkVar != null) {
                    gkVar.T0 = false;
                    org.telegram.ui.Components.bg bgVar = gkVar.U0;
                    if (bgVar != null) {
                        bgVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                gk gkVar2 = this.f35798b.H.Y;
                if (gkVar2 != null) {
                    gkVar2.F0();
                    return;
                }
                return;
        }
    }
}
