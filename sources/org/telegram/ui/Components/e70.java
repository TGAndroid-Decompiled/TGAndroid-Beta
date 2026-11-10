package org.telegram.ui.Components;
public final class e70 implements Runnable {
    public final int f33186a;
    public final f70 f33187b;
    public final boolean f33188c;
    public final boolean d;

    public e70(f70 f70Var, boolean z9, boolean z10, int i7) {
        this.f33186a = i7;
        this.f33187b = f70Var;
        this.f33188c = z9;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f33186a) {
            case 0:
                org.telegram.messenger.g0.h3(new e70(this.f33187b, this.f33188c, this.d, 1));
                return;
            default:
                f70 f70Var = this.f33187b;
                f70Var.setJoinRequest(this.f33188c);
                f70Var.setJoinToSend(this.d);
                return;
        }
    }
}
