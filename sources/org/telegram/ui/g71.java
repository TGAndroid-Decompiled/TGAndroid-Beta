package org.telegram.ui;
public final class g71 implements Runnable {
    public final int f39524a;
    public final SessionsActivity f39525b;
    public final boolean f39526c;

    public g71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39524a = i10;
        this.f39525b = sessionsActivity;
        this.f39526c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39524a) {
            case 0:
                this.f39525b.l0(this.f39526c);
                return;
            default:
                this.f39525b.l0(this.f39526c);
                return;
        }
    }
}
