package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f28814a;
    public final xj f28815b;

    public vj(xj xjVar, int i10) {
        this.f28814a = i10;
        this.f28815b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f28814a) {
            case 0:
                xj xjVar = this.f28815b;
                if (xjVar.f29923f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f29923f.phone, gf.b.c());
                    xjVar.f29926s = xjVar.f29923f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f28815b;
                xjVar2.f29922c.l(xjVar2.v, false);
                return;
        }
    }
}
