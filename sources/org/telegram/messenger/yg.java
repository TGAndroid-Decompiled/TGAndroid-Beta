package org.telegram.messenger;
public final class yg implements Runnable {
    public final int f18803a;
    public final NotificationCenter f18804b;

    public yg(NotificationCenter notificationCenter, int i10) {
        this.f18803a = i10;
        this.f18804b = notificationCenter;
    }

    @Override
    public final void run() {
        switch (this.f18803a) {
            case 0:
                NotificationCenter.g(this.f18804b);
                return;
            default:
                NotificationCenter.b(this.f18804b);
                return;
        }
    }
}
