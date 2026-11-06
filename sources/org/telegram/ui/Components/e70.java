package org.telegram.ui.Components;
public final class e70 implements Runnable {
    public final int f33184a;
    public final f70 f33185b;
    public final boolean f33186c;
    public final boolean d;

    public e70(f70 f70Var, boolean z9, boolean z10, int i7) {
        this.f33184a = i7;
        this.f33185b = f70Var;
        this.f33186c = z9;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f33184a) {
            case 0:
                org.telegram.messenger.g0.h3(new e70(this.f33185b, this.f33186c, this.d, 1));
                return;
            default:
                f70 f70Var = this.f33185b;
                f70Var.setJoinRequest(this.f33186c);
                f70Var.setJoinToSend(this.d);
                return;
        }
    }
}
