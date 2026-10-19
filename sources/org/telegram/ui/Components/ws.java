package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32206a;
    public final at f32207b;

    public ws(at atVar, int i10) {
        this.f32206a = i10;
        this.f32207b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32206a) {
            case 0:
                this.f32207b.W(false);
                return;
            default:
                this.f32207b.N(true);
                return;
        }
    }
}
