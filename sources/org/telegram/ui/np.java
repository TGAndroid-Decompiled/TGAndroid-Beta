package org.telegram.ui;
public final class np implements Runnable {
    public final int f35318a;
    public final yp f35319b;

    public np(yp ypVar, int i10) {
        this.f35318a = i10;
        this.f35319b = ypVar;
    }

    @Override
    public final void run() {
        switch (this.f35318a) {
            case 0:
                yp ypVar = this.f35319b;
                org.telegram.ui.ActionBar.d2 d2Var = ypVar.f39081r;
                if (d2Var != null) {
                    d2Var.setOnCancelListener(new qg(ypVar, 2));
                    ypVar.showDialog(ypVar.f39081r);
                    return;
                }
                return;
            case 1:
                yp ypVar2 = this.f35319b;
                ypVar2.getMessagesController().loadFullChat(ypVar2.E, 0, true);
                return;
            default:
                yp ypVar3 = this.f35319b;
                ypVar3.getMessagesController().loadFullChat(ypVar3.E, 0, true);
                return;
        }
    }
}
