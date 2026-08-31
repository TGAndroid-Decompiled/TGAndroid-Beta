package org.telegram.ui;
public final class fp implements Runnable {
    public final int f36986a;
    public final rp f36987b;

    public fp(rp rpVar, int i10) {
        this.f36986a = i10;
        this.f36987b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f36986a) {
            case 0:
                rp rpVar = this.f36987b;
                org.telegram.ui.ActionBar.d2 d2Var = rpVar.f41019r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new ig(rpVar, 2));
                    rpVar.showDialog(rpVar.f41019r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f36987b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.B, 0, true);
                return;
            default:
                rp rpVar3 = this.f36987b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.B, 0, true);
                return;
        }
    }
}
