package org.telegram.ui;
public final class mk implements Runnable {
    public final int f47979a;
    public final nk f47980b;

    public mk(nk nkVar, int i7) {
        this.f47979a = i7;
        this.f47980b = nkVar;
    }

    @Override
    public final void run() {
        switch (this.f47979a) {
            case 0:
                sj sjVar = this.f47980b.H.Z;
                if (sjVar != null) {
                    sjVar.H0();
                    return;
                }
                return;
            default:
                sj sjVar2 = this.f47980b.H.Z;
                if (sjVar2 != null) {
                    sjVar2.T0 = false;
                    org.telegram.ui.Components.lf lfVar = sjVar2.U0;
                    if (lfVar != null) {
                        lfVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
