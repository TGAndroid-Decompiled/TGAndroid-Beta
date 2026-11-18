package org.telegram.ui.Components;
public final class r70 implements Runnable {
    public final int f39057a;
    public final t70 f39058b;
    public final boolean f39059c;

    public r70(t70 t70Var, boolean z10, int i7) {
        this.f39057a = i7;
        this.f39058b = t70Var;
        this.f39059c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39057a) {
            case 0:
                org.telegram.messenger.g0.g3(new r70(this.f39058b, this.f39059c, 1));
                return;
            default:
                this.f39058b.setJoinRequest(this.f39059c);
                return;
        }
    }
}
