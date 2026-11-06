package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f46565a;
    public boolean f46566b;
    public final Object f46567c;

    public i4(Object obj, int i7) {
        this.f46565a = i7;
        this.f46567c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46565a) {
            case 0:
                this.f46566b = false;
                ((j4) this.f46567c).getClass();
                return;
            default:
                if (!this.f46566b) {
                    this.f46566b = true;
                    ((an) this.f46567c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
