package org.telegram.ui;
public final class bp implements Runnable {
    public final int f38132a;
    public final np f38133b;

    public bp(np npVar, int i10) {
        this.f38132a = i10;
        this.f38133b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f38132a) {
            case 0:
                np npVar = this.f38133b;
                org.telegram.ui.ActionBar.e2 e2Var = npVar.f41966r;
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new fg(npVar, 2));
                    npVar.showDialog(npVar.f41966r);
                    return;
                }
                return;
            case 1:
                np npVar2 = this.f38133b;
                npVar2.getMessagesController().loadFullChat(npVar2.E, 0, true);
                return;
            default:
                np npVar3 = this.f38133b;
                npVar3.getMessagesController().loadFullChat(npVar3.E, 0, true);
                return;
        }
    }
}
