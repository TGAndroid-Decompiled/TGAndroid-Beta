package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f39356a;
    public boolean f39357b;
    public final Object f39358c;

    public k4(Object obj, int i10) {
        this.f39356a = i10;
        this.f39358c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39356a) {
            case 0:
                this.f39357b = false;
                ((l4) this.f39358c).getClass();
                return;
            default:
                if (!this.f39357b) {
                    this.f39357b = true;
                    ((eo) this.f39358c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
