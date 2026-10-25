package org.telegram.ui;
public final class l4 implements Runnable {
    public final int f41128a;
    public boolean f41129b;
    public final Object f41130c;

    public l4(Object obj, int i10) {
        this.f41128a = i10;
        this.f41130c = obj;
    }

    @Override
    public final void run() {
        switch (this.f41128a) {
            case 0:
                this.f41129b = false;
                ((m4) this.f41130c).getClass();
                return;
            default:
                if (!this.f41129b) {
                    this.f41129b = true;
                    ((un) this.f41130c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
