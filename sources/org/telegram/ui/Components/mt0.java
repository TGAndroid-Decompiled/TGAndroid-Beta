package org.telegram.ui.Components;
public final class mt0 extends r1.e {
    public final kt0 f37376a;
    public final lt0 f37377b;
    public float f37378c = 1.0f;

    public mt0(kt0 kt0Var, lt0 lt0Var) {
        this.f37376a = kt0Var;
        this.f37377b = lt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f37376a.get(obj) * this.f37378c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f37377b.c(obj, f10 / this.f37378c);
    }
}
