package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f34927a;
    public boolean f34928b;
    public final Object f34929c;

    public k4(Object obj, int i10) {
        this.f34927a = i10;
        this.f34929c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34927a) {
            case 0:
                this.f34928b = false;
                ((l4) this.f34929c).getClass();
                return;
            default:
                if (!this.f34928b) {
                    this.f34928b = true;
                    ((wn) this.f34929c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
