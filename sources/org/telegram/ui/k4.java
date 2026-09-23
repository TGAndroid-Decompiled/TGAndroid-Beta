package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f34567a;
    public boolean f34568b;
    public final Object f34569c;

    public k4(Object obj, int i10) {
        this.f34567a = i10;
        this.f34569c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34567a) {
            case 0:
                this.f34568b = false;
                ((l4) this.f34569c).getClass();
                return;
            default:
                if (!this.f34568b) {
                    this.f34568b = true;
                    ((xn) this.f34569c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
