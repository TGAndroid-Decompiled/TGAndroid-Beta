package org.telegram.ui.Components;

import org.telegram.ui.s91;
public final class ko implements Runnable {
    public final int f30207a;
    public final cp f30208b;

    public ko(cp cpVar, int i9) {
        this.f30207a = i9;
        this.f30208b = cpVar;
    }

    @Override
    public final void run() {
        switch (this.f30207a) {
            case 0:
                this.f30208b.h.l();
                return;
            case 1:
                this.f30208b.s(true);
                return;
            case 2:
                cp cpVar = this.f30208b;
                org.telegram.ui.qn qnVar = cpVar.v;
                org.telegram.ui.ActionBar.o2 c02 = s91.c0(qnVar.getMessagesController().getChat(Long.valueOf(-qnVar.a())), true);
                ?? obj = new Object();
                obj.f23653a = true;
                c02.setResourceProvider(qnVar.getResourceProvider());
                obj.f23655c = new hc(7);
                obj.d = new ko(cpVar, 3);
                obj.f23654b = new ko(cpVar, 4);
                obj.f23656e = true;
                cpVar.T = c02;
                qnVar.showAsSheet(c02, obj);
                return;
            case 3:
                this.f30208b.u();
                return;
            case 4:
                this.f30208b.T = null;
                return;
            case 5:
                this.f30208b.u();
                return;
            case 6:
                this.f30208b.T = null;
                return;
            default:
                cp cpVar2 = this.f30208b;
                cpVar2.Q.f(cpVar2.C, true);
                return;
        }
    }
}
