package org.telegram.ui.Components;
public final class ew0 extends o1.i {
    public final cw0 f25986a;
    public final dw0 f25987b;
    public float f25988c = 1.0f;

    public ew0(cw0 cw0Var, dw0 dw0Var) {
        this.f25986a = cw0Var;
        this.f25987b = dw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f25986a.get(obj) * this.f25988c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f25987b.b(obj, f7 / this.f25988c);
    }
}
