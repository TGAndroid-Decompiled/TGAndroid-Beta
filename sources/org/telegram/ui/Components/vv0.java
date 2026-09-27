package org.telegram.ui.Components;
public final class vv0 extends o1.i {
    public final tv0 f29798a;
    public final uv0 f29799b;
    public float f29800c = 1.0f;

    public vv0(tv0 tv0Var, uv0 uv0Var) {
        this.f29798a = tv0Var;
        this.f29799b = uv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29798a.get(obj) * this.f29800c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29799b.b(obj, f7 / this.f29800c);
    }
}
