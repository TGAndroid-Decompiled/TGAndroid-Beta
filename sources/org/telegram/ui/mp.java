package org.telegram.ui;
public final class mp implements Runnable {
    public final int f38772a;
    public final xp f38773b;

    public mp(xp xpVar, int i10) {
        this.f38772a = i10;
        this.f38773b = xpVar;
    }

    @Override
    public final void run() {
        switch (this.f38772a) {
            case 0:
                xp xpVar = this.f38773b;
                org.telegram.ui.ActionBar.b2 b2Var = xpVar.f42881r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(xpVar, 2));
                    xpVar.showDialog(xpVar.f42881r);
                    return;
                }
                return;
            case 1:
                xp xpVar2 = this.f38773b;
                xpVar2.getMessagesController().loadFullChat(xpVar2.E, 0, true);
                return;
            default:
                xp xpVar3 = this.f38773b;
                xpVar3.getMessagesController().loadFullChat(xpVar3.E, 0, true);
                return;
        }
    }
}
