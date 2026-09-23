package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj implements Runnable {
    public final int f29733a;
    public final yj f29734b;

    public wj(yj yjVar, int i10) {
        this.f29733a = i10;
        this.f29734b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f29733a) {
            case 0:
                yj yjVar = this.f29734b;
                if (yjVar.f30295f != null) {
                    yjVar.v = org.telegram.messenger.ul.h(new StringBuilder("+"), yjVar.f30295f.phone, gf.b.c());
                    yjVar.f30298s = yjVar.f30295f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f29734b;
                yjVar2.f30294c.l(yjVar2.v, false);
                return;
        }
    }
}
