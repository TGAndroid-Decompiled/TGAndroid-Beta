package org.telegram.ui;
public final class cq implements Runnable {
    public final int f36037a;
    public final hr f36038b;

    public cq(hr hrVar, int i10) {
        this.f36037a = i10;
        this.f36038b = hrVar;
    }

    @Override
    public final void run() {
        switch (this.f36037a) {
            case 0:
                this.f36038b.r0();
                return;
            default:
                hr hrVar = this.f36038b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                return;
        }
    }
}
