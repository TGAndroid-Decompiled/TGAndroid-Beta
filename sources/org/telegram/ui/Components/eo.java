package org.telegram.ui.Components;
public final class eo implements Runnable {
    public final int f33458a;
    public final vo f33459b;

    public eo(vo voVar, int i7) {
        this.f33458a = i7;
        this.f33459b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f33458a) {
            case 0:
                this.f33459b.n1.f();
                return;
            case 1:
                this.f33459b.K0(true);
                return;
            case 2:
                vo voVar = this.f33459b;
                org.telegram.ui.cn cnVar = voVar.f39150r1;
                org.telegram.ui.ActionBar.f2 g02 = org.telegram.ui.d51.g0(cnVar.getMessagesController().M0(Long.valueOf(-cnVar.a())), true);
                ?? obj = new Object();
                obj.f27408a = true;
                g02.setResourceProvider(cnVar.getResourceProvider());
                obj.f27410c = new org.telegram.messenger.rc(28);
                obj.d = new eo(voVar, 3);
                obj.f27409b = new eo(voVar, 4);
                obj.f27411e = true;
                voVar.N1 = g02;
                cnVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f33459b.O0();
                return;
            case 4:
                this.f33459b.N1 = null;
                return;
            case 5:
                this.f33459b.O0();
                return;
            case 6:
                this.f33459b.N1 = null;
                return;
            default:
                vo voVar2 = this.f33459b;
                voVar2.K1.c(voVar2.f39155w1);
                return;
        }
    }
}
