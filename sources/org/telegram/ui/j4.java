package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34757a;
    public boolean f34758b;
    public final Object f34759c;

    public j4(Object obj, int i10) {
        this.f34757a = i10;
        this.f34759c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34757a) {
            case 0:
                this.f34758b = false;
                ((k4) this.f34759c).getClass();
                return;
            default:
                if (!this.f34758b) {
                    this.f34758b = true;
                    ((zn) this.f34759c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
