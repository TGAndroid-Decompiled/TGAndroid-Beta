package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f48541a;
    public boolean f48542b;
    public final Object f48543c;

    public i4(Object obj, int i7) {
        this.f48541a = i7;
        this.f48543c = obj;
    }

    @Override
    public final void run() {
        switch (this.f48541a) {
            case 0:
                this.f48542b = false;
                ((j4) this.f48543c).getClass();
                return;
            default:
                if (!this.f48542b) {
                    this.f48542b = true;
                    ((bn) this.f48543c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
