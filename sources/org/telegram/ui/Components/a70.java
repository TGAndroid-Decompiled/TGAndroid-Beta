package org.telegram.ui.Components;
public final class a70 implements Runnable {
    public final int f31747a;
    public final b70 f31748b;
    public final boolean f31749c;
    public final boolean d;

    public a70(b70 b70Var, boolean z10, boolean z11, int i3) {
        this.f31747a = i3;
        this.f31748b = b70Var;
        this.f31749c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f31747a) {
            case 0:
                org.telegram.messenger.g0.h3(new a70(this.f31748b, this.f31749c, this.d, 1));
                return;
            default:
                b70 b70Var = this.f31748b;
                b70Var.setJoinRequest(this.f31749c);
                b70Var.setJoinToSend(this.d);
                return;
        }
    }
}
