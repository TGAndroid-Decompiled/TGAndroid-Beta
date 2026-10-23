package org.telegram.ui;
public final class cq implements Runnable {
    public final int f36048a;
    public final hr f36049b;

    public cq(hr hrVar, int i10) {
        this.f36048a = i10;
        this.f36049b = hrVar;
    }

    @Override
    public final void run() {
        switch (this.f36048a) {
            case 0:
                this.f36049b.r0();
                return;
            default:
                hr hrVar = this.f36049b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                return;
        }
    }
}
