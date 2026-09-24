package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f34911a;
    public boolean f34912b;
    public final Object f34913c;

    public k4(Object obj, int i10) {
        this.f34911a = i10;
        this.f34913c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34911a) {
            case 0:
                this.f34912b = false;
                ((l4) this.f34913c).getClass();
                return;
            default:
                if (!this.f34912b) {
                    this.f34912b = true;
                    ((wn) this.f34913c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
