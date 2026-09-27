package org.telegram.ui.Components;

import org.telegram.ui.ra1;
public final class wo implements Runnable {
    public final int f30128a;
    public final op f30129b;

    public wo(op opVar, int i10) {
        this.f30128a = i10;
        this.f30129b = opVar;
    }

    @Override
    public final void run() {
        switch (this.f30128a) {
            case 0:
                this.f30129b.h.l();
                return;
            case 1:
                this.f30129b.s(true);
                return;
            case 2:
                op opVar = this.f30129b;
                org.telegram.ui.xn xnVar = opVar.v;
                org.telegram.ui.ActionBar.o2 b02 = ra1.b0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                ?? obj = new Object();
                obj.f19631a = true;
                b02.setResourceProvider(xnVar.getResourceProvider());
                obj.f19633c = new th(2);
                obj.d = new wo(opVar, 3);
                obj.f19632b = new wo(opVar, 4);
                obj.e = true;
                opVar.X = b02;
                xnVar.showAsSheet(b02, obj);
                return;
            case 3:
                this.f30129b.u();
                return;
            case 4:
                this.f30129b.X = null;
                return;
            case 5:
                this.f30129b.u();
                return;
            case 6:
                this.f30129b.X = null;
                return;
            default:
                op opVar2 = this.f30129b;
                opVar2.U.f(opVar2.G, true);
                return;
        }
    }
}
