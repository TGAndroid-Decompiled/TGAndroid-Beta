package org.telegram.ui.Components;
public final class vv0 extends o1.i {
    public final tv0 f29746a;
    public final uv0 f29747b;
    public float f29748c = 1.0f;

    public vv0(tv0 tv0Var, uv0 uv0Var) {
        this.f29746a = tv0Var;
        this.f29747b = uv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29746a.get(obj) * this.f29748c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29747b.b(obj, f7 / this.f29748c);
    }
}
