package org.telegram.ui;
public final class n4 implements Runnable {
    public final int f36444a;
    public boolean f36445b;
    public final Object f36446c;

    public n4(Object obj, int i10) {
        this.f36444a = i10;
        this.f36446c = obj;
    }

    @Override
    public final void run() {
        switch (this.f36444a) {
            case 0:
                this.f36445b = false;
                ((o4) this.f36446c).getClass();
                return;
            default:
                if (!this.f36445b) {
                    this.f36445b = true;
                    ((xn) this.f36446c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
