package org.telegram.ui.Components;

import org.telegram.ui.za1;
public final class uo implements Runnable {
    public final int f28784a;
    public final mp f28785b;

    public uo(mp mpVar, int i10) {
        this.f28784a = i10;
        this.f28785b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f28784a) {
            case 0:
                this.f28785b.h.l();
                return;
            case 1:
                this.f28785b.s(true);
                return;
            case 2:
                mp mpVar = this.f28785b;
                org.telegram.ui.zn znVar = mpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = za1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                ?? obj = new Object();
                obj.f19545a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                obj.f19547c = new sh(2);
                obj.d = new uo(mpVar, 3);
                obj.f19546b = new uo(mpVar, 4);
                obj.e = true;
                mpVar.X = d02;
                znVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28785b.u();
                return;
            case 4:
                this.f28785b.X = null;
                return;
            case 5:
                this.f28785b.u();
                return;
            case 6:
                this.f28785b.X = null;
                return;
            default:
                mp mpVar2 = this.f28785b;
                mpVar2.U.f(mpVar2.G, true);
                return;
        }
    }
}
