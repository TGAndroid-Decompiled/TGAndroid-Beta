package org.telegram.ui;
public final class gp implements Runnable {
    public final int f34032a;
    public final rp f34033b;

    public gp(rp rpVar, int i10) {
        this.f34032a = i10;
        this.f34033b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f34032a) {
            case 0:
                rp rpVar = this.f34033b;
                org.telegram.ui.ActionBar.a2 a2Var = rpVar.f37431r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new lg(rpVar, 2));
                    rpVar.showDialog(rpVar.f37431r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f34033b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.E, 0, true);
                return;
            default:
                rp rpVar3 = this.f34033b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.E, 0, true);
                return;
        }
    }
}
