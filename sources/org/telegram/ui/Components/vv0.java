package org.telegram.ui.Components;
public final class vv0 extends o1.i {
    public final tv0 f29747a;
    public final uv0 f29748b;
    public float f29749c = 1.0f;

    public vv0(tv0 tv0Var, uv0 uv0Var) {
        this.f29747a = tv0Var;
        this.f29748b = uv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29747a.get(obj) * this.f29749c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29748b.b(obj, f7 / this.f29749c);
    }
}
