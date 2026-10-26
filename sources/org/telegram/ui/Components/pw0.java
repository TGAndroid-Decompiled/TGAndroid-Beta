package org.telegram.ui.Components;
public final class pw0 extends o1.i {
    public final nw0 f31728a;
    public final ow0 f31729b;
    public float f31730c = 1.0f;

    public pw0(nw0 nw0Var, ow0 ow0Var) {
        this.f31728a = nw0Var;
        this.f31729b = ow0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f31728a.get(obj) * this.f31730c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f31729b.b(obj, f7 / this.f31730c);
    }
}
