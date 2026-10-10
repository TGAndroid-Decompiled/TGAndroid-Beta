package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f39117a;
    public boolean f39118b;
    public final Object f39119c;

    public k4(Object obj, int i10) {
        this.f39117a = i10;
        this.f39119c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39117a) {
            case 0:
                this.f39118b = false;
                ((l4) this.f39119c).getClass();
                return;
            default:
                if (!this.f39118b) {
                    this.f39118b = true;
                    ((zn) this.f39119c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
