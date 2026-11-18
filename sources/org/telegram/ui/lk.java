package org.telegram.ui;
public final class lk implements Runnable {
    public final int f49627a;
    public final mk f49628b;

    public lk(mk mkVar, int i7) {
        this.f49627a = i7;
        this.f49628b = mkVar;
    }

    @Override
    public final void run() {
        switch (this.f49627a) {
            case 0:
                rj rjVar = this.f49628b.I.f45932a0;
                if (rjVar != null) {
                    rjVar.e1();
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f49628b.I.f45932a0;
                if (rjVar2 != null) {
                    rjVar2.U0 = false;
                    org.telegram.ui.Components.cg cgVar = rjVar2.V0;
                    if (cgVar != null) {
                        cgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
