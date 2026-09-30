package org.telegram.ui;
public final class gp implements Runnable {
    public final int f34124a;
    public final rp f34125b;

    public gp(rp rpVar, int i10) {
        this.f34124a = i10;
        this.f34125b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f34124a) {
            case 0:
                rp rpVar = this.f34125b;
                org.telegram.ui.ActionBar.a2 a2Var = rpVar.f37524r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new lg(rpVar, 2));
                    rpVar.showDialog(rpVar.f37524r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f34125b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.E, 0, true);
                return;
            default:
                rp rpVar3 = this.f34125b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.E, 0, true);
                return;
        }
    }
}
