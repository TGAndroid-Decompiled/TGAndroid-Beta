package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37905a;
    public boolean f37906b;
    public final Object f37907c;

    public k4(Object obj, int i10) {
        this.f37905a = i10;
        this.f37907c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37905a) {
            case 0:
                this.f37906b = false;
                ((l4) this.f37907c).getClass();
                return;
            default:
                if (!this.f37906b) {
                    this.f37906b = true;
                    ((co) this.f37907c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
