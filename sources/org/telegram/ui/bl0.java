package org.telegram.ui;
public final class bl0 implements Runnable {
    public final int f32982a;
    public final bs f32983b;

    public bl0(bs bsVar, int i10) {
        this.f32982a = i10;
        this.f32983b = bsVar;
    }

    @Override
    public final void run() {
        switch (this.f32982a) {
            case 0:
                this.f32983b.l(1.0f);
                return;
            default:
                this.f32983b.l(1.0f);
                return;
        }
    }
}
