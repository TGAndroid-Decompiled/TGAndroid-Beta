package org.telegram.ui.Components;
public final class rw0 extends o1.i {
    public final pw0 f30270a;
    public final qw0 f30271b;
    public float f30272c = 1.0f;

    public rw0(pw0 pw0Var, qw0 qw0Var) {
        this.f30270a = pw0Var;
        this.f30271b = qw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f30270a.get(obj) * this.f30272c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f30271b.b(obj, f7 / this.f30272c);
    }
}
