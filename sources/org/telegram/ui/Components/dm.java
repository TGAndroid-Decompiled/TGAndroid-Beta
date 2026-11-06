package org.telegram.ui.Components;
public final class dm implements Runnable {
    public final int f32996a;
    public final bn f32997b;
    public final int f32998c;

    public dm(bn bnVar, int i7, int i10) {
        this.f32996a = i10;
        this.f32997b = bnVar;
        this.f32998c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32996a) {
            case 0:
                this.f32997b.j0(this.f32998c, null);
                return;
            case 1:
                this.f32997b.g0(this.f32998c);
                return;
            default:
                this.f32997b.j0(this.f32998c, null);
                return;
        }
    }
}
