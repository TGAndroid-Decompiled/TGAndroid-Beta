package org.telegram.ui;
public final class l4 implements Runnable {
    public final int f34530a;
    public boolean f34531b;
    public final Object f34532c;

    public l4(Object obj, int i10) {
        this.f34530a = i10;
        this.f34532c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34530a) {
            case 0:
                this.f34531b = false;
                ((m4) this.f34532c).getClass();
                return;
            default:
                if (!this.f34531b) {
                    this.f34531b = true;
                    ((eo) this.f34532c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
