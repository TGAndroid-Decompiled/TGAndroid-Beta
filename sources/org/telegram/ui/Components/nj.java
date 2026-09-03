package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nj implements Runnable {
    public final int f27278a;
    public final pj f27279b;

    public nj(pj pjVar, int i10) {
        this.f27278a = i10;
        this.f27279b = pjVar;
    }

    @Override
    public final void run() {
        switch (this.f27278a) {
            case 0:
                pj pjVar = this.f27279b;
                if (pjVar.f27866f != null) {
                    pjVar.v = org.telegram.messenger.y3.j(new StringBuilder("+"), pjVar.f27866f.phone, se.b.c());
                    pjVar.f27869s = pjVar.f27866f;
                    AndroidUtilities.runOnUIThread(new nj(pjVar, 1));
                    return;
                }
                return;
            default:
                pj pjVar2 = this.f27279b;
                pjVar2.f27865c.l(pjVar2.v, false);
                return;
        }
    }
}
