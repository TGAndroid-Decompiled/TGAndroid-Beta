package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f46476a;
    public boolean f46477b;
    public final Object f46478c;

    public i4(Object obj, int i7) {
        this.f46476a = i7;
        this.f46478c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46476a) {
            case 0:
                this.f46477b = false;
                ((j4) this.f46478c).getClass();
                return;
            default:
                if (!this.f46477b) {
                    this.f46477b = true;
                    ((cn) this.f46478c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
