package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32338a;
    public final at f32339b;

    public ws(at atVar, int i10) {
        this.f32338a = i10;
        this.f32339b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32338a) {
            case 0:
                this.f32339b.W(false);
                return;
            default:
                this.f32339b.N(true);
                return;
        }
    }
}
