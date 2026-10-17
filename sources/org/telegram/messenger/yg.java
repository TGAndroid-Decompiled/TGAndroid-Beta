package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f20168a;
    public final NotificationsController f20169b;
    public final long f20170c;
    public final int d;

    public yg(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20168a = i11;
        this.f20169b = notificationsController;
        this.f20170c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20168a) {
            case 0:
                this.f20169b.lambda$processDeleteStory$16(this.f20170c, this.d);
                return;
            default:
                this.f20169b.lambda$processReadStories$17(this.f20170c, this.d);
                return;
        }
    }
}
