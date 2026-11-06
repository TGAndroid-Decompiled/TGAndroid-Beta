package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f46566a;
    public boolean f46567b;
    public final Object f46568c;

    public i4(Object obj, int i7) {
        this.f46566a = i7;
        this.f46568c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46566a) {
            case 0:
                this.f46567b = false;
                ((j4) this.f46568c).getClass();
                return;
            default:
                if (!this.f46567b) {
                    this.f46567b = true;
                    ((an) this.f46568c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
