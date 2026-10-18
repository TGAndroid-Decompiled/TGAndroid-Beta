package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32209a;
    public final at f32210b;

    public ws(at atVar, int i10) {
        this.f32209a = i10;
        this.f32210b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32209a) {
            case 0:
                this.f32210b.W(false);
                return;
            default:
                this.f32210b.N(true);
                return;
        }
    }
}
