package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32246a;
    public final at f32247b;

    public ws(at atVar, int i10) {
        this.f32246a = i10;
        this.f32247b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32246a) {
            case 0:
                this.f32247b.W(false);
                return;
            default:
                this.f32247b.N(true);
                return;
        }
    }
}
