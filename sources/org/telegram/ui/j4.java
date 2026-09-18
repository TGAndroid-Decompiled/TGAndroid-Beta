package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34695a;
    public boolean f34696b;
    public final Object f34697c;

    public j4(Object obj, int i10) {
        this.f34695a = i10;
        this.f34697c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34695a) {
            case 0:
                this.f34696b = false;
                ((k4) this.f34697c).getClass();
                return;
            default:
                if (!this.f34696b) {
                    this.f34696b = true;
                    ((zn) this.f34697c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
