package org.telegram.ui.Components;
public final class f70 implements Runnable {
    public final int f33600a;
    public final g70 f33601b;
    public final boolean f33602c;
    public final boolean d;

    public f70(g70 g70Var, boolean z9, boolean z10, int i7) {
        this.f33600a = i7;
        this.f33601b = g70Var;
        this.f33602c = z9;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f33600a) {
            case 0:
                org.telegram.messenger.g0.h3(new f70(this.f33601b, this.f33602c, this.d, 1));
                return;
            default:
                g70 g70Var = this.f33601b;
                g70Var.setJoinRequest(this.f33602c);
                g70Var.setJoinToSend(this.d);
                return;
        }
    }
}
