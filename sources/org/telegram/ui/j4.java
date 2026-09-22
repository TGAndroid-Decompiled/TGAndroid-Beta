package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34786a;
    public boolean f34787b;
    public final Object f34788c;

    public j4(Object obj, int i10) {
        this.f34786a = i10;
        this.f34788c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34786a) {
            case 0:
                this.f34787b = false;
                ((k4) this.f34788c).getClass();
                return;
            default:
                if (!this.f34787b) {
                    this.f34787b = true;
                    ((bo) this.f34788c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
