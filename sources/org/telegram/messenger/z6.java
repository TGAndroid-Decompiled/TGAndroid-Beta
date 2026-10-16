package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f18841a;
    public final MediaDataController f18842b;
    public final long f18843c;

    public z6(MediaDataController mediaDataController, long j10, int i10) {
        this.f18841a = i10;
        this.f18842b = mediaDataController;
        this.f18843c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18841a) {
            case 0:
                this.f18842b.lambda$loadPinnedMessages$161(this.f18843c);
                return;
            case 1:
                this.f18842b.lambda$increasePeerRaiting$157(this.f18843c);
                return;
            default:
                this.f18842b.lambda$clearBotKeyboard$195(this.f18843c);
                return;
        }
    }
}
