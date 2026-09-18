package org.telegram.ui.Components;
public final class uv0 extends o1.i {
    public final sv0 f28837a;
    public final tv0 f28838b;
    public float f28839c = 1.0f;

    public uv0(sv0 sv0Var, tv0 tv0Var) {
        this.f28837a = sv0Var;
        this.f28838b = tv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f28837a.get(obj) * this.f28839c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f28838b.b(obj, f7 / this.f28839c);
    }
}
