package org.telegram.ui.Components;
public final class eo implements Runnable {
    public final int f33291a;
    public final vo f33292b;

    public eo(vo voVar, int i7) {
        this.f33291a = i7;
        this.f33292b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f33291a) {
            case 0:
                this.f33292b.n1.f();
                return;
            case 1:
                this.f33292b.K0(true);
                return;
            case 2:
                vo voVar = this.f33292b;
                org.telegram.ui.an anVar = voVar.f39003r1;
                org.telegram.ui.ActionBar.f2 g02 = org.telegram.ui.c51.g0(anVar.getMessagesController().M0(Long.valueOf(-anVar.a())), true);
                ?? obj = new Object();
                obj.f27420a = true;
                g02.setResourceProvider(anVar.getResourceProvider());
                obj.f27422c = new org.telegram.messenger.pd(26);
                obj.d = new eo(voVar, 3);
                obj.f27421b = new eo(voVar, 4);
                obj.f27423e = true;
                voVar.N1 = g02;
                anVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f33292b.O0();
                return;
            case 4:
                this.f33292b.N1 = null;
                return;
            case 5:
                this.f33292b.O0();
                return;
            case 6:
                this.f33292b.N1 = null;
                return;
            default:
                vo voVar2 = this.f33292b;
                voVar2.K1.c(voVar2.f39008w1);
                return;
        }
    }
}
