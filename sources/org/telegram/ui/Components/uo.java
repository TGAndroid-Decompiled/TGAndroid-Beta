package org.telegram.ui.Components;

import org.telegram.ui.ab1;
public final class uo implements Runnable {
    public final int f28455a;
    public final mp f28456b;

    public uo(mp mpVar, int i10) {
        this.f28455a = i10;
        this.f28456b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f28455a) {
            case 0:
                this.f28456b.h.l();
                return;
            case 1:
                this.f28456b.s(true);
                return;
            case 2:
                mp mpVar = this.f28456b;
                org.telegram.ui.bo boVar = mpVar.v;
                org.telegram.ui.ActionBar.o2 d02 = ab1.d0(boVar.getMessagesController().getChat(Long.valueOf(-boVar.a())), true);
                ?? obj = new Object();
                obj.f19397a = true;
                d02.setResourceProvider(boVar.getResourceProvider());
                obj.f19399c = new sh(2);
                obj.d = new uo(mpVar, 3);
                obj.f19398b = new uo(mpVar, 4);
                obj.e = true;
                mpVar.X = d02;
                boVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28456b.u();
                return;
            case 4:
                this.f28456b.X = null;
                return;
            case 5:
                this.f28456b.u();
                return;
            case 6:
                this.f28456b.X = null;
                return;
            default:
                mp mpVar2 = this.f28456b;
                mpVar2.U.f(mpVar2.G, true);
                return;
        }
    }
}
