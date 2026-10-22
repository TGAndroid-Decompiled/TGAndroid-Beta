package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39408a;
    public boolean f39409b;
    public final Object f39410c;

    public n4(Object obj, int i10) {
        this.f39408a = i10;
        this.f39410c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39408a) {
            case 0:
                this.f39409b = false;
                ((o4) this.f39410c).getClass();
                return;
            default:
                if (!this.f39409b) {
                    this.f39409b = true;
                    ((qn) this.f39410c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
