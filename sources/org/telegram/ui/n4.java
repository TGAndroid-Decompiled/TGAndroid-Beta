package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39403a;
    public boolean f39404b;
    public final Object f39405c;

    public n4(Object obj, int i10) {
        this.f39403a = i10;
        this.f39405c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39403a) {
            case 0:
                this.f39404b = false;
                ((o4) this.f39405c).getClass();
                return;
            default:
                if (!this.f39404b) {
                    this.f39404b = true;
                    ((qn) this.f39405c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
