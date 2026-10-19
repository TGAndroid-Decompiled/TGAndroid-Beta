package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f20170a;
    public final NotificationsController f20171b;
    public final long f20172c;
    public final int d;

    public yg(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20170a = i11;
        this.f20171b = notificationsController;
        this.f20172c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20170a) {
            case 0:
                this.f20171b.lambda$processDeleteStory$16(this.f20172c, this.d);
                return;
            default:
                this.f20171b.lambda$processReadStories$17(this.f20172c, this.d);
                return;
        }
    }
}
