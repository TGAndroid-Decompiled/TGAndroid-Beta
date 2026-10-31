package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f38420a;
    public boolean f38421b;
    public final Object f38422c;

    public j4(Object obj, int i10) {
        this.f38420a = i10;
        this.f38422c = obj;
    }

    @Override
    public final void run() {
        switch (this.f38420a) {
            case 0:
                this.f38421b = false;
                ((k4) this.f38422c).getClass();
                return;
            default:
                if (!this.f38421b) {
                    this.f38421b = true;
                    ((un) this.f38422c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
