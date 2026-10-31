package org.telegram.ui;
public final class cr extends s4.j {
    public final e2.f F = new e2.f(null);
    public final pr G;

    public cr(pr prVar) {
        this.G = prVar;
    }

    @Override
    public final void N() {
        this.F.e();
    }

    @Override
    public final void O() {
        this.G.f40724c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f40724c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47946p.isEmpty();
        boolean isEmpty2 = this.f47948r.isEmpty();
        boolean isEmpty3 = this.f47949s.isEmpty();
        boolean isEmpty4 = this.f47947q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
