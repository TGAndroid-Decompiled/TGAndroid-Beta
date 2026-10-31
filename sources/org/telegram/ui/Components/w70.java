package org.telegram.ui.Components;
public final class w70 implements Runnable {
    public final int f32086a;
    public final y70 f32087b;
    public final boolean f32088c;

    public w70(y70 y70Var, boolean z10, int i10) {
        this.f32086a = i10;
        this.f32087b = y70Var;
        this.f32088c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32086a) {
            case 0:
                org.telegram.messenger.i0.g3(new w70(this.f32087b, this.f32088c, 1));
                return;
            default:
                this.f32087b.setJoinRequest(this.f32088c);
                return;
        }
    }
}
