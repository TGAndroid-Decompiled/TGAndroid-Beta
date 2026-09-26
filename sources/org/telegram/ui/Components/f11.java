package org.telegram.ui.Components;
public final class f11 implements Runnable {
    public final int f24034a;
    public final i11 f24035b;
    public final h11 f24036c;

    public f11(i11 i11Var, h11 h11Var, int i10) {
        this.f24034a = i10;
        this.f24035b = i11Var;
        this.f24036c = h11Var;
    }

    @Override
    public final void run() {
        switch (this.f24034a) {
            case 0:
                this.f24035b.b(this.f24036c);
                return;
            case 1:
                this.f24035b.b(this.f24036c);
                return;
            default:
                this.f24035b.b(this.f24036c);
                return;
        }
    }
}
