package org.telegram.ui.Components;
public final class z60 implements Runnable {
    public final int f40926a;
    public final b70 f40927b;
    public final boolean f40928c;

    public z60(b70 b70Var, boolean z10, int i3) {
        this.f40926a = i3;
        this.f40927b = b70Var;
        this.f40928c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40926a) {
            case 0:
                org.telegram.messenger.g0.h3(new z60(this.f40927b, this.f40928c, 1));
                return;
            default:
                this.f40927b.setJoinRequest(this.f40928c);
                return;
        }
    }
}
