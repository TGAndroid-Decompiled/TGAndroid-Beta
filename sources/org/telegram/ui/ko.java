package org.telegram.ui;
public final class ko implements Runnable {
    public final int f49326a;
    public final vo f49327b;

    public ko(vo voVar, int i7) {
        this.f49326a = i7;
        this.f49327b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f49326a) {
            case 0:
                vo voVar = this.f49327b;
                org.telegram.ui.ActionBar.u1 u1Var = voVar.f52819r;
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new wf(voVar, 2));
                    voVar.showDialog(voVar.f52819r);
                    return;
                }
                return;
            case 1:
                vo voVar2 = this.f49327b;
                voVar2.getMessagesController().b3(0, voVar2.F, true);
                return;
            default:
                vo voVar3 = this.f49327b;
                voVar3.getMessagesController().b3(0, voVar3.F, true);
                return;
        }
    }
}
