package org.telegram.ui.Components;
public final class uv0 extends o1.i {
    public final sv0 f28920a;
    public final tv0 f28921b;
    public float f28922c = 1.0f;

    public uv0(sv0 sv0Var, tv0 tv0Var) {
        this.f28920a = sv0Var;
        this.f28921b = tv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28920a.get(obj) * this.f28922c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28921b.b(obj, f7 / this.f28922c);
    }
}
