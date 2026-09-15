package org.telegram.ui;
public final class lp implements Runnable {
    public final int f35542a;
    public final wp f35543b;

    public lp(wp wpVar, int i10) {
        this.f35542a = i10;
        this.f35543b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f35542a) {
            case 0:
                wp wpVar = this.f35543b;
                org.telegram.ui.ActionBar.b2 b2Var = wpVar.f39352r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(wpVar, 2));
                    wpVar.showDialog(wpVar.f39352r);
                    return;
                }
                return;
            case 1:
                wp wpVar2 = this.f35543b;
                wpVar2.getMessagesController().loadFullChat(wpVar2.E, 0, true);
                return;
            default:
                wp wpVar3 = this.f35543b;
                wpVar3.getMessagesController().loadFullChat(wpVar3.E, 0, true);
                return;
        }
    }
}
