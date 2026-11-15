package org.telegram.ui.Components;
public final class h70 implements Runnable {
    public final int f35187a;
    public final i70 f35188b;
    public final boolean f35189c;
    public final boolean d;

    public h70(i70 i70Var, boolean z10, boolean z11, int i7) {
        this.f35187a = i7;
        this.f35188b = i70Var;
        this.f35189c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f35187a) {
            case 0:
                org.telegram.messenger.g0.h3(new h70(this.f35188b, this.f35189c, this.d, 1));
                return;
            default:
                i70 i70Var = this.f35188b;
                i70Var.setJoinRequest(this.f35189c);
                i70Var.setJoinToSend(this.d);
                return;
        }
    }
}
