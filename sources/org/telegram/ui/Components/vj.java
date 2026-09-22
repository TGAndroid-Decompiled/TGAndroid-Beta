package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f28815a;
    public final xj f28816b;

    public vj(xj xjVar, int i10) {
        this.f28815a = i10;
        this.f28816b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f28815a) {
            case 0:
                xj xjVar = this.f28816b;
                if (xjVar.f29980f != null) {
                    xjVar.v = org.telegram.messenger.vl.h(new StringBuilder("+"), xjVar.f29980f.phone, gf.b.c());
                    xjVar.f29983s = xjVar.f29980f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f28816b;
                xjVar2.f29979c.l(xjVar2.v, false);
                return;
        }
    }
}
