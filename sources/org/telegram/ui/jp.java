package org.telegram.ui;
public final class jp implements Runnable {
    public final int f39002a;
    public final up f39003b;

    public jp(up upVar, int i10) {
        this.f39002a = i10;
        this.f39003b = upVar;
    }

    @Override
    public final void run() {
        switch (this.f39002a) {
            case 0:
                up upVar = this.f39003b;
                org.telegram.ui.ActionBar.b2 b2Var = upVar.f42506r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new pg(upVar, 2));
                    upVar.showDialog(upVar.f42506r);
                    return;
                }
                return;
            case 1:
                up upVar2 = this.f39003b;
                upVar2.getMessagesController().loadFullChat(upVar2.E, 0, true);
                return;
            default:
                up upVar3 = this.f39003b;
                upVar3.getMessagesController().loadFullChat(upVar3.E, 0, true);
                return;
        }
    }
}
