package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f29190a;
    public final xj f29191b;

    public vj(xj xjVar, int i10) {
        this.f29190a = i10;
        this.f29191b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f29190a) {
            case 0:
                xj xjVar = this.f29191b;
                if (xjVar.f30335f != null) {
                    xjVar.v = org.telegram.messenger.rk.h(new StringBuilder("+"), xjVar.f30335f.phone, gf.b.c());
                    xjVar.f30338s = xjVar.f30335f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f29191b;
                xjVar2.f30334c.l(xjVar2.v, false);
                return;
        }
    }
}
