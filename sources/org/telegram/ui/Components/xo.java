package org.telegram.ui.Components;

import org.telegram.ui.sa1;
public final class xo implements Runnable {
    public final int f30436a;
    public final pp f30437b;

    public xo(pp ppVar, int i10) {
        this.f30436a = i10;
        this.f30437b = ppVar;
    }

    @Override
    public final void run() {
        switch (this.f30436a) {
            case 0:
                this.f30437b.h.l();
                return;
            case 1:
                this.f30437b.s(true);
                return;
            case 2:
                pp ppVar = this.f30437b;
                org.telegram.ui.wn wnVar = ppVar.v;
                org.telegram.ui.ActionBar.m2 d02 = sa1.d0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                ?? obj = new Object();
                obj.f19598a = true;
                d02.setResourceProvider(wnVar.getResourceProvider());
                obj.f19600c = new uh(2);
                obj.d = new xo(ppVar, 3);
                obj.f19599b = new xo(ppVar, 4);
                obj.e = true;
                ppVar.X = d02;
                wnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f30437b.u();
                return;
            case 4:
                this.f30437b.X = null;
                return;
            case 5:
                this.f30437b.u();
                return;
            case 6:
                this.f30437b.X = null;
                return;
            default:
                pp ppVar2 = this.f30437b;
                ppVar2.U.f(ppVar2.G, true);
                return;
        }
    }
}
