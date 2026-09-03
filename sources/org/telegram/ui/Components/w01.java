package org.telegram.ui.Components;
public final class w01 implements Runnable {
    public final int f30099a;
    public final y01 f30100b;
    public final x01 f30101c;

    public w01(y01 y01Var, x01 x01Var, int i10) {
        this.f30099a = i10;
        this.f30100b = y01Var;
        this.f30101c = x01Var;
    }

    @Override
    public final void run() {
        switch (this.f30099a) {
            case 0:
                this.f30100b.b(this.f30101c);
                return;
            case 1:
                this.f30100b.b(this.f30101c);
                return;
            default:
                this.f30100b.b(this.f30101c);
                return;
        }
    }
}
