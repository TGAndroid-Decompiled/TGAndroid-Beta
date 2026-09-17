package org.telegram.ui;
public final class hl implements Runnable {
    public final int f34291a;
    public final il f34292b;

    public hl(il ilVar, int i10) {
        this.f34291a = i10;
        this.f34292b = ilVar;
    }

    @Override
    public final void run() {
        switch (this.f34291a) {
            case 0:
                nk nkVar = this.f34292b.H.Y;
                if (nkVar != null) {
                    nkVar.T0 = false;
                    org.telegram.ui.Components.cg cgVar = nkVar.U0;
                    if (cgVar != null) {
                        cgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                nk nkVar2 = this.f34292b.H.Y;
                if (nkVar2 != null) {
                    nkVar2.H0();
                    return;
                }
                return;
        }
    }
}
