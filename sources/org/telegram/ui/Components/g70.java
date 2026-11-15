package org.telegram.ui.Components;
public final class g70 implements Runnable {
    public final int f34863a;
    public final i70 f34864b;
    public final boolean f34865c;

    public g70(i70 i70Var, boolean z10, int i7) {
        this.f34863a = i7;
        this.f34864b = i70Var;
        this.f34865c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34863a) {
            case 0:
                org.telegram.messenger.g0.h3(new g70(this.f34864b, this.f34865c, 1));
                return;
            default:
                this.f34864b.setJoinRequest(this.f34865c);
                return;
        }
    }
}
