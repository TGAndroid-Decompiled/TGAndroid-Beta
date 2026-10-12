package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f19680a;
    public final NotificationCenter f19681b;

    public yg(NotificationCenter notificationCenter, int i10) {
        this.f19680a = i10;
        this.f19681b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f19680a) {
            case 0:
                NotificationCenter.g(this.f19681b);
                return;
            default:
                NotificationCenter.b(this.f19681b);
                return;
        }
    }
}
