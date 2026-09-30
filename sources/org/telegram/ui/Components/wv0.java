package org.telegram.ui.Components;
public final class wv0 extends o1.i {
    public final uv0 f30068a;
    public final vv0 f30069b;
    public float f30070c = 1.0f;

    public wv0(uv0 uv0Var, vv0 vv0Var) {
        this.f30068a = uv0Var;
        this.f30069b = vv0Var;
    }

    @Override
    public final float a(Object obj) {
        return this.f30068a.get(obj) * this.f30070c;
    }

    @Override
    public final void b(Object obj, float f7) {
        this.f30069b.b(obj, f7 / this.f30070c);
    }
}
