package org.telegram.ui;
public final class jp implements Runnable {
    public final int f39093a;
    public final up f39094b;

    public jp(up upVar, int i10) {
        this.f39093a = i10;
        this.f39094b = upVar;
    }

    @Override
    public final void run() {
        switch (this.f39093a) {
            case 0:
                up upVar = this.f39094b;
                org.telegram.ui.ActionBar.a2 a2Var = upVar.f42740r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new pg(upVar, 2));
                    upVar.showDialog(upVar.f42740r);
                    return;
                }
                return;
            case 1:
                up upVar2 = this.f39094b;
                upVar2.getMessagesController().loadFullChat(upVar2.E, 0, true);
                return;
            default:
                up upVar3 = this.f39094b;
                upVar3.getMessagesController().loadFullChat(upVar3.E, 0, true);
                return;
        }
    }
}
