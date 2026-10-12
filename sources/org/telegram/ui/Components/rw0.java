package org.telegram.ui.Components;
public final class rw0 extends o1.i {
    public final pw0 f30266a;
    public final qw0 f30267b;
    public float f30268c = 1.0f;

    public rw0(pw0 pw0Var, qw0 qw0Var) {
        this.f30266a = pw0Var;
        this.f30267b = qw0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f30266a.get(obj) * this.f30268c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f30267b.b(obj, f7 / this.f30268c);
    }
}
