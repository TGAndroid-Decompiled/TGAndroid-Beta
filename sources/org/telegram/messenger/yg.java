package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f19102a;
    public final NotificationCenter f19103b;

    public yg(NotificationCenter notificationCenter, int i10) {
        this.f19102a = i10;
        this.f19103b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19102a) {
            case 0:
                NotificationCenter.g(this.f19103b);
                return;
            default:
                NotificationCenter.b(this.f19103b);
                return;
        }
    }
}
