package org.telegram.ui;
public final class gl implements Runnable {
    public final int f34464a;
    public final hl f34465b;

    public gl(hl hlVar, int i10) {
        this.f34464a = i10;
        this.f34465b = hlVar;
    }

    @Override
    public final void run() {
        switch (this.f34464a) {
            case 0:
                lk lkVar = this.f34465b.E.V;
                if (lkVar != null) {
                    lkVar.Q0 = false;
                    org.telegram.ui.Components.uf ufVar = lkVar.R0;
                    if (ufVar != null) {
                        ufVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                lk lkVar2 = this.f34465b.E.V;
                if (lkVar2 != null) {
                    lkVar2.H0();
                    return;
                }
                return;
        }
    }
}
