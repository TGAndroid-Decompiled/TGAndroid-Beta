package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39304a;
    public boolean f39305b;
    public final Object f39306c;

    public n4(Object obj, int i10) {
        this.f39304a = i10;
        this.f39306c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39304a) {
            case 0:
                this.f39305b = false;
                ((o4) this.f39306c).getClass();
                return;
            default:
                if (!this.f39305b) {
                    this.f39305b = true;
                    ((sn) this.f39306c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
