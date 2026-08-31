package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f20806a;
    public final NotificationCenter f20807b;

    public zg(NotificationCenter notificationCenter, int i10) {
        this.f20806a = i10;
        this.f20807b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f20806a) {
            case 0:
                NotificationCenter.g(this.f20807b);
                return;
            default:
                NotificationCenter.b(this.f20807b);
                return;
        }
    }
}
