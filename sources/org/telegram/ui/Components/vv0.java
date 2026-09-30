package org.telegram.ui.Components;
public final class vv0 extends o1.i {
    public final tv0 f29743a;
    public final uv0 f29744b;
    public float f29745c = 1.0f;

    public vv0(tv0 tv0Var, uv0 uv0Var) {
        this.f29743a = tv0Var;
        this.f29744b = uv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f29743a.get(obj) * this.f29745c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f29744b.b(obj, f7 / this.f29745c);
    }
}
