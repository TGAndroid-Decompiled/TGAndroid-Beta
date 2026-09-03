package org.telegram.ui;
public final class fp implements Runnable {
    public final int f36889a;
    public final rp f36890b;

    public fp(rp rpVar, int i10) {
        this.f36889a = i10;
        this.f36890b = rpVar;
    }

    @Override
    public final void run() {
        switch (this.f36889a) {
            case 0:
                rp rpVar = this.f36890b;
                org.telegram.ui.ActionBar.d2 d2Var = rpVar.f40899r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new ig(rpVar, 2));
                    rpVar.showDialog(rpVar.f40899r);
                    return;
                }
                return;
            case 1:
                rp rpVar2 = this.f36890b;
                rpVar2.getMessagesController().loadFullChat(rpVar2.B, 0, true);
                return;
            default:
                rp rpVar3 = this.f36890b;
                rpVar3.getMessagesController().loadFullChat(rpVar3.B, 0, true);
                return;
        }
    }
}
