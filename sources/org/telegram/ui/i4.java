package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f48709a;
    public boolean f48710b;
    public final Object f48711c;

    public i4(Object obj, int i7) {
        this.f48709a = i7;
        this.f48711c = obj;
    }

    @Override
    public final void run() {
        switch (this.f48709a) {
            case 0:
                this.f48710b = false;
                ((j4) this.f48711c).getClass();
                return;
            default:
                if (!this.f48710b) {
                    this.f48710b = true;
                    ((bn) this.f48711c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
