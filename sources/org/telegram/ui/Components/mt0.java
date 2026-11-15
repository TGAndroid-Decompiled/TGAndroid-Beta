package org.telegram.ui.Components;
public final class mt0 extends r1.e {
    public final kt0 f37375a;
    public final lt0 f37376b;
    public float f37377c = 1.0f;

    public mt0(kt0 kt0Var, lt0 lt0Var) {
        this.f37375a = kt0Var;
        this.f37376b = lt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f37375a.get(obj) * this.f37377c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f37376b.c(obj, f10 / this.f37377c);
    }
}
