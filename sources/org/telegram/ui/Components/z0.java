package org.telegram.ui.Components;
public final class z0 implements Runnable {
    public final int f40795a;
    public final u4 f40796b;
    public final org.telegram.ui.ActionBar.u1 f40797c;
    public final org.telegram.ui.ActionBar.f2 d;

    public z0(u4 u4Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f40795a = i7;
        this.f40796b = u4Var;
        this.f40797c = u1Var;
        this.d = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f40795a) {
            case 0:
                org.telegram.messenger.g0.h3(new z0(this.f40796b, this.f40797c, this.d, 1));
                return;
            default:
                v4.b0(this.f40796b, this.f40797c, this.d);
                return;
        }
    }
}
