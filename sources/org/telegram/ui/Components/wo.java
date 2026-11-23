package org.telegram.ui.Components;
public final class wo implements Runnable {
    public final int f41861a;
    public final np f41862b;

    public wo(np npVar, int i7) {
        this.f41861a = i7;
        this.f41862b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f41861a) {
            case 0:
                this.f41862b.f37930r1.f();
                return;
            case 1:
                this.f41862b.L0(true);
                return;
            case 2:
                np npVar = this.f41862b;
                org.telegram.ui.bn bnVar = npVar.f37934v1;
                org.telegram.ui.ActionBar.g2 g02 = org.telegram.ui.c51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                ?? obj = new Object();
                obj.f28905a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                obj.f28907c = new me(4);
                obj.d = new wo(npVar, 3);
                obj.f28906b = new wo(npVar, 4);
                obj.f28908e = true;
                npVar.R1 = g02;
                bnVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f41862b.P0();
                return;
            case 4:
                this.f41862b.R1 = null;
                return;
            case 5:
                this.f41862b.P0();
                return;
            case 6:
                this.f41862b.R1 = null;
                return;
            default:
                np npVar2 = this.f41862b;
                npVar2.O1.c(npVar2.A1);
                return;
        }
    }
}
