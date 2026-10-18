package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32216a;
    public final at f32217b;

    public ws(at atVar, int i10) {
        this.f32216a = i10;
        this.f32217b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32216a) {
            case 0:
                this.f32217b.W(false);
                return;
            default:
                this.f32217b.N(true);
                return;
        }
    }
}
