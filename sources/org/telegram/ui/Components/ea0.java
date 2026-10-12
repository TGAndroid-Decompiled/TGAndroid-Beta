package org.telegram.ui.Components;
public final class ea0 implements Runnable {
    public final int f25646a;
    public final fa0 f25647b;
    public final ja0 f25648c;

    public ea0(fa0 fa0Var, ja0 ja0Var, int i10) {
        this.f25646a = i10;
        this.f25647b = fa0Var;
        this.f25648c = ja0Var;
    }

    @Override
    public final void run() {
        switch (this.f25646a) {
            case 0:
                this.f25647b.k(this.f25648c, false);
                return;
            default:
                this.f25647b.k(this.f25648c, false);
                return;
        }
    }
}
