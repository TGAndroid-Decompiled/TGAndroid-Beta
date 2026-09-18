package org.telegram.ui.Components;

import org.telegram.ui.ab1;
public final class uo implements Runnable {
    public final int f28458a;
    public final mp f28459b;

    public uo(mp mpVar, int i10) {
        this.f28458a = i10;
        this.f28459b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f28458a) {
            case 0:
                this.f28459b.h.l();
                return;
            case 1:
                this.f28459b.s(true);
                return;
            case 2:
                mp mpVar = this.f28459b;
                org.telegram.ui.bo boVar = mpVar.v;
                org.telegram.ui.ActionBar.o2 d02 = ab1.d0(boVar.getMessagesController().getChat(Long.valueOf(-boVar.a())), true);
                ?? obj = new Object();
                obj.f19398a = true;
                d02.setResourceProvider(boVar.getResourceProvider());
                obj.f19400c = new sh(2);
                obj.d = new uo(mpVar, 3);
                obj.f19399b = new uo(mpVar, 4);
                obj.e = true;
                mpVar.X = d02;
                boVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28459b.u();
                return;
            case 4:
                this.f28459b.X = null;
                return;
            case 5:
                this.f28459b.u();
                return;
            case 6:
                this.f28459b.X = null;
                return;
            default:
                mp mpVar2 = this.f28459b;
                mpVar2.U.f(mpVar2.G, true);
                return;
        }
    }
}
