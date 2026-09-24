package org.telegram.ui;
public final class gp implements Runnable {
    public final int f34019a;
    public final rp f34020b;

    public gp(rp rpVar, int i10) {
        this.f34019a = i10;
        this.f34020b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f34019a) {
            case 0:
                rp rpVar = this.f34020b;
                org.telegram.ui.ActionBar.a2 a2Var = rpVar.f37418r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new lg(rpVar, 2));
                    rpVar.showDialog(rpVar.f37418r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f34020b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.E, 0, true);
                return;
            default:
                rp rpVar3 = this.f34020b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.E, 0, true);
                return;
        }
    }
}
