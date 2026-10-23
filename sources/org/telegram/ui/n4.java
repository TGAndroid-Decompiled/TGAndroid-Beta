package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39409a;
    public boolean f39410b;
    public final Object f39411c;

    public n4(Object obj, int i10) {
        this.f39409a = i10;
        this.f39411c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39409a) {
            case 0:
                this.f39410b = false;
                ((o4) this.f39411c).getClass();
                return;
            default:
                if (!this.f39410b) {
                    this.f39410b = true;
                    ((qn) this.f39411c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
