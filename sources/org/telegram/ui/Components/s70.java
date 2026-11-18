package org.telegram.ui.Components;
public final class s70 implements Runnable {
    public final int f39505a;
    public final t70 f39506b;
    public final boolean f39507c;
    public final boolean d;

    public s70(t70 t70Var, boolean z10, boolean z11, int i7) {
        this.f39505a = i7;
        this.f39506b = t70Var;
        this.f39507c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f39505a) {
            case 0:
                org.telegram.messenger.g0.g3(new s70(this.f39506b, this.f39507c, this.d, 1));
                return;
            default:
                t70 t70Var = this.f39506b;
                t70Var.setJoinRequest(this.f39507c);
                t70Var.setJoinToSend(this.d);
                return;
        }
    }
}
