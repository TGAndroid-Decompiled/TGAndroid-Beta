package org.telegram.ui;
public final class m4 implements Runnable {
    public final int f37904a;
    public boolean f37905b;
    public final Object f37906c;

    public m4(Object obj, int i10) {
        this.f37904a = i10;
        this.f37906c = obj;
    }

    @Override
    public final void run() {
        switch (this.f37904a) {
            case 0:
                this.f37905b = false;
                ((n4) this.f37906c).getClass();
                return;
            default:
                if (!this.f37905b) {
                    this.f37905b = true;
                    ((fo) this.f37906c).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
        }
    }
}
