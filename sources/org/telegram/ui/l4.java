package org.telegram.ui;
public final class l4 implements Runnable {
    public final int f41131a;
    public boolean f41132b;
    public final Object f41133c;

    public l4(Object obj, int i10) {
        this.f41131a = i10;
        this.f41133c = obj;
    }

    @Override
    public final void run() {
        switch (this.f41131a) {
            case 0:
                this.f41132b = false;
                ((m4) this.f41133c).getClass();
                return;
            default:
                if (!this.f41132b) {
                    this.f41132b = true;
                    ((un) this.f41133c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
