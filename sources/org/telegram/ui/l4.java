package org.telegram.ui;
public final class l4 implements Runnable {
    public final int f35241a;
    public boolean f35242b;
    public final Object f35243c;

    public l4(Object obj, int i10) {
        this.f35241a = i10;
        this.f35243c = obj;
    }

    @Override
    public final void run() {
        switch (this.f35241a) {
            case 0:
                this.f35242b = false;
                ((m4) this.f35243c).getClass();
                return;
            default:
                if (!this.f35242b) {
                    this.f35242b = true;
                    ((xn) this.f35243c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
