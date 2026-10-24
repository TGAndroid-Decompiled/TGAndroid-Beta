package org.telegram.ui;
public final class m4 implements Runnable {
    public final int f39435a;
    public boolean f39436b;
    public final Object f39437c;

    public m4(Object obj, int i10) {
        this.f39435a = i10;
        this.f39437c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39435a) {
            case 0:
                this.f39436b = false;
                ((n4) this.f39437c).getClass();
                return;
            default:
                if (!this.f39436b) {
                    this.f39436b = true;
                    ((sn) this.f39437c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
