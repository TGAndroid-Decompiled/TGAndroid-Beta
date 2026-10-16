package org.telegram.ui;
public final class op implements Runnable {
    public final int f38722a;
    public final aq f38723b;

    public op(aq aqVar, int i10) {
        this.f38722a = i10;
        this.f38723b = aqVar;
    }

    @Override
    public final void run() {
        switch (this.f38722a) {
            case 0:
                aq aqVar = this.f38723b;
                org.telegram.ui.ActionBar.a2 a2Var = aqVar.f34053r;
                if (a2Var != null) {
                    a2Var.setOnCancelListener(new ug(aqVar, 2));
                    aqVar.showDialog(aqVar.f34053r);
                    return;
                }
                return;
            case 1:
                aq aqVar2 = this.f38723b;
                aqVar2.getMessagesController().loadFullChat(aqVar2.E, 0, true);
                return;
            default:
                aq aqVar3 = this.f38723b;
                aqVar3.getMessagesController().loadFullChat(aqVar3.E, 0, true);
                return;
        }
    }
}
