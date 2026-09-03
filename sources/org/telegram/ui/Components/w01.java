package org.telegram.ui.Components;
public final class w01 implements Runnable {
    public final int f32593a;
    public final y01 f32594b;
    public final x01 f32595c;

    public w01(y01 y01Var, x01 x01Var, int i10) {
        this.f32593a = i10;
        this.f32594b = y01Var;
        this.f32595c = x01Var;
    }

    @Override
    public final void run() {
        switch (this.f32593a) {
            case 0:
                this.f32594b.b(this.f32595c);
                return;
            case 1:
                this.f32594b.b(this.f32595c);
                return;
            default:
                this.f32594b.b(this.f32595c);
                return;
        }
    }
}
