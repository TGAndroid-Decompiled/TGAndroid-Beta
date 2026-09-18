package org.telegram.ui;
public final class j4 implements Runnable {
    public final int f34774a;
    public boolean f34775b;
    public final Object f34776c;

    public j4(Object obj, int i10) {
        this.f34774a = i10;
        this.f34776c = obj;
    }

    @Override
    public final void run() {
        switch (this.f34774a) {
            case 0:
                this.f34775b = false;
                ((k4) this.f34776c).getClass();
                return;
            default:
                if (!this.f34775b) {
                    this.f34775b = true;
                    ((bo) this.f34776c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
