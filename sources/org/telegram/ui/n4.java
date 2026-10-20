package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39405a;
    public boolean f39406b;
    public final Object f39407c;

    public n4(Object obj, int i10) {
        this.f39405a = i10;
        this.f39407c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39405a) {
            case 0:
                this.f39406b = false;
                ((o4) this.f39407c).getClass();
                return;
            default:
                if (!this.f39406b) {
                    this.f39406b = true;
                    ((qn) this.f39407c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
