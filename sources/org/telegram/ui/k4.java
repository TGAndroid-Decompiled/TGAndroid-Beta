package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f39071a;
    public boolean f39072b;
    public final Object f39073c;

    public k4(Object obj, int i10) {
        this.f39071a = i10;
        this.f39073c = obj;
    }

    @Override
    public final void run() {
        switch (this.f39071a) {
            case 0:
                this.f39072b = false;
                ((l4) this.f39073c).getClass();
                return;
            default:
                if (!this.f39072b) {
                    this.f39072b = true;
                    ((zn) this.f39073c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
