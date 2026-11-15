package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f47886a;
    public boolean f47887b;
    public final Object f47888c;

    public i4(Object obj, int i7) {
        this.f47886a = i7;
        this.f47888c = obj;
    }

    @Override
    public final void run() {
        switch (this.f47886a) {
            case 0:
                this.f47887b = false;
                ((j4) this.f47888c).getClass();
                return;
            default:
                if (!this.f47887b) {
                    this.f47887b = true;
                    ((an) this.f47888c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
