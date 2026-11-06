package org.telegram.ui.Components;
public final class z0 implements Runnable {
    public final int f40773a;
    public final u4 f40774b;
    public final org.telegram.ui.ActionBar.u1 f40775c;
    public final org.telegram.ui.ActionBar.f2 d;

    public z0(u4 u4Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f40773a = i7;
        this.f40774b = u4Var;
        this.f40775c = u1Var;
        this.d = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f40773a) {
            case 0:
                org.telegram.messenger.g0.h3(new z0(this.f40774b, this.f40775c, this.d, 1));
                return;
            default:
                v4.b0(this.f40774b, this.f40775c, this.d);
                return;
        }
    }
}
