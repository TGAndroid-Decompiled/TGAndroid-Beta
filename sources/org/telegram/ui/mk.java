package org.telegram.ui;
public final class mk implements Runnable {
    public final int f47890a;
    public final nk f47891b;

    public mk(nk nkVar, int i7) {
        this.f47890a = i7;
        this.f47891b = nkVar;
    }

    @Override
    public final void run() {
        switch (this.f47890a) {
            case 0:
                sj sjVar = this.f47891b.H.Z;
                if (sjVar != null) {
                    sjVar.H0();
                    return;
                }
                return;
            default:
                sj sjVar2 = this.f47891b.H.Z;
                if (sjVar2 != null) {
                    sjVar2.T0 = false;
                    org.telegram.ui.Components.mf mfVar = sjVar2.U0;
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
