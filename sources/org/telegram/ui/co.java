package org.telegram.ui;
public final class co implements Runnable {
    public final int f44410a;
    public final qo f44411b;

    public co(qo qoVar, int i3) {
        this.f44410a = i3;
        this.f44411b = qoVar;
    }

    @Override
    public final void run() {
        switch (this.f44410a) {
            case 0:
                qo qoVar = this.f44411b;
                org.telegram.ui.ActionBar.s1 s1Var = qoVar.f48926r;
                if (s1Var != null) {
                    s1Var.setOnCancelListener(new rf(qoVar, 2));
                    qoVar.showDialog(qoVar.f48926r);
                    return;
                }
                return;
            case 1:
                qo qoVar2 = this.f44411b;
                qoVar2.getMessagesController().V2(0, qoVar2.F, true);
                return;
            default:
                qo qoVar3 = this.f44411b;
                qoVar3.getMessagesController().V2(0, qoVar3.F, true);
                return;
        }
    }
}
