package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34782a;
    public boolean f34783b;
    public final Object f34784c;

    public j4(Object obj, int i10) {
        this.f34782a = i10;
        this.f34784c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34782a) {
            case 0:
                this.f34783b = false;
                ((k4) this.f34784c).getClass();
                return;
            default:
                if (!this.f34783b) {
                    this.f34783b = true;
                    ((zn) this.f34784c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
