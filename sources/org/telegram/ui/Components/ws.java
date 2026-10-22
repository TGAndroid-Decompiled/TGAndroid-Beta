package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32245a;
    public final at f32246b;

    public ws(at atVar, int i10) {
        this.f32245a = i10;
        this.f32246b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32245a) {
            case 0:
                this.f32246b.W(false);
                return;
            default:
                this.f32246b.N(true);
                return;
        }
    }
}
