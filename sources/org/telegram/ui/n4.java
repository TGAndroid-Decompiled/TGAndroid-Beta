package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39171a;
    public boolean f39172b;
    public final Object f39173c;

    public n4(Object obj, int i10) {
        this.f39171a = i10;
        this.f39173c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39171a) {
            case 0:
                this.f39172b = false;
                ((o4) this.f39173c).getClass();
                return;
            default:
                if (!this.f39172b) {
                    this.f39172b = true;
                    ((xn) this.f39173c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
