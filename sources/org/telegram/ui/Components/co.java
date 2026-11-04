package org.telegram.ui.Components;
public final class co implements Runnable {
    public final int f32776a;
    public final vo f32777b;

    public co(vo voVar, int i3) {
        this.f32776a = i3;
        this.f32777b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f32776a) {
            case 0:
                this.f32777b.f39187o1.f();
                return;
            case 1:
                this.f32777b.K0(true);
                return;
            case 2:
                vo voVar = this.f32777b;
                org.telegram.ui.wm wmVar = voVar.f39191s1;
                org.telegram.ui.ActionBar.d2 g02 = org.telegram.ui.r41.g0(wmVar.getMessagesController().M0(Long.valueOf(-wmVar.a())), true);
                ?? obj = new Object();
                obj.f27395a = true;
                g02.setResourceProvider(wmVar.getResourceProvider());
                obj.f27397c = new go(0);
                obj.d = new co(voVar, 3);
                obj.f27396b = new co(voVar, 4);
                obj.f27398e = true;
                voVar.O1 = g02;
                wmVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f32777b.O0();
                return;
            case 4:
                this.f32777b.O1 = null;
                return;
            case 5:
                this.f32777b.O0();
                return;
            case 6:
                this.f32777b.O1 = null;
                return;
            default:
                vo voVar2 = this.f32777b;
                voVar2.L1.c(voVar2.f39196x1);
                return;
        }
    }
}
