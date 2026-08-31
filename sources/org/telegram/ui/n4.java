package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39283a;
    public boolean f39284b;
    public final Object f39285c;

    public n4(Object obj, int i10) {
        this.f39283a = i10;
        this.f39285c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39283a) {
            case 0:
                this.f39284b = false;
                ((o4) this.f39285c).getClass();
                return;
            default:
                if (!this.f39284b) {
                    this.f39284b = true;
                    ((xn) this.f39285c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
