package org.telegram.ui;
public final class mp implements Runnable {
    public final int f38744a;
    public final xp f38745b;

    public mp(xp xpVar, int i10) {
        this.f38744a = i10;
        this.f38745b = xpVar;
    }

    @Override
    public final void run() {
        switch (this.f38744a) {
            case 0:
                xp xpVar = this.f38745b;
                org.telegram.ui.ActionBar.b2 b2Var = xpVar.f42853r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(xpVar, 2));
                    xpVar.showDialog(xpVar.f42853r);
                    return;
                }
                return;
            case 1:
                xp xpVar2 = this.f38745b;
                xpVar2.getMessagesController().loadFullChat(xpVar2.E, 0, true);
                return;
            default:
                xp xpVar3 = this.f38745b;
                xpVar3.getMessagesController().loadFullChat(xpVar3.E, 0, true);
                return;
        }
    }
}
