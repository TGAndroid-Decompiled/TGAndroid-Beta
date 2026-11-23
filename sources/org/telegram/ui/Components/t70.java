package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f39793a;
    public final v70 f39794b;
    public final boolean f39795c;

    public t70(v70 v70Var, boolean z10, int i7) {
        this.f39793a = i7;
        this.f39794b = v70Var;
        this.f39795c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39793a) {
            case 0:
                org.telegram.messenger.g0.g3(new t70(this.f39794b, this.f39795c, 1));
                return;
            default:
                this.f39794b.setJoinRequest(this.f39795c);
                return;
        }
    }
}
