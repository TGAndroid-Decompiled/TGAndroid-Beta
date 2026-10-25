package org.telegram.ui.Components;
public final class pw0 extends o1.i {
    public final nw0 f31726a;
    public final ow0 f31727b;
    public float f31728c = 1.0f;

    public pw0(nw0 nw0Var, ow0 ow0Var) {
        this.f31726a = nw0Var;
        this.f31727b = ow0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f31726a.get(obj) * this.f31728c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f31727b.b(obj, f7 / this.f31728c);
    }
}
