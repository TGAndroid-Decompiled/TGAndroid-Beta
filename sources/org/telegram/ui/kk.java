package org.telegram.ui;
public final class kk implements Runnable {
    public final int f47202a;
    public final lk f47203b;

    public kk(lk lkVar, int i7) {
        this.f47202a = i7;
        this.f47203b = lkVar;
    }

    @Override
    public final void run() {
        switch (this.f47202a) {
            case 0:
                qj qjVar = this.f47203b.H.Z;
                if (qjVar != null) {
                    qjVar.H0();
                    return;
                }
                return;
            default:
                qj qjVar2 = this.f47203b.H.Z;
                if (qjVar2 != null) {
                    qjVar2.T0 = false;
                    org.telegram.ui.Components.mf mfVar = qjVar2.U0;
                    if (mfVar != null) {
                        mfVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
