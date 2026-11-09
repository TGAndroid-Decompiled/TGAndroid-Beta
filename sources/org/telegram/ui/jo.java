package org.telegram.ui;
public final class jo implements Runnable {
    public final int f47057a;
    public final uo f47058b;

    public jo(uo uoVar, int i7) {
        this.f47057a = i7;
        this.f47058b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f47057a) {
            case 0:
                uo uoVar = this.f47058b;
                org.telegram.ui.ActionBar.u1 u1Var = uoVar.f50437r;
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new vf(uoVar, 2));
                    uoVar.showDialog(uoVar.f50437r);
                    return;
                }
                return;
            case 1:
                uo uoVar2 = this.f47058b;
                uoVar2.getMessagesController().V2(0, uoVar2.E, true);
                return;
            default:
                uo uoVar3 = this.f47058b;
                uoVar3.getMessagesController().V2(0, uoVar3.E, true);
                return;
        }
    }
}
