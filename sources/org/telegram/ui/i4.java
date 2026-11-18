package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f48571a;
    public boolean f48572b;
    public final Object f48573c;

    public i4(Object obj, int i7) {
        this.f48571a = i7;
        this.f48573c = obj;
    }

    @Override
    public final void run() {
        switch (this.f48571a) {
            case 0:
                this.f48572b = false;
                ((j4) this.f48573c).getClass();
                return;
            default:
                if (!this.f48572b) {
                    this.f48572b = true;
                    ((bn) this.f48573c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
