package org.telegram.ui;
public final class hl implements Runnable {
    public final int f37087a;
    public final il f37088b;

    public hl(il ilVar, int i10) {
        this.f37087a = i10;
        this.f37088b = ilVar;
    }

    @Override
    public final void run() {
        switch (this.f37087a) {
            case 0:
                mk mkVar = this.f37088b.H.Y;
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
                mk mkVar2 = this.f37088b.H.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    return;
                }
                return;
        }
    }
}
