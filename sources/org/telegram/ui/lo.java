package org.telegram.ui;
public final class lo implements Runnable {
    public final int f38957a;
    public final wo f38958b;

    public lo(wo woVar, int i10) {
        this.f38957a = i10;
        this.f38958b = woVar;
    }

    @Override
    public final void run() {
        switch (this.f38957a) {
            case 0:
                wo woVar = this.f38958b;
                woVar.f42911c0 = true;
                woVar.b0();
                return;
            case 1:
                wo woVar2 = this.f38958b;
                woVar2.X = woVar2.getMessagesController().getChat(Long.valueOf(woVar2.Z));
                woVar2.Y();
                return;
            case 2:
                this.f38958b.a0(false);
                return;
            case 3:
                wo woVar3 = this.f38958b;
                woVar3.f42911c0 = true;
                if (woVar3.f42906a.length() > 0) {
                    woVar3.W(woVar3.f42906a.getText().toString());
                }
                woVar3.b0();
                return;
            case 4:
                this.f38958b.Y();
                return;
            default:
                this.f38958b.a0(true);
                return;
        }
    }
}
