package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f39399a;
    public boolean f39400b;
    public final Object f39401c;

    public n4(Object obj, int i10) {
        this.f39399a = i10;
        this.f39401c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39399a) {
            case 0:
                this.f39400b = false;
                ((o4) this.f39401c).getClass();
                return;
            default:
                if (!this.f39400b) {
                    this.f39400b = true;
                    ((qn) this.f39401c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
