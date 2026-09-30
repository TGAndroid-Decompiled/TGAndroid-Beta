package org.telegram.ui.Components;
public final class l0 implements fd0 {
    public final int f25841a;
    public final hd0 f25842b;
    public final hd0 f25843c;
    public final hd0 d;

    public l0(hd0 hd0Var, hd0 hd0Var2, hd0 hd0Var3, int i10) {
        this.f25841a = i10;
        this.f25842b = hd0Var;
        this.f25843c = hd0Var2;
        this.d = hd0Var3;
    }

    @Override
    public final void q(hd0 hd0Var, int i10) {
        switch (this.f25841a) {
            case 0:
                e5.b(this.f25842b, this.f25843c, this.d);
                return;
            case 1:
                e5.y0(this.f25842b, this.f25843c, this.d);
                return;
            default:
                e5.y0(this.f25842b, this.f25843c, this.d);
                return;
        }
    }
}
