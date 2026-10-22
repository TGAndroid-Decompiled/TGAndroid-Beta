package org.telegram.ui;
public final class cq implements Runnable {
    public final int f36047a;
    public final hr f36048b;

    public cq(hr hrVar, int i10) {
        this.f36047a = i10;
        this.f36048b = hrVar;
    }

    @Override
    public final void run() {
        switch (this.f36047a) {
            case 0:
                this.f36048b.r0();
                return;
            default:
                hr hrVar = this.f36048b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                return;
        }
    }
}
