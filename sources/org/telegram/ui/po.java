package org.telegram.ui;
public final class po implements Runnable {
    public final int f42579a;
    public final ap f42580b;

    public po(ap apVar, int i10) {
        this.f42579a = i10;
        this.f42580b = apVar;
    }

    @Override
    public final void run() {
        switch (this.f42579a) {
            case 0:
                ap apVar = this.f42580b;
                apVar.f37846c0 = true;
                apVar.d0();
                return;
            case 1:
                ap apVar2 = this.f42580b;
                apVar2.X = apVar2.getMessagesController().getChat(Long.valueOf(apVar2.Z));
                apVar2.a0();
                return;
            case 2:
                this.f42580b.c0(false);
                return;
            case 3:
                ap apVar3 = this.f42580b;
                apVar3.f37846c0 = true;
                if (apVar3.f37843b.length() > 0) {
                    apVar3.Y(apVar3.f37843b.getText().toString());
                }
                apVar3.d0();
                return;
            case 4:
                this.f42580b.a0();
                return;
            default:
                this.f42580b.c0(true);
                return;
        }
    }
}
