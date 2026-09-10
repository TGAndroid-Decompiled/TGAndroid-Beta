package org.telegram.ui.Components;

import org.telegram.ui.fb1;
public final class ap implements Runnable {
    public final int f21555a;
    public final sp f21556b;

    public ap(sp spVar, int i10) {
        this.f21555a = i10;
        this.f21556b = spVar;
    }

    @Override
    public final void run() {
        switch (this.f21555a) {
            case 0:
                this.f21556b.h.l();
                return;
            case 1:
                this.f21556b.s(true);
                return;
            case 2:
                sp spVar = this.f21556b;
                org.telegram.ui.eo eoVar = spVar.v;
                org.telegram.ui.ActionBar.p2 d02 = fb1.d0(eoVar.getMessagesController().getChat(Long.valueOf(-eoVar.a())), true);
                ?? obj = new Object();
                obj.f18485a = true;
                d02.setResourceProvider(eoVar.getResourceProvider());
                obj.f18487c = new bi.f0(27);
                obj.d = new ap(spVar, 3);
                obj.f18486b = new ap(spVar, 4);
                obj.e = true;
                spVar.X = d02;
                eoVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f21556b.u();
                return;
            case 4:
                this.f21556b.X = null;
                return;
            case 5:
                this.f21556b.u();
                return;
            case 6:
                this.f21556b.X = null;
                return;
            default:
                sp spVar2 = this.f21556b;
                spVar2.U.f(spVar2.G, true);
                return;
        }
    }
}
