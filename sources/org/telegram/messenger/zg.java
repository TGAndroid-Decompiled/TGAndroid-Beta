package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20808a;
    public final NotificationCenter f20809b;

    public zg(NotificationCenter notificationCenter, int i10) {
        this.f20808a = i10;
        this.f20809b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f20808a) {
            case 0:
                NotificationCenter.g(this.f20809b);
                return;
            default:
                NotificationCenter.b(this.f20809b);
                return;
        }
    }
}
