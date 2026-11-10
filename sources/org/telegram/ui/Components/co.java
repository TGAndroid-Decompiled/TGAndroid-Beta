package org.telegram.ui.Components;
public final class co implements Runnable {
    public final int f32723a;
    public final vo f32724b;

    public co(vo voVar, int i7) {
        this.f32723a = i7;
        this.f32724b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f32723a) {
            case 0:
                this.f32724b.f39067q1.f();
                return;
            case 1:
                this.f32724b.K0(true);
                return;
            case 2:
                vo voVar = this.f32724b;
                org.telegram.ui.cn cnVar = voVar.f39071u1;
                org.telegram.ui.ActionBar.f2 g02 = org.telegram.ui.e51.g0(cnVar.getMessagesController().M0(Long.valueOf(-cnVar.a())), true);
                ?? obj = new Object();
                obj.f27388a = true;
                g02.setResourceProvider(cnVar.getResourceProvider());
                obj.f27390c = new org.telegram.messenger.rc(28);
                obj.d = new co(voVar, 3);
                obj.f27389b = new co(voVar, 4);
                obj.f27391e = true;
                voVar.Q1 = g02;
                cnVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f32724b.O0();
                return;
            case 4:
                this.f32724b.Q1 = null;
                return;
            case 5:
                this.f32724b.O0();
                return;
            case 6:
                this.f32724b.Q1 = null;
                return;
            default:
                vo voVar2 = this.f32724b;
                voVar2.N1.c(voVar2.f39076z1);
                return;
        }
    }
}
