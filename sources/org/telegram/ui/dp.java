package org.telegram.ui;
public final class dp implements Runnable {
    public final int f36642a;
    public final qp f36643b;

    public dp(qp qpVar, int i10) {
        this.f36642a = i10;
        this.f36643b = qpVar;
    }

    @Override
    public final void run() {
        switch (this.f36642a) {
            case 0:
                qp qpVar = this.f36643b;
                org.telegram.ui.ActionBar.x1 x1Var = qpVar.f40874r;
                if (x1Var != null) {
                    x1Var.setOnCancelListener(new lg(qpVar, 2));
                    qpVar.showDialog(qpVar.f40874r);
                    return;
                }
                return;
            case 1:
                qp qpVar2 = this.f36643b;
                qpVar2.getMessagesController().T2(0, qpVar2.E, true);
                return;
            default:
                qp qpVar3 = this.f36643b;
                qpVar3.getMessagesController().T2(0, qpVar3.E, true);
                return;
        }
    }
}
