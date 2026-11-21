package org.telegram.ui;
public final class lk implements Runnable {
    public final int f49637a;
    public final mk f49638b;

    public lk(mk mkVar, int i7) {
        this.f49637a = i7;
        this.f49638b = mkVar;
    }

    @Override
    public final void run() {
        switch (this.f49637a) {
            case 0:
                rj rjVar = this.f49638b.I.f45946a0;
                if (rjVar != null) {
                    rjVar.i1();
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f49638b.I.f45946a0;
                if (rjVar2 != null) {
                    rjVar2.U0 = false;
                    org.telegram.ui.Components.fg fgVar = rjVar2.V0;
                    if (fgVar != null) {
                        fgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
