package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34769a;
    public boolean f34770b;
    public final Object f34771c;

    public j4(Object obj, int i10) {
        this.f34769a = i10;
        this.f34771c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34769a) {
            case 0:
                this.f34770b = false;
                ((k4) this.f34771c).getClass();
                return;
            default:
                if (!this.f34770b) {
                    this.f34770b = true;
                    ((bo) this.f34771c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
