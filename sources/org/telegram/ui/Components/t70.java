package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f39792a;
    public final v70 f39793b;
    public final boolean f39794c;

    public t70(v70 v70Var, boolean z10, int i7) {
        this.f39792a = i7;
        this.f39793b = v70Var;
        this.f39794c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39792a) {
            case 0:
                org.telegram.messenger.g0.g3(new t70(this.f39793b, this.f39794c, 1));
                return;
            default:
                this.f39793b.setJoinRequest(this.f39794c);
                return;
        }
    }
}
