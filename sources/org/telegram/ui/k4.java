package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f39353a;
    public boolean f39354b;
    public final Object f39355c;

    public k4(Object obj, int i10) {
        this.f39353a = i10;
        this.f39355c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39353a) {
            case 0:
                this.f39354b = false;
                ((l4) this.f39355c).getClass();
                return;
            default:
                if (!this.f39354b) {
                    this.f39354b = true;
                    ((eo) this.f39355c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
