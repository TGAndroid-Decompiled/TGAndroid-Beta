package org.telegram.ui;
public final class gp implements Runnable {
    public final int f34033a;
    public final rp f34034b;

    public gp(rp rpVar, int i10) {
        this.f34033a = i10;
        this.f34034b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f34033a) {
            case 0:
                rp rpVar = this.f34034b;
                org.telegram.ui.ActionBar.a2 a2Var = rpVar.f37432r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new lg(rpVar, 2));
                    rpVar.showDialog(rpVar.f37432r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f34034b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.E, 0, true);
                return;
            default:
                rp rpVar3 = this.f34034b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.E, 0, true);
                return;
        }
    }
}
