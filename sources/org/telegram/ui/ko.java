package org.telegram.ui;
public final class ko implements Runnable {
    public final int f49371a;
    public final vo f49372b;

    public ko(vo voVar, int i7) {
        this.f49371a = i7;
        this.f49372b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f49371a) {
            case 0:
                vo voVar = this.f49372b;
                org.telegram.ui.ActionBar.t1 t1Var = voVar.f52865r;
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new wf(voVar, 2));
                    voVar.showDialog(voVar.f52865r);
                    return;
                }
                return;
            case 1:
                vo voVar2 = this.f49372b;
                voVar2.getMessagesController().b3(0, voVar2.F, true);
                return;
            default:
                vo voVar3 = this.f49372b;
                voVar3.getMessagesController().b3(0, voVar3.F, true);
                return;
        }
    }
}
