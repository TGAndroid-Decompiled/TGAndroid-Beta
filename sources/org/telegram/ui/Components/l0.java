package org.telegram.ui.Components;
public final class l0 implements md0 {
    public final int f27997a;
    public final od0 f27998b;
    public final od0 f27999c;
    public final od0 d;

    public l0(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10) {
        this.f27997a = i10;
        this.f27998b = od0Var;
        this.f27999c = od0Var2;
        this.d = od0Var3;
    }

    @Override
    public final void q(od0 od0Var, int i10) {
        switch (this.f27997a) {
            case 0:
                f5.a(this.f27998b, this.f27999c, this.d);
                return;
            case 1:
                f5.x0(this.f27998b, this.f27999c, this.d);
                return;
            default:
                f5.x0(this.f27998b, this.f27999c, this.d);
                return;
        }
    }
}
