package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f28818a;
    public final xj f28819b;

    public vj(xj xjVar, int i10) {
        this.f28818a = i10;
        this.f28819b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f28818a) {
            case 0:
                xj xjVar = this.f28819b;
                if (xjVar.f29983f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f29983f.phone, gf.b.c());
                    xjVar.f29986s = xjVar.f29983f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f28819b;
                xjVar2.f29982c.l(xjVar2.v, false);
                return;
        }
    }
}
