package org.telegram.ui;
public final class cq implements Runnable {
    public final int f36065a;
    public final hr f36066b;

    public cq(hr hrVar, int i10) {
        this.f36065a = i10;
        this.f36066b = hrVar;
    }

    @Override
    public final void run() {
        switch (this.f36065a) {
            case 0:
                this.f36066b.r0();
                return;
            default:
                hr hrVar = this.f36066b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                return;
        }
    }
}
