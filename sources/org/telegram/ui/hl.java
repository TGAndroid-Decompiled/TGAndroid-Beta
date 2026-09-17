package org.telegram.ui;
public final class hl implements Runnable {
    public final int f37061a;
    public final il f37062b;

    public hl(il ilVar, int i10) {
        this.f37061a = i10;
        this.f37062b = ilVar;
    }

    @Override
    public final void run() {
        switch (this.f37061a) {
            case 0:
                mk mkVar = this.f37062b.H.Y;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.eg egVar = mkVar.U0;
                    if (egVar != null) {
                        egVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                mk mkVar2 = this.f37062b.H.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    return;
                }
                return;
        }
    }
}
