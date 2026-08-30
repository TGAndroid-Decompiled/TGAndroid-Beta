package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nj implements Runnable {
    public final int f27293a;
    public final pj f27294b;

    public nj(pj pjVar, int i10) {
        this.f27293a = i10;
        this.f27294b = pjVar;
    }

    @Override
    public final void run() {
        switch (this.f27293a) {
            case 0:
                pj pjVar = this.f27294b;
                if (pjVar.f27871f != null) {
                    pjVar.v = org.telegram.messenger.y3.j(new StringBuilder("+"), pjVar.f27871f.phone, se.b.c());
                    pjVar.f27874s = pjVar.f27871f;
                    AndroidUtilities.runOnUIThread(new nj(pjVar, 1));
                    return;
                }
                return;
            default:
                pj pjVar2 = this.f27294b;
                pjVar2.f27870c.l(pjVar2.v, false);
                return;
        }
    }
}
