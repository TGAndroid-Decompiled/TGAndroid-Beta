package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f46564a;
    public boolean f46565b;
    public final Object f46566c;

    public i4(Object obj, int i7) {
        this.f46564a = i7;
        this.f46566c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46564a) {
            case 0:
                this.f46565b = false;
                ((j4) this.f46566c).getClass();
                return;
            default:
                if (!this.f46565b) {
                    this.f46565b = true;
                    ((an) this.f46566c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
