package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f29093a;
    public final xj f29094b;

    public vj(xj xjVar, int i10) {
        this.f29093a = i10;
        this.f29094b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f29093a) {
            case 0:
                xj xjVar = this.f29094b;
                if (xjVar.f30332f != null) {
                    xjVar.v = org.telegram.messenger.wh.g(new StringBuilder("+"), xjVar.f30332f.phone, gf.b.c());
                    xjVar.f30335s = xjVar.f30332f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f29094b;
                xjVar2.f30331c.l(xjVar2.v, false);
                return;
        }
    }
}
