package org.telegram.ui;
public final class ko implements Runnable {
    public final int f39877a;
    public final vo f39878b;

    public ko(vo voVar, int i9) {
        this.f39877a = i9;
        this.f39878b = voVar;
    }

    @Override
    public final void run() {
        switch (this.f39877a) {
            case 0:
                vo voVar = this.f39878b;
                voVar.Y = true;
                voVar.a0();
                return;
            case 1:
                vo voVar2 = this.f39878b;
                voVar2.T = voVar2.getMessagesController().getChat(Long.valueOf(voVar2.V));
                voVar2.X();
                return;
            case 2:
                this.f39878b.Z(false);
                return;
            case 3:
                vo voVar3 = this.f39878b;
                voVar3.Y = true;
                if (voVar3.f43524a.length() > 0) {
                    voVar3.V(voVar3.f43524a.getText().toString());
                }
                voVar3.a0();
                return;
            case 4:
                this.f39878b.X();
                return;
            default:
                this.f39878b.Z(true);
                return;
        }
    }
}
