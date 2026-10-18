package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20245a;
    public final NotificationsController f20246b;
    public final long f20247c;
    public final int d;

    public zg(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20245a = i11;
        this.f20246b = notificationsController;
        this.f20247c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20245a) {
            case 0:
                this.f20246b.lambda$processDeleteStory$16(this.f20247c, this.d);
                return;
            default:
                this.f20246b.lambda$processReadStories$17(this.f20247c, this.d);
                return;
        }
    }
}
