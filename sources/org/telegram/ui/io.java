package org.telegram.ui;
public final class io implements Runnable {
    public final int f48105a;
    public final to f48106b;

    public io(to toVar, int i7) {
        this.f48105a = i7;
        this.f48106b = toVar;
    }

    @Override
    public final void run() {
        switch (this.f48105a) {
            case 0:
                to toVar = this.f48106b;
                org.telegram.ui.ActionBar.t1 t1Var = toVar.f51623r;
                if (t1Var != null) {
                    t1Var.setOnCancelListener(new tf(toVar, 2));
                    toVar.showDialog(toVar.f51623r);
                    return;
                }
                return;
            case 1:
                to toVar2 = this.f48106b;
                toVar2.getMessagesController().V2(0, toVar2.F, true);
                return;
            default:
                to toVar3 = this.f48106b;
                toVar3.getMessagesController().V2(0, toVar3.F, true);
                return;
        }
    }
}
