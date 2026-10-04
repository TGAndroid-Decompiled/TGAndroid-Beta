package org.telegram.ui;
public final class ip implements Runnable {
    public final int f37477a;
    public final tp f37478b;

    public ip(tp tpVar, int i10) {
        this.f37477a = i10;
        this.f37478b = tpVar;
    }

    @Override
    public final void run() {
        switch (this.f37477a) {
            case 0:
                tp tpVar = this.f37478b;
                org.telegram.ui.ActionBar.b2 b2Var = tpVar.f40926r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new rg(tpVar, 2));
                    tpVar.showDialog(tpVar.f40926r);
                    return;
                }
                return;
            case 1:
                tp tpVar2 = this.f37478b;
                tpVar2.getMessagesController().loadFullChat(tpVar2.E, 0, true);
                return;
            default:
                tp tpVar3 = this.f37478b;
                tpVar3.getMessagesController().loadFullChat(tpVar3.E, 0, true);
                return;
        }
    }
}
