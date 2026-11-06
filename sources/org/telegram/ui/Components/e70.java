package org.telegram.ui.Components;
public final class e70 implements Runnable {
    public final int f33167a;
    public final f70 f33168b;
    public final boolean f33169c;
    public final boolean d;

    public e70(f70 f70Var, boolean z9, boolean z10, int i7) {
        this.f33167a = i7;
        this.f33168b = f70Var;
        this.f33169c = z9;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f33167a) {
            case 0:
                org.telegram.messenger.g0.h3(new e70(this.f33168b, this.f33169c, this.d, 1));
                return;
            default:
                f70 f70Var = this.f33168b;
                f70Var.setJoinRequest(this.f33169c);
                f70Var.setJoinToSend(this.d);
                return;
        }
    }
}
