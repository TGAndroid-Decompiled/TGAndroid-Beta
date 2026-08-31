package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pj implements Runnable {
    public final int f30092a;
    public final rj f30093b;

    public pj(rj rjVar, int i10) {
        this.f30092a = i10;
        this.f30093b = rjVar;
    }

    @Override
    public final void run() {
        switch (this.f30092a) {
            case 0:
                rj rjVar = this.f30093b;
                if (rjVar.f30738f != null) {
                    rjVar.v = org.telegram.messenger.y3.j(new StringBuilder("+"), rjVar.f30738f.phone, se.b.c());
                    rjVar.f30741s = rjVar.f30738f;
                    AndroidUtilities.runOnUIThread(new pj(rjVar, 1));
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f30093b;
                rjVar2.f30736c.l(rjVar2.v, false);
                return;
        }
    }
}
