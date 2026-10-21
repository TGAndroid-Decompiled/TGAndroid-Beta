package org.telegram.ui;
public final class lo implements Runnable {
    public final int f38958a;
    public final wo f38959b;

    public lo(wo woVar, int i10) {
        this.f38958a = i10;
        this.f38959b = woVar;
    }

    @Override
    public final void run() {
        switch (this.f38958a) {
            case 0:
                wo woVar = this.f38959b;
                woVar.f42911c0 = true;
                woVar.b0();
                return;
            case 1:
                wo woVar2 = this.f38959b;
                woVar2.X = woVar2.getMessagesController().getChat(Long.valueOf(woVar2.Z));
                woVar2.Y();
                return;
            case 2:
                this.f38959b.a0(false);
                return;
            case 3:
                wo woVar3 = this.f38959b;
                woVar3.f42911c0 = true;
                if (woVar3.f42906a.length() > 0) {
                    woVar3.W(woVar3.f42906a.getText().toString());
                }
                woVar3.b0();
                return;
            case 4:
                this.f38959b.Y();
                return;
            default:
                this.f38959b.a0(true);
                return;
        }
    }
}
