package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f19125a;
    public final NotificationCenter f19126b;

    public zg(NotificationCenter notificationCenter, int i10) {
        this.f19125a = i10;
        this.f19126b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19125a) {
            case 0:
                NotificationCenter.g(this.f19126b);
                return;
            default:
                NotificationCenter.b(this.f19126b);
                return;
        }
    }
}
