package org.telegram.ui;
public final class p4 implements Runnable {
    public final int f36936a;
    public boolean f36937b;
    public final Object f36938c;

    public p4(Object obj, int i10) {
        this.f36936a = i10;
        this.f36938c = obj;
    }

    @Override
    public final void run() {
        switch (this.f36936a) {
            case 0:
                this.f36937b = false;
                ((q4) this.f36938c).getClass();
                return;
            default:
                if (!this.f36937b) {
                    this.f36937b = true;
                    ((zn) this.f36938c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
