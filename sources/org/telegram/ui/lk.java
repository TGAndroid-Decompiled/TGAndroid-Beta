package org.telegram.ui;
public final class lk implements Runnable {
    public final int f49774a;
    public final mk f49775b;

    public lk(mk mkVar, int i7) {
        this.f49774a = i7;
        this.f49775b = mkVar;
    }

    @Override
    public final void run() {
        switch (this.f49774a) {
            case 0:
                rj rjVar = this.f49775b.I.f46118a0;
                if (rjVar != null) {
                    rjVar.j1();
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f49775b.I.f46118a0;
                if (rjVar2 != null) {
                    rjVar2.U0 = false;
                    org.telegram.ui.Components.eg egVar = rjVar2.V0;
                    if (egVar != null) {
                        egVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
