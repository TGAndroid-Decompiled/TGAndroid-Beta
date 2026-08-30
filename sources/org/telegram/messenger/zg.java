package org.telegram.messenger;
public final class zg implements Runnable {
    public final int f19150a;
    public final NotificationCenter f19151b;

    public zg(NotificationCenter notificationCenter, int i10) {
        this.f19150a = i10;
        this.f19151b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19150a) {
            case 0:
                NotificationCenter.g(this.f19151b);
                return;
            default:
                NotificationCenter.b(this.f19151b);
                return;
        }
    }
}
