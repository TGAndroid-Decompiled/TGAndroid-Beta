package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vj implements Runnable {
    public final int f28811a;
    public final xj f28812b;

    public vj(xj xjVar, int i10) {
        this.f28811a = i10;
        this.f28812b = xjVar;
    }

    @Override
    public final void run() {
        switch (this.f28811a) {
            case 0:
                xj xjVar = this.f28812b;
                if (xjVar.f29920f != null) {
                    xjVar.v = org.telegram.messenger.w1.j(new StringBuilder("+"), xjVar.f29920f.phone, gf.b.c());
                    xjVar.f29923s = xjVar.f29920f;
                    AndroidUtilities.runOnUIThread(new vj(xjVar, 1));
                    return;
                }
                return;
            default:
                xj xjVar2 = this.f28812b;
                xjVar2.f29919c.l(xjVar2.v, false);
                return;
        }
    }
}
