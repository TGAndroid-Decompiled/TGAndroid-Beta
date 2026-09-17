package org.telegram.ui.Components;
public final class t01 implements Runnable {
    public final int f27979a;
    public final w01 f27980b;
    public final v01 f27981c;

    public t01(w01 w01Var, v01 v01Var, int i10) {
        this.f27979a = i10;
        this.f27980b = w01Var;
        this.f27981c = v01Var;
    }

    @Override
    public final void run() {
        switch (this.f27979a) {
            case 0:
                this.f27980b.b(this.f27981c);
                return;
            case 1:
                this.f27980b.b(this.f27981c);
                return;
            default:
                this.f27980b.b(this.f27981c);
                return;
        }
    }
}
