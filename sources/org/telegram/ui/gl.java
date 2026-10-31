package org.telegram.ui;
public final class gl implements Runnable {
    public final int f37592a;
    public final hl f37593b;

    public gl(hl hlVar, int i10) {
        this.f37592a = i10;
        this.f37593b = hlVar;
    }

    @Override
    public final void run() {
        switch (this.f37592a) {
            case 0:
                mk mkVar = this.f37593b.H.Z;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.gf gfVar = mkVar.U0;
                    if (gfVar != null) {
                        gfVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                mk mkVar2 = this.f37593b.H.Z;
                if (mkVar2 != null) {
                    mkVar2.F0();
                    return;
                }
                return;
        }
    }
}
