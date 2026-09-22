package org.telegram.ui.Components;
public final class vv0 extends o1.i {
    public final tv0 f29819a;
    public final uv0 f29820b;
    public float f29821c = 1.0f;

    public vv0(tv0 tv0Var, uv0 uv0Var) {
        this.f29819a = tv0Var;
        this.f29820b = uv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29819a.get(obj) * this.f29821c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29820b.b(obj, f7 / this.f29821c);
    }
}
