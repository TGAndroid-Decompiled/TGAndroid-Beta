package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39330a;
    public boolean f39331b;
    public final Object f39332c;

    public n4(Object obj, int i10) {
        this.f39330a = i10;
        this.f39332c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39330a) {
            case 0:
                this.f39331b = false;
                ((o4) this.f39332c).getClass();
                return;
            default:
                if (!this.f39331b) {
                    this.f39331b = true;
                    ((sn) this.f39332c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
