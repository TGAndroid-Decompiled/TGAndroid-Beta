package org.telegram.ui;
public final class el implements Runnable {
    public final int f36520a;
    public final fl f36521b;

    public el(fl flVar, int i10) {
        this.f36520a = i10;
        this.f36521b = flVar;
    }

    @Override
    public final void run() {
        switch (this.f36520a) {
            case 0:
                jk jkVar = this.f36521b.E.V;
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
                jk jkVar2 = this.f36521b.E.V;
                if (jkVar2 != null) {
                    jkVar2.H0();
                    return;
                }
                return;
        }
    }
}
