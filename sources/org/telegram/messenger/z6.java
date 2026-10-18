package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f20199a;
    public final MediaDataController f20200b;
    public final long f20201c;

    public z6(MediaDataController mediaDataController, long j10, int i10) {
        this.f20199a = i10;
        this.f20200b = mediaDataController;
        this.f20201c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20199a) {
            case 0:
                this.f20200b.lambda$loadPinnedMessages$161(this.f20201c);
                return;
            case 1:
                this.f20200b.lambda$increasePeerRaiting$157(this.f20201c);
                return;
            default:
                this.f20200b.lambda$clearBotKeyboard$195(this.f20201c);
                return;
        }
    }
}
