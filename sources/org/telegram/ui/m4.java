package org.telegram.ui;
public final class m4 implements Runnable {
    public final int f39369a;
    public boolean f39370b;
    public final Object f39371c;

    public m4(Object obj, int i10) {
        this.f39369a = i10;
        this.f39371c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39369a) {
            case 0:
                this.f39370b = false;
                ((n4) this.f39371c).getClass();
                return;
            default:
                if (!this.f39370b) {
                    this.f39370b = true;
                    ((sn) this.f39371c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
