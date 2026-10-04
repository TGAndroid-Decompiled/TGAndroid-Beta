package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37829a;
    public boolean f37830b;
    public final Object f37831c;

    public k4(Object obj, int i10) {
        this.f37829a = i10;
        this.f37831c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37829a) {
            case 0:
                this.f37830b = false;
                ((l4) this.f37831c).getClass();
                return;
            default:
                if (!this.f37830b) {
                    this.f37830b = true;
                    ((yn) this.f37831c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
