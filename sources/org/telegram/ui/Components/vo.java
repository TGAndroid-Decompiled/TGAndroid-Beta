package org.telegram.ui.Components;

import org.telegram.ui.sa1;
public final class vo implements Runnable {
    public final int f29229a;
    public final np f29230b;

    public vo(np npVar, int i10) {
        this.f29229a = i10;
        this.f29230b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f29229a) {
            case 0:
                this.f29230b.h.l();
                return;
            case 1:
                this.f29230b.s(true);
                return;
            case 2:
                np npVar = this.f29230b;
                org.telegram.ui.wn wnVar = npVar.v;
                org.telegram.ui.ActionBar.m2 d02 = sa1.d0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                ?? obj = new Object();
                obj.f19581a = true;
                d02.setResourceProvider(wnVar.getResourceProvider());
                obj.f19583c = new th(2);
                obj.d = new vo(npVar, 3);
                obj.f19582b = new vo(npVar, 4);
                obj.e = true;
                npVar.X = d02;
                wnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f29230b.u();
                return;
            case 4:
                this.f29230b.X = null;
                return;
            case 5:
                this.f29230b.u();
                return;
            case 6:
                this.f29230b.X = null;
                return;
            default:
                np npVar2 = this.f29230b;
                npVar2.U.f(npVar2.G, true);
                return;
        }
    }
}
