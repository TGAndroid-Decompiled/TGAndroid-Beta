package org.telegram.ui;
public final class kk implements Runnable {
    public final int f48714a;
    public final lk f48715b;

    public kk(lk lkVar, int i7) {
        this.f48714a = i7;
        this.f48715b = lkVar;
    }

    @Override
    public final void run() {
        switch (this.f48714a) {
            case 0:
                qj qjVar = this.f48715b.I.f45118a0;
                if (qjVar != null) {
                    qjVar.W0();
                    return;
                }
                return;
            default:
                qj qjVar2 = this.f48715b.I.f45118a0;
                if (qjVar2 != null) {
                    qjVar2.U0 = false;
                    org.telegram.ui.Components.sf sfVar = qjVar2.V0;
                    if (sfVar != null) {
                        sfVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
