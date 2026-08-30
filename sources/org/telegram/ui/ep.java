package org.telegram.ui;
public final class ep implements Runnable {
    public final int f34059a;
    public final qp f34060b;

    public ep(qp qpVar, int i10) {
        this.f34059a = i10;
        this.f34060b = qpVar;
    }

    @Override
    public final void run() {
        switch (this.f34059a) {
            case 0:
                qp qpVar = this.f34060b;
                org.telegram.ui.ActionBar.d2 d2Var = qpVar.f37808r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new ig(qpVar, 2));
                    qpVar.showDialog(qpVar.f37808r);
                    return;
                }
                return;
            case 1:
                qp qpVar2 = this.f34060b;
                qpVar2.getMessagesController().loadFullChat(qpVar2.B, 0, true);
                return;
            default:
                qp qpVar3 = this.f34060b;
                qpVar3.getMessagesController().loadFullChat(qpVar3.B, 0, true);
                return;
        }
    }
}
