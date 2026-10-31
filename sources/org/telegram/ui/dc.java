package org.telegram.ui;
public final class dc implements Runnable {
    public final int f36731a;
    public final zc f36732b;

    public dc(zc zcVar, int i10) {
        this.f36731a = i10;
        this.f36732b = zcVar;
    }

    @Override
    public final void run() {
        int i10 = this.f36731a;
        zc zcVar = this.f36732b;
        switch (i10) {
            case 0:
                zc.Y(zcVar);
                return;
            default:
                org.telegram.messenger.m5.n(null, 2131752260, org.telegram.ui.Components.cc.a0(zcVar), 2131623999, 36);
                return;
        }
    }
}
