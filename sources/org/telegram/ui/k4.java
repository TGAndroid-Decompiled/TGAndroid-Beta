package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37932a;
    public boolean f37933b;
    public final Object f37934c;

    public k4(Object obj, int i10) {
        this.f37932a = i10;
        this.f37934c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37932a) {
            case 0:
                this.f37933b = false;
                ((l4) this.f37934c).getClass();
                return;
            default:
                if (!this.f37933b) {
                    this.f37933b = true;
                    ((co) this.f37934c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
