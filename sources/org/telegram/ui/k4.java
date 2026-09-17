package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37906a;
    public boolean f37907b;
    public final Object f37908c;

    public k4(Object obj, int i10) {
        this.f37906a = i10;
        this.f37908c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37906a) {
            case 0:
                this.f37907b = false;
                ((l4) this.f37908c).getClass();
                return;
            default:
                if (!this.f37907b) {
                    this.f37907b = true;
                    ((co) this.f37908c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
