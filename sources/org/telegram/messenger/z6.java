package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f19139a;
    public final MediaDataController f19140b;
    public final long f19141c;

    public z6(MediaDataController mediaDataController, long j10, int i10) {
        this.f19139a = i10;
        this.f19140b = mediaDataController;
        this.f19141c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19139a) {
            case 0:
                this.f19140b.lambda$loadPinnedMessages$161(this.f19141c);
                return;
            case 1:
                this.f19140b.lambda$increasePeerRaiting$157(this.f19141c);
                return;
            default:
                this.f19140b.lambda$clearBotKeyboard$195(this.f19141c);
                return;
        }
    }
}
