package org.telegram.ui;
public final class l4 implements Runnable {
    public final int f40965a;
    public boolean f40966b;
    public final Object f40967c;

    public l4(Object obj, int i10) {
        this.f40965a = i10;
        this.f40967c = obj;
    }

    @Override
    public final void run() {
        switch (this.f40965a) {
            case 0:
                this.f40966b = false;
                ((m4) this.f40967c).getClass();
                return;
            default:
                if (!this.f40966b) {
                    this.f40966b = true;
                    ((wn) this.f40967c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
