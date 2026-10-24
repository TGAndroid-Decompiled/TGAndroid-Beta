package org.telegram.ui.Components;
public final class gw0 extends o1.i {
    public final ew0 f26804a;
    public final fw0 f26805b;
    public float f26806c = 1.0f;

    public gw0(ew0 ew0Var, fw0 fw0Var) {
        this.f26804a = ew0Var;
        this.f26805b = fw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f26804a.get(obj) * this.f26806c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f26805b.b(obj, f7 / this.f26806c);
    }
}
