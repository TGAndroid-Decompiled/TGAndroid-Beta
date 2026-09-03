package org.telegram.ui;
public final class gp implements Runnable {
    public final int f34490a;
    public final sp f34491b;

    public gp(sp spVar, int i10) {
        this.f34490a = i10;
        this.f34491b = spVar;
    }

    @Override
    public final void run() {
        switch (this.f34490a) {
            case 0:
                sp spVar = this.f34491b;
                org.telegram.ui.ActionBar.d2 d2Var = spVar.f38286r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new kg(spVar, 2));
                    spVar.showDialog(spVar.f38286r);
                    return;
                }
                return;
            case 1:
                sp spVar2 = this.f34491b;
                spVar2.getMessagesController().loadFullChat(spVar2.B, 0, true);
                return;
            default:
                sp spVar3 = this.f34491b;
                spVar3.getMessagesController().loadFullChat(spVar3.B, 0, true);
                return;
        }
    }
}
