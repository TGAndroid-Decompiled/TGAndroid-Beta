package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37933a;
    public boolean f37934b;
    public final Object f37935c;

    public k4(Object obj, int i10) {
        this.f37933a = i10;
        this.f37935c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37933a) {
            case 0:
                this.f37934b = false;
                ((l4) this.f37935c).getClass();
                return;
            default:
                if (!this.f37934b) {
                    this.f37934b = true;
                    ((co) this.f37935c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
