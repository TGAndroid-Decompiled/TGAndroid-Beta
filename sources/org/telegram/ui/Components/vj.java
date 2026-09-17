package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f31348a;
    public final xj f31349b;

    public vj(xj xjVar, int i10) {
        this.f31348a = i10;
        this.f31349b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f31348a) {
            case 0:
                xj xjVar = this.f31349b;
                if (xjVar.f32591f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f32591f.phone, gf.b.c());
                    xjVar.f32594s = xjVar.f32591f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f31349b;
                xjVar2.f32589c.l(xjVar2.v, false);
                return;
        }
    }
}
