package org.telegram.ui.Components;
public final class u70 implements Runnable {
    public final int f40285a;
    public final v70 f40286b;
    public final boolean f40287c;
    public final boolean d;

    public u70(v70 v70Var, boolean z10, boolean z11, int i7) {
        this.f40285a = i7;
        this.f40286b = v70Var;
        this.f40287c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40285a) {
            case 0:
                org.telegram.messenger.g0.g3(new u70(this.f40286b, this.f40287c, this.d, 1));
                return;
            default:
                v70 v70Var = this.f40286b;
                v70Var.setJoinRequest(this.f40287c);
                v70Var.setJoinToSend(this.d);
                return;
        }
    }
}
