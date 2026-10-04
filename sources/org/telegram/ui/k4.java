package org.telegram.ui;
public final class k4 implements Runnable {
    public final int f37823a;
    public boolean f37824b;
    public final Object f37825c;

    public k4(Object obj, int i10) {
        this.f37823a = i10;
        this.f37825c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37823a) {
            case 0:
                this.f37824b = false;
                ((l4) this.f37825c).getClass();
                return;
            default:
                if (!this.f37824b) {
                    this.f37824b = true;
                    ((yn) this.f37825c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
