package org.telegram.ui;
public final class jp implements Runnable {
    public final int f39046a;
    public final up f39047b;

    public jp(up upVar, int i10) {
        this.f39046a = i10;
        this.f39047b = upVar;
    }

    @Override
    public final void run() {
        switch (this.f39046a) {
            case 0:
                up upVar = this.f39047b;
                org.telegram.ui.ActionBar.b2 b2Var = upVar.f42550r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(upVar, 2));
                    upVar.showDialog(upVar.f42550r);
                    return;
                }
                return;
            case 1:
                up upVar2 = this.f39047b;
                upVar2.getMessagesController().loadFullChat(upVar2.E, 0, true);
                return;
            default:
                up upVar3 = this.f39047b;
                upVar3.getMessagesController().loadFullChat(upVar3.E, 0, true);
                return;
        }
    }
}
