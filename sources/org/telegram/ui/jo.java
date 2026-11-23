package org.telegram.ui;
public final class jo implements Runnable {
    public final int f49175a;
    public final uo f49176b;

    public jo(uo uoVar, int i7) {
        this.f49175a = i7;
        this.f49176b = uoVar;
    }

    @Override
    public final void run() {
        switch (this.f49175a) {
            case 0:
                uo uoVar = this.f49176b;
                org.telegram.ui.ActionBar.t1 t1Var = uoVar.f52702r;
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new wf(uoVar, 2));
                    uoVar.showDialog(uoVar.f52702r);
                    return;
                }
                return;
            case 1:
                uo uoVar2 = this.f49176b;
                uoVar2.getMessagesController().b3(0, uoVar2.F, true);
                return;
            default:
                uo uoVar3 = this.f49176b;
                uoVar3.getMessagesController().b3(0, uoVar3.F, true);
                return;
        }
    }
}
