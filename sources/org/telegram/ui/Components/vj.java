package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f31375a;
    public final xj f31376b;

    public vj(xj xjVar, int i10) {
        this.f31375a = i10;
        this.f31376b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f31375a) {
            case 0:
                xj xjVar = this.f31376b;
                if (xjVar.f32618f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f32618f.phone, gf.b.c());
                    xjVar.f32621s = xjVar.f32618f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f31376b;
                xjVar2.f32616c.l(xjVar2.v, false);
                return;
        }
    }
}
