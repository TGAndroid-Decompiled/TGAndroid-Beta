package org.telegram.ui.Components;
public final class ep implements Runnable {
    public final int f26019a;
    public final wp f26020b;

    public ep(wp wpVar, int i10) {
        this.f26019a = i10;
        this.f26020b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f26019a) {
            case 0:
                this.f26020b.h.l();
                return;
            case 1:
                this.f26020b.v(true);
                return;
            case 2:
                wp wpVar = this.f26020b;
                org.telegram.ui.sn snVar = wpVar.v;
                org.telegram.ui.ActionBar.o2 d02 = org.telegram.ui.u91.d0(snVar.getMessagesController().getChat(Long.valueOf(-snVar.a())), true);
                ?? obj = new Object();
                obj.f21636a = true;
                d02.setResourceProvider(snVar.getResourceProvider());
                obj.f21638c = new rc(7);
                obj.d = new ep(wpVar, 3);
                obj.f21637b = new ep(wpVar, 4);
                obj.e = true;
                wpVar.W = d02;
                snVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f26020b.z();
                return;
            case 4:
                this.f26020b.W = null;
                return;
            case 5:
                this.f26020b.z();
                return;
            case 6:
                this.f26020b.W = null;
                return;
            default:
                wp wpVar2 = this.f26020b;
                wpVar2.T.f(wpVar2.F, true);
                return;
        }
    }
}
