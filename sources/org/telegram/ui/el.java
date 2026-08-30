package org.telegram.ui;
public final class el implements Runnable {
    public final int f34033a;
    public final fl f34034b;

    public el(fl flVar, int i10) {
        this.f34033a = i10;
        this.f34034b = flVar;
    }

    @Override
    public final void run() {
        switch (this.f34033a) {
            case 0:
                jk jkVar = this.f34034b.E.V;
                if (jkVar != null) {
                    jkVar.Q0 = false;
                    org.telegram.ui.Components.uf ufVar = jkVar.R0;
                    if (ufVar != null) {
                        ufVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                jk jkVar2 = this.f34034b.E.V;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
