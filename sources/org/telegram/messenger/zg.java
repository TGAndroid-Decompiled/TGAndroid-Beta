package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20248a;
    public final NotificationsController f20249b;
    public final long f20250c;
    public final int d;

    public zg(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20248a = i11;
        this.f20249b = notificationsController;
        this.f20250c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20248a) {
            case 0:
                this.f20249b.lambda$processDeleteStory$16(this.f20250c, this.d);
                return;
            default:
                this.f20249b.lambda$processReadStories$17(this.f20250c, this.d);
                return;
        }
    }
}
