package org.telegram.ui.Components;
public final class f11 implements Runnable {
    public final int f22802a;
    public final i11 f22803b;
    public final h11 f22804c;

    public f11(i11 i11Var, h11 h11Var, int i10) {
        this.f22802a = i10;
        this.f22803b = i11Var;
        this.f22804c = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f22802a) {
            case 0:
                this.f22803b.b(this.f22804c);
                return;
            case 1:
                this.f22803b.b(this.f22804c);
                return;
            default:
                this.f22803b.b(this.f22804c);
                return;
        }
    }
}
