package org.telegram.ui;
public final class dp implements Runnable {
    public final int f36808a;
    public final qp f36809b;

    public dp(qp qpVar, int i10) {
        this.f36808a = i10;
        this.f36809b = qpVar;
    }

    @Override
    public final void run() {
        switch (this.f36808a) {
            case 0:
                qp qpVar = this.f36809b;
                org.telegram.ui.ActionBar.x1 x1Var = qpVar.f41025r;
                if (x1Var != null) {
                    x1Var.setOnCancelListener(new kg(qpVar, 2));
                    qpVar.showDialog(qpVar.f41025r);
                    return;
                }
                return;
            case 1:
                qp qpVar2 = this.f36809b;
                qpVar2.getMessagesController().T2(0, qpVar2.E, true);
                return;
            default:
                qp qpVar3 = this.f36809b;
                qpVar3.getMessagesController().T2(0, qpVar3.E, true);
                return;
        }
    }
}
