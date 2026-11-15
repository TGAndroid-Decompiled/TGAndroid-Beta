package org.telegram.ui;
public final class kk implements Runnable {
    public final int f48668a;
    public final lk f48669b;

    public kk(lk lkVar, int i7) {
        this.f48668a = i7;
        this.f48669b = lkVar;
    }

    @Override
    public final void run() {
        switch (this.f48668a) {
            case 0:
                qj qjVar = this.f48669b.I.f45117a0;
                if (qjVar != null) {
                    qjVar.W0();
                    return;
                }
                return;
            default:
                qj qjVar2 = this.f48669b.I.f45117a0;
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
