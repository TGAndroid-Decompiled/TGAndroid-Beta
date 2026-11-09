package org.telegram.ui.Components;
public final class nt0 extends r1.e {
    public final lt0 f36498a;
    public final mt0 f36499b;
    public float f36500c = 1.0f;

    public nt0(lt0 lt0Var, mt0 mt0Var) {
        this.f36498a = lt0Var;
        this.f36499b = mt0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f36498a.get(obj) * this.f36500c;
    }

    @Override
    public final void b(Object obj, float f10) {
        this.f36499b.f(obj, f10 / this.f36500c);
    }
}
