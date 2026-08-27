package org.telegram.ui.Components;

public final class su0 extends o1.i {

    public final qu0 f32578a;

    public final ru0 f32579b;

    public float f32580c = 1.0f;

    public su0(qu0 qu0Var, ru0 ru0Var) {
        this.f32578a = qu0Var;
        this.f32579b = ru0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f32578a.get(obj) * this.f32580c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f32579b.b(obj, f10 / this.f32580c);
    }
}
