package org.telegram.ui;
public final class gk implements Runnable {
    public final int f45674a;
    public final hk f45675b;

    public gk(hk hkVar, int i3) {
        this.f45674a = i3;
        this.f45675b = hkVar;
    }

    @Override
    public final void run() {
        switch (this.f45674a) {
            case 0:
                mj mjVar = this.f45675b.I.f51237a0;
                if (mjVar != null) {
                    mjVar.G0();
                    return;
                }
                return;
            default:
                mj mjVar2 = this.f45675b.I.f51237a0;
                if (mjVar2 != null) {
                    mjVar2.U0 = false;
                    org.telegram.ui.Components.kf kfVar = mjVar2.V0;
                    if (kfVar != null) {
                        kfVar.u(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
