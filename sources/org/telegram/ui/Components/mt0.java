package org.telegram.ui.Components;
public final class mt0 extends r1.e {
    public final kt0 f36090a;
    public final lt0 f36091b;
    public float f36092c = 1.0f;

    public mt0(kt0 kt0Var, lt0 lt0Var) {
        this.f36090a = kt0Var;
        this.f36091b = lt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f36090a.get(obj) * this.f36092c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f36091b.f(obj, f10 / this.f36092c);
    }
}
