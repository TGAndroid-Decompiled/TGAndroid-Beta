package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34802a;
    public boolean f34803b;
    public final Object f34804c;

    public j4(Object obj, int i10) {
        this.f34802a = i10;
        this.f34804c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34802a) {
            case 0:
                this.f34803b = false;
                ((k4) this.f34804c).getClass();
                return;
            default:
                if (!this.f34803b) {
                    this.f34803b = true;
                    ((bo) this.f34804c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
