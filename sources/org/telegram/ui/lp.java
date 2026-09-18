package org.telegram.ui;
public final class lp implements Runnable {
    public final int f35598a;
    public final wp f35599b;

    public lp(wp wpVar, int i10) {
        this.f35598a = i10;
        this.f35599b = wpVar;
    }

    @Override
    public final void run() {
        switch (this.f35598a) {
            case 0:
                wp wpVar = this.f35599b;
                org.telegram.ui.ActionBar.c2 c2Var = wpVar.f39127r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new rg(wpVar, 2));
                    wpVar.showDialog(wpVar.f39127r);
                    return;
                }
                return;
            case 1:
                wp wpVar2 = this.f35599b;
                wpVar2.getMessagesController().loadFullChat(wpVar2.E, 0, true);
                return;
            default:
                wp wpVar3 = this.f35599b;
                wpVar3.getMessagesController().loadFullChat(wpVar3.E, 0, true);
                return;
        }
    }
}
