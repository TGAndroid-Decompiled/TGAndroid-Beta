package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39289a;
    public boolean f39290b;
    public final Object f39291c;

    public n4(Object obj, int i10) {
        this.f39289a = i10;
        this.f39291c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39289a) {
            case 0:
                this.f39290b = false;
                ((o4) this.f39291c).getClass();
                return;
            default:
                if (!this.f39290b) {
                    this.f39290b = true;
                    ((sn) this.f39291c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
