package org.telegram.ui;
public final class mp implements Runnable {
    public final int f40104a;
    public final xp f40105b;

    public mp(xp xpVar, int i10) {
        this.f40104a = i10;
        this.f40105b = xpVar;
    }

    @Override
    public final void run() {
        switch (this.f40104a) {
            case 0:
                xp xpVar = this.f40105b;
                org.telegram.ui.ActionBar.a2 a2Var = xpVar.f44138r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new tg(xpVar, 2));
                    xpVar.showDialog(xpVar.f44138r);
                    return;
                }
                return;
            case 1:
                xp xpVar2 = this.f40105b;
                xpVar2.getMessagesController().loadFullChat(xpVar2.E, 0, true);
                return;
            default:
                xp xpVar3 = this.f40105b;
                xpVar3.getMessagesController().loadFullChat(xpVar3.E, 0, true);
                return;
        }
    }
}
