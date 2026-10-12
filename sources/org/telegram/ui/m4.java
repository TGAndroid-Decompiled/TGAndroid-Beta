package org.telegram.ui;
public final class m4 implements Runnable {
    public final int f38158a;
    public boolean f38159b;
    public final Object f38160c;

    public m4(Object obj, int i10) {
        this.f38158a = i10;
        this.f38160c = obj;
    }

    @Override
    public final void run() {
        switch (this.f38158a) {
            case 0:
                this.f38159b = false;
                ((n4) this.f38160c).getClass();
                return;
            default:
                if (!this.f38159b) {
                    this.f38159b = true;
                    ((fo) this.f38160c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
