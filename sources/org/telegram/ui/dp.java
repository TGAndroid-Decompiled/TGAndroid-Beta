package org.telegram.ui;
public final class dp implements Runnable {
    public final int f38649a;
    public final pp f38650b;

    public dp(pp ppVar, int i10) {
        this.f38649a = i10;
        this.f38650b = ppVar;
    }

    @Override
    public final void run() {
        switch (this.f38649a) {
            case 0:
                pp ppVar = this.f38650b;
                org.telegram.ui.ActionBar.e2 e2Var = ppVar.f42469r;
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new kg(ppVar, 2));
                    ppVar.showDialog(ppVar.f42469r);
                    return;
                }
                return;
            case 1:
                pp ppVar2 = this.f38650b;
                ppVar2.getMessagesController().loadFullChat(ppVar2.E, 0, true);
                return;
            default:
                pp ppVar3 = this.f38650b;
                ppVar3.getMessagesController().loadFullChat(ppVar3.E, 0, true);
                return;
        }
    }
}
