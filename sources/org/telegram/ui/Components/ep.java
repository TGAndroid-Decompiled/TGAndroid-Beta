package org.telegram.ui.Components;
public final class ep implements Runnable {
    public final int f25961a;
    public final wp f25962b;

    public ep(wp wpVar, int i10) {
        this.f25961a = i10;
        this.f25962b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f25961a) {
            case 0:
                this.f25962b.h.l();
                return;
            case 1:
                this.f25962b.u(true);
                return;
            case 2:
                wp wpVar = this.f25962b;
                org.telegram.ui.qn qnVar = wpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = org.telegram.ui.p91.d0(qnVar.getMessagesController().getChat(Long.valueOf(-qnVar.a())), true);
                ?? obj = new Object();
                obj.f21555a = true;
                d02.setResourceProvider(qnVar.getResourceProvider());
                obj.f21557c = new sc(6);
                obj.d = new ep(wpVar, 3);
                obj.f21556b = new ep(wpVar, 4);
                obj.e = true;
                wpVar.X = d02;
                qnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f25962b.w();
                return;
            case 4:
                this.f25962b.X = null;
                return;
            case 5:
                this.f25962b.w();
                return;
            case 6:
                this.f25962b.X = null;
                return;
            default:
                wp wpVar2 = this.f25962b;
                wpVar2.U.f(wpVar2.G, true);
                return;
        }
    }
}
