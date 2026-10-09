package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f39073a;
    public boolean f39074b;
    public final Object f39075c;

    public k4(Object obj, int i10) {
        this.f39073a = i10;
        this.f39075c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39073a) {
            case 0:
                this.f39074b = false;
                ((l4) this.f39075c).getClass();
                return;
            default:
                if (!this.f39074b) {
                    this.f39074b = true;
                    ((zn) this.f39075c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
