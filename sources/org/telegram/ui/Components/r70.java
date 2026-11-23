package org.telegram.ui.Components;
public final class r70 implements Runnable {
    public final int f39226a;
    public final s70 f39227b;
    public final boolean f39228c;
    public final boolean d;

    public r70(s70 s70Var, boolean z10, boolean z11, int i7) {
        this.f39226a = i7;
        this.f39227b = s70Var;
        this.f39228c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f39226a) {
            case 0:
                org.telegram.messenger.g0.g3(new r70(this.f39227b, this.f39228c, this.d, 1));
                return;
            default:
                s70 s70Var = this.f39227b;
                s70Var.setJoinRequest(this.f39228c);
                s70Var.setJoinToSend(this.d);
                return;
        }
    }
}
