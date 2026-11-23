package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f48569a;
    public boolean f48570b;
    public final Object f48571c;

    public i4(Object obj, int i7) {
        this.f48569a = i7;
        this.f48571c = obj;
    }

    @Override
    public final void run() {
        switch (this.f48569a) {
            case 0:
                this.f48570b = false;
                ((j4) this.f48571c).getClass();
                return;
            default:
                if (!this.f48570b) {
                    this.f48570b = true;
                    ((bn) this.f48571c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
