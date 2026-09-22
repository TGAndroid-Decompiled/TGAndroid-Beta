package org.telegram.ui;
public final class lp implements Runnable {
    public final int f35525a;
    public final wp f35526b;

    public lp(wp wpVar, int i10) {
        this.f35525a = i10;
        this.f35526b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f35525a) {
            case 0:
                wp wpVar = this.f35526b;
                org.telegram.ui.ActionBar.b2 b2Var = wpVar.f39348r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(wpVar, 2));
                    wpVar.showDialog(wpVar.f39348r);
                    return;
                }
                return;
            case 1:
                wp wpVar2 = this.f35526b;
                wpVar2.getMessagesController().loadFullChat(wpVar2.E, 0, true);
                return;
            default:
                wp wpVar3 = this.f35526b;
                wpVar3.getMessagesController().loadFullChat(wpVar3.E, 0, true);
                return;
        }
    }
}
