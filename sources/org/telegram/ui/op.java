package org.telegram.ui;
public final class op implements Runnable {
    public final int f39020a;
    public final aq f39021b;

    public op(aq aqVar, int i10) {
        this.f39020a = i10;
        this.f39021b = aqVar;
    }

    @Override
    public final void run() {
        switch (this.f39020a) {
            case 0:
                aq aqVar = this.f39021b;
                org.telegram.ui.ActionBar.a2 a2Var = aqVar.f34297r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new ug(aqVar, 2));
                    aqVar.showDialog(aqVar.f34297r);
                    return;
                }
                return;
            case 1:
                aq aqVar2 = this.f39021b;
                aqVar2.getMessagesController().loadFullChat(aqVar2.E, 0, true);
                return;
            default:
                aq aqVar3 = this.f39021b;
                aqVar3.getMessagesController().loadFullChat(aqVar3.E, 0, true);
                return;
        }
    }
}
