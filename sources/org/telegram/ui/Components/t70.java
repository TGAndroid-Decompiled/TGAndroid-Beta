package org.telegram.ui.Components;
public final class t70 implements Runnable {
    public final int f39800a;
    public final v70 f39801b;
    public final boolean f39802c;

    public t70(v70 v70Var, boolean z10, int i7) {
        this.f39800a = i7;
        this.f39801b = v70Var;
        this.f39802c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39800a) {
            case 0:
                org.telegram.messenger.g0.g3(new t70(this.f39801b, this.f39802c, 1));
                return;
            default:
                this.f39801b.setJoinRequest(this.f39802c);
                return;
        }
    }
}
