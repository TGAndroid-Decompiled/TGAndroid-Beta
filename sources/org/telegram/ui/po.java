package org.telegram.ui;
public final class po implements Runnable {
    public final int f42582a;
    public final ap f42583b;

    public po(ap apVar, int i10) {
        this.f42582a = i10;
        this.f42583b = apVar;
    }

    @Override
    public final void run() {
        switch (this.f42582a) {
            case 0:
                ap apVar = this.f42583b;
                apVar.f37849c0 = true;
                apVar.d0();
                return;
            case 1:
                ap apVar2 = this.f42583b;
                apVar2.X = apVar2.getMessagesController().getChat(Long.valueOf(apVar2.Z));
                apVar2.a0();
                return;
            case 2:
                this.f42583b.c0(false);
                return;
            case 3:
                ap apVar3 = this.f42583b;
                apVar3.f37849c0 = true;
                if (apVar3.f37846b.length() > 0) {
                    apVar3.Y(apVar3.f37846b.getText().toString());
                }
                apVar3.d0();
                return;
            case 4:
                this.f42583b.a0();
                return;
            default:
                this.f42583b.c0(true);
                return;
        }
    }
}
