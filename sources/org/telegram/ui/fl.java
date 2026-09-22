package org.telegram.ui;
public final class fl implements Runnable {
    public final int f33711a;
    public final gl f33712b;

    public fl(gl glVar, int i10) {
        this.f33711a = i10;
        this.f33712b = glVar;
    }

    @Override
    public final void run() {
        switch (this.f33711a) {
            case 0:
                mk mkVar = this.f33712b.H.Y;
                if (mkVar != null) {
                    mkVar.T0 = false;
                    org.telegram.ui.Components.dg dgVar = mkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                mk mkVar2 = this.f33712b.H.Y;
                if (mkVar2 != null) {
                    mkVar2.H0();
                    return;
                }
                return;
        }
    }
}
