package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f29167a;
    public final xj f29168b;

    public vj(xj xjVar, int i10) {
        this.f29167a = i10;
        this.f29168b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f29167a) {
            case 0:
                xj xjVar = this.f29168b;
                if (xjVar.f30288f != null) {
                    xjVar.v = org.telegram.messenger.rk.h(new StringBuilder("+"), xjVar.f30288f.phone, gf.b.c());
                    xjVar.f30291s = xjVar.f30288f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f29168b;
                xjVar2.f30287c.l(xjVar2.v, false);
                return;
        }
    }
}
