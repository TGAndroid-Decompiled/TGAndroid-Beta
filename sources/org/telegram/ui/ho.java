package org.telegram.ui;
public final class ho implements Runnable {
    public final int f46469a;
    public final so f46470b;

    public ho(so soVar, int i7) {
        this.f46469a = i7;
        this.f46470b = soVar;
    }

    @Override
    public final void run() {
        switch (this.f46469a) {
            case 0:
                so soVar = this.f46470b;
                org.telegram.ui.ActionBar.u1 u1Var = soVar.f49793r;
                if (u1Var != null) {
                    u1Var.setOnCancelListener(new vf(soVar, 2));
                    soVar.showDialog(soVar.f49793r);
                    return;
                }
                return;
            case 1:
                so soVar2 = this.f46470b;
                soVar2.getMessagesController().V2(0, soVar2.E, true);
                return;
            default:
                so soVar3 = this.f46470b;
                soVar3.getMessagesController().V2(0, soVar3.E, true);
                return;
        }
    }
}
