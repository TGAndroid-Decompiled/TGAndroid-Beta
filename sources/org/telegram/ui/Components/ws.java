package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32241a;
    public final at f32242b;

    public ws(at atVar, int i10) {
        this.f32241a = i10;
        this.f32242b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32241a) {
            case 0:
                this.f32242b.W(false);
                return;
            default:
                this.f32242b.N(true);
                return;
        }
    }
}
