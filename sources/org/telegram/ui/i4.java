package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f47896a;
    public boolean f47897b;
    public final Object f47898c;

    public i4(Object obj, int i7) {
        this.f47896a = i7;
        this.f47898c = obj;
    }

    @Override
    public final void run() {
        switch (this.f47896a) {
            case 0:
                this.f47897b = false;
                ((j4) this.f47898c).getClass();
                return;
            default:
                if (!this.f47897b) {
                    this.f47897b = true;
                    ((an) this.f47898c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
