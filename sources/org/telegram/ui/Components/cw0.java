package org.telegram.ui.Components;
public final class cw0 extends o1.i {
    public final aw0 f25393a;
    public final bw0 f25394b;
    public float f25395c = 1.0f;

    public cw0(aw0 aw0Var, bw0 bw0Var) {
        this.f25393a = aw0Var;
        this.f25394b = bw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25393a.get(obj) * this.f25395c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25394b.b(obj, f7 / this.f25395c);
    }
}
