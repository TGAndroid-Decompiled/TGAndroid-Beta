package org.telegram.ui.Components;
public final class wg0 implements Runnable {
    public final int f29633a;
    public final zg0 f29634b;

    public wg0(zg0 zg0Var, int i10) {
        this.f29633a = i10;
        this.f29634b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f29633a) {
            case 0:
                this.f29634b.a(true);
                return;
            default:
                this.f29634b.d();
                return;
        }
    }
}
