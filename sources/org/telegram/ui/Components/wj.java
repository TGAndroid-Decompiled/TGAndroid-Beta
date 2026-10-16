package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj implements Runnable {
    public final int f30593a;
    public final yj f30594b;

    public wj(yj yjVar, int i10) {
        this.f30593a = i10;
        this.f30594b = yjVar;
    }

    @Override
    public final void run() {
        switch (this.f30593a) {
            case 0:
                yj yjVar = this.f30594b;
                if (yjVar.f31277f != null) {
                    yjVar.v = org.telegram.messenger.sk.g(new StringBuilder("+"), yjVar.f31277f.phone, jf.b.c());
                    yjVar.f31280s = yjVar.f31277f;
                    AndroidUtilities.runOnUIThread(new wj(yjVar, 1));
                    return;
                }
                return;
            default:
                yj yjVar2 = this.f30594b;
                yjVar2.f31276c.l(yjVar2.v, false);
                return;
        }
    }
}
