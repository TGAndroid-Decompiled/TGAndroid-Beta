package org.telegram.ui.Components;
public final class wo implements Runnable {
    public final int f41825a;
    public final np f41826b;

    public wo(np npVar, int i7) {
        this.f41825a = i7;
        this.f41826b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f41825a) {
            case 0:
                this.f41826b.f37887r1.f();
                return;
            case 1:
                this.f41826b.L0(true);
                return;
            case 2:
                np npVar = this.f41826b;
                org.telegram.ui.bn bnVar = npVar.f37891v1;
                org.telegram.ui.ActionBar.g2 g02 = org.telegram.ui.c51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                ?? obj = new Object();
                obj.f28871a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                obj.f28873c = new me(4);
                obj.d = new wo(npVar, 3);
                obj.f28872b = new wo(npVar, 4);
                obj.f28874e = true;
                npVar.R1 = g02;
                bnVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f41826b.P0();
                return;
            case 4:
                this.f41826b.R1 = null;
                return;
            case 5:
                this.f41826b.P0();
                return;
            case 6:
                this.f41826b.R1 = null;
                return;
            default:
                np npVar2 = this.f41826b;
                npVar2.O1.c(npVar2.A1);
                return;
        }
    }
}
