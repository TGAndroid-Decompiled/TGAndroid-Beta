package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f34924a;
    public boolean f34925b;
    public final Object f34926c;

    public k4(Object obj, int i10) {
        this.f34924a = i10;
        this.f34926c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34924a) {
            case 0:
                this.f34925b = false;
                ((l4) this.f34926c).getClass();
                return;
            default:
                if (!this.f34925b) {
                    this.f34925b = true;
                    ((wn) this.f34926c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
