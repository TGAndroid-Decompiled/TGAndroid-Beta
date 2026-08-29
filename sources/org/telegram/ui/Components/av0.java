package org.telegram.ui.Components;
public final class av0 extends o1.j {
    public final yu0 f26897a;
    public final zu0 f26898b;
    public float f26899c = 1.0f;

    public av0(yu0 yu0Var, zu0 zu0Var) {
        this.f26897a = yu0Var;
        this.f26898b = zu0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26897a.get(obj) * this.f26899c;
    }

    @Override
    public final void b(Object obj, float f9) {
        this.f26898b.b(obj, f9 / this.f26899c);
    }
}
