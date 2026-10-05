package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37836a;
    public boolean f37837b;
    public final Object f37838c;

    public k4(Object obj, int i10) {
        this.f37836a = i10;
        this.f37838c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37836a) {
            case 0:
                this.f37837b = false;
                ((l4) this.f37838c).getClass();
                return;
            default:
                if (!this.f37837b) {
                    this.f37837b = true;
                    ((yn) this.f37838c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
