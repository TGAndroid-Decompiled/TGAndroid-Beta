package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f48527a;
    public boolean f48528b;
    public final Object f48529c;

    public i4(Object obj, int i7) {
        this.f48527a = i7;
        this.f48529c = obj;
    }

    @Override
    public final void run() {
        switch (this.f48527a) {
            case 0:
                this.f48528b = false;
                ((j4) this.f48529c).getClass();
                return;
            default:
                if (!this.f48528b) {
                    this.f48528b = true;
                    ((bn) this.f48529c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
