package org.telegram.ui.Components;

import org.telegram.ui.hb1;
public final class hp implements Runnable {
    public final int f25719a;
    public final zp f25720b;

    public hp(zp zpVar, int i10) {
        this.f25719a = i10;
        this.f25720b = zpVar;
    }

    @Override
    public final void run() {
        switch (this.f25719a) {
            case 0:
                this.f25720b.h.l();
                return;
            case 1:
                this.f25720b.u(true);
                return;
            case 2:
                zp zpVar = this.f25720b;
                org.telegram.ui.fo foVar = zpVar.v;
                org.telegram.ui.ActionBar.m2 d02 = hb1.d0(foVar.getMessagesController().getChat(Long.valueOf(-foVar.a())), true);
                ?? obj = new Object();
                obj.f20469a = true;
                d02.setResourceProvider(foVar.getResourceProvider());
                obj.f20471c = new ve(3);
                obj.d = new hp(zpVar, 3);
                obj.f20470b = new hp(zpVar, 4);
                obj.e = true;
                zpVar.X = d02;
                foVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f25720b.w();
                return;
            case 4:
                this.f25720b.X = null;
                return;
            case 5:
                this.f25720b.w();
                return;
            case 6:
                this.f25720b.X = null;
                return;
            default:
                zp zpVar2 = this.f25720b;
                zpVar2.U.f(zpVar2.G, true);
                return;
        }
    }
}
