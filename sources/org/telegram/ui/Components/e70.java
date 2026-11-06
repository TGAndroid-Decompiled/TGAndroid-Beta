package org.telegram.ui.Components;
public final class e70 implements Runnable {
    public final int f33164a;
    public final f70 f33165b;
    public final boolean f33166c;
    public final boolean d;

    public e70(f70 f70Var, boolean z9, boolean z10, int i7) {
        this.f33164a = i7;
        this.f33165b = f70Var;
        this.f33166c = z9;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f33164a) {
            case 0:
                org.telegram.messenger.g0.h3(new e70(this.f33165b, this.f33166c, this.d, 1));
                return;
            default:
                f70 f70Var = this.f33165b;
                f70Var.setJoinRequest(this.f33166c);
                f70Var.setJoinToSend(this.d);
                return;
        }
    }
}
