package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f34923a;
    public boolean f34924b;
    public final Object f34925c;

    public k4(Object obj, int i10) {
        this.f34923a = i10;
        this.f34925c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34923a) {
            case 0:
                this.f34924b = false;
                ((l4) this.f34925c).getClass();
                return;
            default:
                if (!this.f34924b) {
                    this.f34924b = true;
                    ((wn) this.f34925c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
