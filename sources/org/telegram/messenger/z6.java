package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f19718a;
    public final MediaDataController f19719b;
    public final long f19720c;

    public z6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19718a = i10;
        this.f19719b = mediaDataController;
        this.f19720c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19718a) {
            case 0:
                this.f19719b.lambda$loadPinnedMessages$161(this.f19720c);
                return;
            case 1:
                this.f19719b.lambda$increasePeerRaiting$157(this.f19720c);
                return;
            default:
                this.f19719b.lambda$clearBotKeyboard$195(this.f19720c);
                return;
        }
    }
}
