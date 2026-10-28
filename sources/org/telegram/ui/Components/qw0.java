package org.telegram.ui.Components;
public final class qw0 extends o1.i {
    public final ow0 f32057a;
    public final pw0 f32058b;
    public float f32059c = 1.0f;

    public qw0(ow0 ow0Var, pw0 pw0Var) {
        this.f32057a = ow0Var;
        this.f32058b = pw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f32057a.get(obj) * this.f32059c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f32058b.b(obj, f7 / this.f32059c);
    }
}
