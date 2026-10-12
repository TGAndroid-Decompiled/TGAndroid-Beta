package org.telegram.messenger;
public final class z6 implements Runnable {
    public final int f19719a;
    public final MediaDataController f19720b;
    public final long f19721c;

    public z6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19719a = i10;
        this.f19720b = mediaDataController;
        this.f19721c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19719a) {
            case 0:
                this.f19720b.lambda$loadPinnedMessages$161(this.f19721c);
                return;
            case 1:
                this.f19720b.lambda$increasePeerRaiting$157(this.f19721c);
                return;
            default:
                this.f19720b.lambda$clearBotKeyboard$195(this.f19721c);
                return;
        }
    }
}
