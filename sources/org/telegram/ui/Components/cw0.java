package org.telegram.ui.Components;
public final class cw0 extends o1.i {
    public final aw0 f25400a;
    public final bw0 f25401b;
    public float f25402c = 1.0f;

    public cw0(aw0 aw0Var, bw0 bw0Var) {
        this.f25400a = aw0Var;
        this.f25401b = bw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25400a.get(obj) * this.f25402c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25401b.b(obj, f7 / this.f25402c);
    }
}
