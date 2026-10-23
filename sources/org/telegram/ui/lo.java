package org.telegram.ui;
public final class lo implements Runnable {
    public final int f38962a;
    public final wo f38963b;

    public lo(wo woVar, int i10) {
        this.f38962a = i10;
        this.f38963b = woVar;
    }

    @Override
    public final void run() {
        switch (this.f38962a) {
            case 0:
                wo woVar = this.f38963b;
                woVar.f42915c0 = true;
                woVar.b0();
                return;
            case 1:
                wo woVar2 = this.f38963b;
                woVar2.X = woVar2.getMessagesController().getChat(Long.valueOf(woVar2.Z));
                woVar2.Y();
                return;
            case 2:
                this.f38963b.a0(false);
                return;
            case 3:
                wo woVar3 = this.f38963b;
                woVar3.f42915c0 = true;
                if (woVar3.f42910a.length() > 0) {
                    woVar3.W(woVar3.f42910a.getText().toString());
                }
                woVar3.b0();
                return;
            case 4:
                this.f38963b.Y();
                return;
            default:
                this.f38963b.a0(true);
                return;
        }
    }
}
