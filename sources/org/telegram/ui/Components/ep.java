package org.telegram.ui.Components;
public final class ep implements Runnable {
    public final int f25941a;
    public final wp f25942b;

    public ep(wp wpVar, int i10) {
        this.f25941a = i10;
        this.f25942b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f25941a) {
            case 0:
                this.f25942b.h.l();
                return;
            case 1:
                this.f25942b.u(true);
                return;
            case 2:
                wp wpVar = this.f25942b;
                org.telegram.ui.qn qnVar = wpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = org.telegram.ui.p91.d0(qnVar.getMessagesController().getChat(Long.valueOf(-qnVar.a())), true);
                ?? obj = new Object();
                obj.f21560a = true;
                d02.setResourceProvider(qnVar.getResourceProvider());
                obj.f21562c = new rc(7);
                obj.d = new ep(wpVar, 3);
                obj.f21561b = new ep(wpVar, 4);
                obj.e = true;
                wpVar.X = d02;
                qnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f25942b.w();
                return;
            case 4:
                this.f25942b.X = null;
                return;
            case 5:
                this.f25942b.w();
                return;
            case 6:
                this.f25942b.X = null;
                return;
            default:
                wp wpVar2 = this.f25942b;
                wpVar2.U.f(wpVar2.G, true);
                return;
        }
    }
}
