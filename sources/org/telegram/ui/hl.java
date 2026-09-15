package org.telegram.ui;
public final class hl implements Runnable {
    public final int f34303a;
    public final il f34304b;

    public hl(il ilVar, int i10) {
        this.f34303a = i10;
        this.f34304b = ilVar;
    }

    @Override
    public final void run() {
        switch (this.f34303a) {
            case 0:
                mk mkVar = this.f34304b.H.Y;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.cg cgVar = mkVar.U0;
                    if (cgVar != null) {
                        cgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                mk mkVar2 = this.f34304b.H.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    return;
                }
                return;
        }
    }
}
