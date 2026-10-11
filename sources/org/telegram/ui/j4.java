package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f38864a;
    public boolean f38865b;
    public final Object f38866c;

    public j4(Object obj, int i10) {
        this.f38864a = i10;
        this.f38866c = obj;
    }

    @Override
    public final void run() {
        switch (this.f38864a) {
            case 0:
                this.f38865b = false;
                ((k4) this.f38866c).getClass();
                return;
            default:
                if (!this.f38865b) {
                    this.f38865b = true;
                    ((zn) this.f38866c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
