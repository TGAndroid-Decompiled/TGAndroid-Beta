package org.telegram.ui;
public final class i4 implements Runnable {
    public final int f46557a;
    public boolean f46558b;
    public final Object f46559c;

    public i4(Object obj, int i7) {
        this.f46557a = i7;
        this.f46559c = obj;
    }

    @Override
    public final void run() {
        switch (this.f46557a) {
            case 0:
                this.f46558b = false;
                ((j4) this.f46559c).getClass();
                return;
            default:
                if (!this.f46558b) {
                    this.f46558b = true;
                    ((an) this.f46559c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
