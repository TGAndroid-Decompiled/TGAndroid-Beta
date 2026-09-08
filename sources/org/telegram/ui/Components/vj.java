package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f31374a;
    public final xj f31375b;

    public vj(xj xjVar, int i10) {
        this.f31374a = i10;
        this.f31375b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f31374a) {
            case 0:
                xj xjVar = this.f31375b;
                if (xjVar.f32617f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f32617f.phone, gf.b.c());
                    xjVar.f32620s = xjVar.f32617f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f31375b;
                xjVar2.f32615c.l(xjVar2.v, false);
                return;
        }
    }
}
