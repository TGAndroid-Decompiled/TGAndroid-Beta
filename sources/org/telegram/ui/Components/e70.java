package org.telegram.ui.Components;
public final class e70 implements Runnable {
    public final int f33328a;
    public final g70 f33329b;
    public final boolean f33330c;

    public e70(g70 g70Var, boolean z9, int i7) {
        this.f33328a = i7;
        this.f33329b = g70Var;
        this.f33330c = z9;
    }

    @Override
    public final void run() {
        switch (this.f33328a) {
            case 0:
                org.telegram.messenger.g0.h3(new e70(this.f33329b, this.f33330c, 1));
                return;
            default:
                this.f33329b.setJoinRequest(this.f33330c);
                return;
        }
    }
}
