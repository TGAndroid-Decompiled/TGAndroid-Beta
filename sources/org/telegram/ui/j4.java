package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f38268a;
    public boolean f38269b;
    public final Object f38270c;

    public j4(Object obj, int i10) {
        this.f38268a = i10;
        this.f38270c = obj;
    }

    @Override
    public final void run() {
        switch (this.f38268a) {
            case 0:
                this.f38269b = false;
                ((k4) this.f38270c).getClass();
                return;
            default:
                if (!this.f38269b) {
                    this.f38269b = true;
                    ((un) this.f38270c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
