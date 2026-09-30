package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f35014a;
    public boolean f35015b;
    public final Object f35016c;

    public k4(Object obj, int i10) {
        this.f35014a = i10;
        this.f35016c = obj;
    }

    @Override
    public final void run() {
        switch (this.f35014a) {
            case 0:
                this.f35015b = false;
                ((l4) this.f35016c).getClass();
                return;
            default:
                if (!this.f35015b) {
                    this.f35015b = true;
                    ((wn) this.f35016c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
