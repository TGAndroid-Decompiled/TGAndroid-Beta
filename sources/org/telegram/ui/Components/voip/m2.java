package org.telegram.ui.Components.voip;
public final class m2 implements Runnable {
    public final int f31538a;
    public final r2 f31539b;
    public final int f31540c;

    public m2(r2 r2Var, int i10, int i11) {
        this.f31538a = i11;
        this.f31539b = r2Var;
        this.f31540c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31538a) {
            case 0:
                org.telegram.messenger.i0.g3(new m2(this.f31539b, this.f31540c, 2));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new m2(this.f31539b, this.f31540c, 3));
                return;
            case 2:
                this.f31539b.c(this.f31540c);
                return;
            default:
                this.f31539b.a(this.f31540c);
                return;
        }
    }
}
