package org.telegram.ui.Components;
public final class az0 implements Runnable {
    public final int f32022a;
    public final cz0 f32023b;
    public final bz0 f32024c;

    public az0(cz0 cz0Var, bz0 bz0Var, int i7) {
        this.f32022a = i7;
        this.f32023b = cz0Var;
        this.f32024c = bz0Var;
    }

    @Override
    public final void run() {
        switch (this.f32022a) {
            case 0:
                this.f32023b.a(this.f32024c);
                return;
            case 1:
                this.f32023b.a(this.f32024c);
                return;
            default:
                this.f32023b.a(this.f32024c);
                return;
        }
    }
}
