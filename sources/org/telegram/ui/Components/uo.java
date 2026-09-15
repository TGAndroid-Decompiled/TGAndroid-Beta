package org.telegram.ui.Components;

import org.telegram.ui.ya1;
public final class uo implements Runnable {
    public final int f28475a;
    public final mp f28476b;

    public uo(mp mpVar, int i10) {
        this.f28475a = i10;
        this.f28476b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f28475a) {
            case 0:
                this.f28476b.h.l();
                return;
            case 1:
                this.f28476b.s(true);
                return;
            case 2:
                mp mpVar = this.f28476b;
                org.telegram.ui.bo boVar = mpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = ya1.d0(boVar.getMessagesController().getChat(Long.valueOf(-boVar.a())), true);
                ?? obj = new Object();
                obj.f19368a = true;
                d02.setResourceProvider(boVar.getResourceProvider());
                obj.f19370c = new sh(2);
                obj.d = new uo(mpVar, 3);
                obj.f19369b = new uo(mpVar, 4);
                obj.e = true;
                mpVar.X = d02;
                boVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28476b.u();
                return;
            case 4:
                this.f28476b.X = null;
                return;
            case 5:
                this.f28476b.u();
                return;
            case 6:
                this.f28476b.X = null;
                return;
            default:
                mp mpVar2 = this.f28476b;
                mpVar2.U.f(mpVar2.G, true);
                return;
        }
    }
}
