package org.telegram.ui;
public final class gp implements Runnable {
    public final int f34031a;
    public final rp f34032b;

    public gp(rp rpVar, int i10) {
        this.f34031a = i10;
        this.f34032b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f34031a) {
            case 0:
                rp rpVar = this.f34032b;
                org.telegram.ui.ActionBar.a2 a2Var = rpVar.f37430r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new lg(rpVar, 2));
                    rpVar.showDialog(rpVar.f37430r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f34032b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.E, 0, true);
                return;
            default:
                rp rpVar3 = this.f34032b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.E, 0, true);
                return;
        }
    }
}
