package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32208a;
    public final at f32209b;

    public ws(at atVar, int i10) {
        this.f32208a = i10;
        this.f32209b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32208a) {
            case 0:
                this.f32209b.W(false);
                return;
            default:
                this.f32209b.N(true);
                return;
        }
    }
}
