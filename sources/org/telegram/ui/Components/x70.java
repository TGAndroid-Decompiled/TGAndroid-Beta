package org.telegram.ui.Components;
public final class x70 implements Runnable {
    public final int f32489a;
    public final y70 f32490b;
    public final boolean f32491c;
    public final boolean d;

    public x70(y70 y70Var, boolean z10, boolean z11, int i10) {
        this.f32489a = i10;
        this.f32490b = y70Var;
        this.f32491c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f32489a) {
            case 0:
                org.telegram.messenger.i0.g3(new x70(this.f32490b, this.f32491c, this.d, 1));
                return;
            default:
                y70 y70Var = this.f32490b;
                y70Var.setJoinRequest(this.f32491c);
                y70Var.setJoinToSend(this.d);
                return;
        }
    }
}
