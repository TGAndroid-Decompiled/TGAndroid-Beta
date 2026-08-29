package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pj implements Runnable {
    public final int f31684a;
    public final rj f31685b;

    public pj(rj rjVar, int i10) {
        this.f31684a = i10;
        this.f31685b = rjVar;
    }

    @Override
    public final void run() {
        switch (this.f31684a) {
            case 0:
                rj rjVar = this.f31685b;
                if (rjVar.f32321f != null) {
                    rjVar.v = org.telegram.messenger.x3.k(new StringBuilder("+"), rjVar.f32321f.phone, qe.b.c());
                    rjVar.f32324s = rjVar.f32321f;
                    AndroidUtilities.runOnUIThread(new pj(rjVar, 1));
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f31685b;
                rjVar2.f32319c.l(rjVar2.v, false);
                return;
        }
    }
}
