package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f34925a;
    public boolean f34926b;
    public final Object f34927c;

    public k4(Object obj, int i10) {
        this.f34925a = i10;
        this.f34927c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34925a) {
            case 0:
                this.f34926b = false;
                ((l4) this.f34927c).getClass();
                return;
            default:
                if (!this.f34926b) {
                    this.f34926b = true;
                    ((wn) this.f34927c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
