package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pj implements Runnable {
    public final int f30105a;
    public final rj f30106b;

    public pj(rj rjVar, int i10) {
        this.f30105a = i10;
        this.f30106b = rjVar;
    }

    @Override
    public final void run() {
        switch (this.f30105a) {
            case 0:
                rj rjVar = this.f30106b;
                if (rjVar.f30785f != null) {
                    rjVar.v = org.telegram.messenger.y3.j(new StringBuilder("+"), rjVar.f30785f.phone, se.b.c());
                    rjVar.f30788s = rjVar.f30785f;
                    AndroidUtilities.runOnUIThread(new pj(rjVar, 1));
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f30106b;
                rjVar2.f30783c.l(rjVar2.v, false);
                return;
        }
    }
}
