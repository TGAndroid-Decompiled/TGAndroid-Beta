package org.telegram.ui;
public final class hl implements Runnable {
    public final int f34296a;
    public final il f34297b;

    public hl(il ilVar, int i10) {
        this.f34296a = i10;
        this.f34297b = ilVar;
    }

    @Override
    public final void run() {
        switch (this.f34296a) {
            case 0:
                nk nkVar = this.f34297b.H.Y;
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
                nk nkVar2 = this.f34297b.H.Y;
                if (nkVar2 != null) {
                    nkVar2.I0();
                    return;
                }
                return;
        }
    }
}
