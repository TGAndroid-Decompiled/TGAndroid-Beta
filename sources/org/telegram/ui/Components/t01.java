package org.telegram.ui.Components;
public final class t01 implements Runnable {
    public final int f27982a;
    public final w01 f27983b;
    public final v01 f27984c;

    public t01(w01 w01Var, v01 v01Var, int i10) {
        this.f27982a = i10;
        this.f27983b = w01Var;
        this.f27984c = v01Var;
    }

    @Override
    public final void run() {
        switch (this.f27982a) {
            case 0:
                this.f27983b.b(this.f27984c);
                return;
            case 1:
                this.f27983b.b(this.f27984c);
                return;
            default:
                this.f27983b.b(this.f27984c);
                return;
        }
    }
}
