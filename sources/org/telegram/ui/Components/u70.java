package org.telegram.ui.Components;
public final class u70 implements Runnable {
    public final int f40284a;
    public final v70 f40285b;
    public final boolean f40286c;
    public final boolean d;

    public u70(v70 v70Var, boolean z10, boolean z11, int i7) {
        this.f40284a = i7;
        this.f40285b = v70Var;
        this.f40286c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f40284a) {
            case 0:
                org.telegram.messenger.g0.g3(new u70(this.f40285b, this.f40286c, this.d, 1));
                return;
            default:
                v70 v70Var = this.f40285b;
                v70Var.setJoinRequest(this.f40286c);
                v70Var.setJoinToSend(this.d);
                return;
        }
    }
}
