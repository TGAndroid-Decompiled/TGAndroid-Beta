package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f19681a;
    public final NotificationCenter f19682b;

    public yg(NotificationCenter notificationCenter, int i10) {
        this.f19681a = i10;
        this.f19682b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19681a) {
            case 0:
                NotificationCenter.g(this.f19682b);
                return;
            default:
                NotificationCenter.b(this.f19682b);
                return;
        }
    }
}
