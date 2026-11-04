package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f46760a;
    public boolean f46761b;
    public final Object f46762c;

    public k4(Object obj, int i3) {
        this.f46760a = i3;
        this.f46762c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46760a) {
            case 0:
                this.f46761b = false;
                ((l4) this.f46762c).getClass();
                return;
            default:
                if (!this.f46761b) {
                    this.f46761b = true;
                    ((wm) this.f46762c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
