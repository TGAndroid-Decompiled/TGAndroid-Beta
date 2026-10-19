package org.telegram.ui;
public final class lo implements Runnable {
    public final int f38986a;
    public final wo f38987b;

    public lo(wo woVar, int i10) {
        this.f38986a = i10;
        this.f38987b = woVar;
    }

    @Override
    public final void run() {
        switch (this.f38986a) {
            case 0:
                wo woVar = this.f38987b;
                woVar.f42906c0 = true;
                woVar.b0();
                return;
            case 1:
                wo woVar2 = this.f38987b;
                woVar2.X = woVar2.getMessagesController().getChat(Long.valueOf(woVar2.Z));
                woVar2.Y();
                return;
            case 2:
                this.f38987b.a0(false);
                return;
            case 3:
                wo woVar3 = this.f38987b;
                woVar3.f42906c0 = true;
                if (woVar3.f42901a.length() > 0) {
                    woVar3.W(woVar3.f42901a.getText().toString());
                }
                woVar3.b0();
                return;
            case 4:
                this.f38987b.Y();
                return;
            default:
                this.f38987b.a0(true);
                return;
        }
    }
}
