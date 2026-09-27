package org.telegram.ui;
public final class hp implements Runnable {
    public final int f34266a;
    public final sp f34267b;

    public hp(sp spVar, int i10) {
        this.f34266a = i10;
        this.f34267b = spVar;
    }

    @Override
    public final void run() {
        switch (this.f34266a) {
            case 0:
                sp spVar = this.f34267b;
                org.telegram.ui.ActionBar.c2 c2Var = spVar.f37545r;
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new og(spVar, 2));
                    spVar.showDialog(spVar.f37545r);
                    return;
                }
                return;
            case 1:
                sp spVar2 = this.f34267b;
                spVar2.getMessagesController().loadFullChat(spVar2.E, 0, true);
                return;
            default:
                sp spVar3 = this.f34267b;
                spVar3.getMessagesController().loadFullChat(spVar3.E, 0, true);
                return;
        }
    }
}
