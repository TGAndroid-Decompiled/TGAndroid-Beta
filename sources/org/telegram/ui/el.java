package org.telegram.ui;
public final class el implements Runnable {
    public final int f33281a;
    public final fl f33282b;

    public el(fl flVar, int i10) {
        this.f33281a = i10;
        this.f33282b = flVar;
    }

    @Override
    public final void run() {
        switch (this.f33281a) {
            case 0:
                lk lkVar = this.f33282b.H.Y;
                if (lkVar != null) {
                    lkVar.T0 = false;
                    org.telegram.ui.Components.eg egVar = lkVar.U0;
                    if (egVar != null) {
                        egVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                lk lkVar2 = this.f33282b.H.Y;
                if (lkVar2 != null) {
                    lkVar2.H0();
                    return;
                }
                return;
        }
    }
}
