package org.telegram.ui.Components;
public final class u70 implements Runnable {
    public final int f40267a;
    public final v70 f40268b;
    public final boolean f40269c;
    public final boolean d;

    public u70(v70 v70Var, boolean z10, boolean z11, int i7) {
        this.f40267a = i7;
        this.f40268b = v70Var;
        this.f40269c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40267a) {
            case 0:
                org.telegram.messenger.g0.g3(new u70(this.f40268b, this.f40269c, this.d, 1));
                return;
            default:
                v70 v70Var = this.f40268b;
                v70Var.setJoinRequest(this.f40269c);
                v70Var.setJoinToSend(this.d);
                return;
        }
    }
}
