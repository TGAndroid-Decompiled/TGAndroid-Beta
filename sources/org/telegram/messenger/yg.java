package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f20176a;
    public final NotificationsController f20177b;
    public final long f20178c;
    public final int d;

    public yg(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20176a = i11;
        this.f20177b = notificationsController;
        this.f20178c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20176a) {
            case 0:
                this.f20177b.lambda$processDeleteStory$16(this.f20178c, this.d);
                return;
            default:
                this.f20177b.lambda$processReadStories$17(this.f20178c, this.d);
                return;
        }
    }
}
