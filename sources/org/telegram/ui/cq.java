package org.telegram.ui;
public final class cq implements Runnable {
    public final int f36044a;
    public final hr f36045b;

    public cq(hr hrVar, int i10) {
        this.f36044a = i10;
        this.f36045b = hrVar;
    }

    @Override
    public final void run() {
        switch (this.f36044a) {
            case 0:
                this.f36045b.r0();
                return;
            default:
                hr hrVar = this.f36045b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                return;
        }
    }
}
