package org.telegram.ui.Components;
public final class g70 implements Runnable {
    public final int f34867a;
    public final i70 f34868b;
    public final boolean f34869c;

    public g70(i70 i70Var, boolean z10, int i7) {
        this.f34867a = i7;
        this.f34868b = i70Var;
        this.f34869c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34867a) {
            case 0:
                org.telegram.messenger.g0.h3(new g70(this.f34868b, this.f34869c, 1));
                return;
            default:
                this.f34868b.setJoinRequest(this.f34869c);
                return;
        }
    }
}
