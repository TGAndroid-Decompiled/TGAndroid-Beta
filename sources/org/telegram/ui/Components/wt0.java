package org.telegram.ui.Components;
public final class wt0 extends r1.e {
    public final ut0 f41730a;
    public final vt0 f41731b;
    public float f41732c = 1.0f;

    public wt0(ut0 ut0Var, vt0 vt0Var) {
        this.f41730a = ut0Var;
        this.f41731b = vt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f41730a.get(obj) * this.f41732c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f41731b.d(obj, f10 / this.f41732c);
    }
}
