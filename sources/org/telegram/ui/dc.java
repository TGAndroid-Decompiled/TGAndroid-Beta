package org.telegram.ui;
public final class dc implements Runnable {
    public final int f36553a;
    public final zc f36554b;

    public dc(zc zcVar, int i10) {
        this.f36553a = i10;
        this.f36554b = zcVar;
    }

    @Override
    public final void run() {
        int i10 = this.f36553a;
        zc zcVar = this.f36554b;
        switch (i10) {
            case 0:
                zc.Z(zcVar);
                return;
            default:
                org.telegram.messenger.m5.n(null, 2131752260, org.telegram.ui.Components.cc.a0(zcVar), 2131623999, 36);
                return;
        }
    }
}
