package org.telegram.ui;
public final class hp implements Runnable {
    public final int f33898a;
    public final sp f33899b;

    public hp(sp spVar, int i10) {
        this.f33898a = i10;
        this.f33899b = spVar;
    }

    @Override
    public final void run() {
        switch (this.f33898a) {
            case 0:
                sp spVar = this.f33899b;
                org.telegram.ui.ActionBar.b2 b2Var = spVar.f37385r;
                if (b2Var != null) {
                    b2Var.setOnCancelListener(new ng(spVar, 2));
                    spVar.showDialog(spVar.f37385r);
                    return;
                }
                return;
            case 1:
                sp spVar2 = this.f33899b;
                spVar2.getMessagesController().loadFullChat(spVar2.E, 0, true);
                return;
            default:
                sp spVar3 = this.f33899b;
                spVar3.getMessagesController().loadFullChat(spVar3.E, 0, true);
                return;
        }
    }
}
