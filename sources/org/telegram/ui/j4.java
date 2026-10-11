package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f38830a;
    public boolean f38831b;
    public final Object f38832c;

    public j4(Object obj, int i10) {
        this.f38830a = i10;
        this.f38832c = obj;
    }

    @Override
    public final void run() {
        switch (this.f38830a) {
            case 0:
                this.f38831b = false;
                ((k4) this.f38832c).getClass();
                return;
            default:
                if (!this.f38831b) {
                    this.f38831b = true;
                    ((zn) this.f38832c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
