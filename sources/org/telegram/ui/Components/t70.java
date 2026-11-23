package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f39747a;
    public final v70 f39748b;
    public final boolean f39749c;

    public t70(v70 v70Var, boolean z10, int i7) {
        this.f39747a = i7;
        this.f39748b = v70Var;
        this.f39749c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39747a) {
            case 0:
                org.telegram.messenger.g0.g3(new t70(this.f39748b, this.f39749c, 1));
                return;
            default:
                this.f39748b.setJoinRequest(this.f39749c);
                return;
        }
    }
}
