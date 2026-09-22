package org.telegram.ui;
public final class jp implements Runnable {
    public final int f34992a;
    public final up f34993b;

    public jp(up upVar, int i10) {
        this.f34992a = i10;
        this.f34993b = upVar;
    }

    @Override
    public final void run() {
        switch (this.f34992a) {
            case 0:
                up upVar = this.f34993b;
                org.telegram.ui.ActionBar.b2 b2Var = upVar.f38205r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new og(upVar, 2));
                    upVar.showDialog(upVar.f38205r);
                    return;
                }
                return;
            case 1:
                up upVar2 = this.f34993b;
                upVar2.getMessagesController().loadFullChat(upVar2.E, 0, true);
                return;
            default:
                up upVar3 = this.f34993b;
                upVar3.getMessagesController().loadFullChat(upVar3.E, 0, true);
                return;
        }
    }
}
