package org.telegram.ui.Components;
public final class jv0 extends o1.i {
    public final hv0 f25453a;
    public final iv0 f25454b;
    public float f25455c = 1.0f;

    public jv0(hv0 hv0Var, iv0 iv0Var) {
        this.f25453a = hv0Var;
        this.f25454b = iv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25453a.get(obj) * this.f25455c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25454b.b(obj, f7 / this.f25455c);
    }
}
