package org.telegram.ui.Components;
public final class ep implements Runnable {
    public final int f25970a;
    public final wp f25971b;

    public ep(wp wpVar, int i10) {
        this.f25970a = i10;
        this.f25971b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f25970a) {
            case 0:
                this.f25971b.h.l();
                return;
            case 1:
                this.f25971b.t(true);
                return;
            case 2:
                wp wpVar = this.f25971b;
                org.telegram.ui.sn snVar = wpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = org.telegram.ui.r91.d0(snVar.getMessagesController().getChat(Long.valueOf(-snVar.a())), true);
                ?? obj = new Object();
                obj.f21552a = true;
                d02.setResourceProvider(snVar.getResourceProvider());
                obj.f21554c = new rc(7);
                obj.d = new ep(wpVar, 3);
                obj.f21553b = new ep(wpVar, 4);
                obj.e = true;
                wpVar.X = d02;
                snVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f25971b.w();
                return;
            case 4:
                this.f25971b.X = null;
                return;
            case 5:
                this.f25971b.w();
                return;
            case 6:
                this.f25971b.X = null;
                return;
            default:
                wp wpVar2 = this.f25971b;
                wpVar2.U.f(wpVar2.G, true);
                return;
        }
    }
}
