package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f46459a;
    public boolean f46460b;
    public final Object f46461c;

    public i4(Object obj, int i7) {
        this.f46459a = i7;
        this.f46461c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46459a) {
            case 0:
                this.f46460b = false;
                ((j4) this.f46461c).getClass();
                return;
            default:
                if (!this.f46460b) {
                    this.f46460b = true;
                    ((cn) this.f46461c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
