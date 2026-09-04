package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f31347a;
    public final xj f31348b;

    public vj(xj xjVar, int i10) {
        this.f31347a = i10;
        this.f31348b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f31347a) {
            case 0:
                xj xjVar = this.f31348b;
                if (xjVar.f32590f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f32590f.phone, gf.b.c());
                    xjVar.f32593s = xjVar.f32590f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f31348b;
                xjVar2.f32588c.l(xjVar2.v, false);
                return;
        }
    }
}
