package org.telegram.ui;
public final class cq implements Runnable {
    public final int f36043a;
    public final hr f36044b;

    public cq(hr hrVar, int i10) {
        this.f36043a = i10;
        this.f36044b = hrVar;
    }

    @Override
    public final void run() {
        switch (this.f36043a) {
            case 0:
                this.f36044b.r0();
                return;
            default:
                hr hrVar = this.f36044b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                return;
        }
    }
}
