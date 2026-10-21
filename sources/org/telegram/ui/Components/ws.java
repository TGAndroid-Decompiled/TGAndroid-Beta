package org.telegram.ui.Components;
public final class ws implements Runnable {
    public final int f32242a;
    public final at f32243b;

    public ws(at atVar, int i10) {
        this.f32242a = i10;
        this.f32243b = atVar;
    }

    @Override
    public final void run() {
        switch (this.f32242a) {
            case 0:
                this.f32243b.W(false);
                return;
            default:
                this.f32243b.N(true);
                return;
        }
    }
}
