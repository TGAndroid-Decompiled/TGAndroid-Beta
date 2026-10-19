package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f20202a;
    public final MediaDataController f20203b;
    public final long f20204c;

    public z6(MediaDataController mediaDataController, long j10, int i10) {
        this.f20202a = i10;
        this.f20203b = mediaDataController;
        this.f20204c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20202a) {
            case 0:
                this.f20203b.lambda$loadPinnedMessages$161(this.f20204c);
                return;
            case 1:
                this.f20203b.lambda$increasePeerRaiting$157(this.f20204c);
                return;
            default:
                this.f20203b.lambda$clearBotKeyboard$195(this.f20204c);
                return;
        }
    }
}
