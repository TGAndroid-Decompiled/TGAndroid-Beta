package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f48565a;
    public boolean f48566b;
    public final Object f48567c;

    public i4(Object obj, int i7) {
        this.f48565a = i7;
        this.f48567c = obj;
    }

    @Override
    public final void run() {
        switch (this.f48565a) {
            case 0:
                this.f48566b = false;
                ((j4) this.f48567c).getClass();
                return;
            default:
                if (!this.f48566b) {
                    this.f48566b = true;
                    ((bn) this.f48567c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
