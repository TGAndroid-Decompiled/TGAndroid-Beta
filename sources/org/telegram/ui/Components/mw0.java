package org.telegram.ui.Components;
public final class mw0 extends o1.i {
    public final kw0 f28920a;
    public final lw0 f28921b;
    public float f28922c = 1.0f;

    public mw0(kw0 kw0Var, lw0 lw0Var) {
        this.f28920a = kw0Var;
        this.f28921b = lw0Var;
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
