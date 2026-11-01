package org.telegram.ui.Components;
public final class w70 implements Runnable {
    public final int f32134a;
    public final y70 f32135b;
    public final boolean f32136c;

    public w70(y70 y70Var, boolean z10, int i10) {
        this.f32134a = i10;
        this.f32135b = y70Var;
        this.f32136c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32134a) {
            case 0:
                org.telegram.messenger.i0.g3(new w70(this.f32135b, this.f32136c, 1));
                return;
            default:
                this.f32135b.setJoinRequest(this.f32136c);
                return;
        }
    }
}
