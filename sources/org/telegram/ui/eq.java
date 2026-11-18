package org.telegram.ui;
public final class eq extends v4.k {
    public final h2.f F = new h2.f((int[]) null);
    public final rq G;

    public eq(rq rqVar) {
        this.G = rqVar;
    }

    @Override
    public final void N() {
        this.F.e();
    }

    @Override
    public final void O() {
        this.G.f51733c.invalidate();
    }

    @Override
    public final void P(v4.f1 f1Var) {
        this.G.f51733c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f59170p.isEmpty();
        boolean isEmpty2 = this.f59172r.isEmpty();
        boolean isEmpty3 = this.f59173s.isEmpty();
        boolean isEmpty4 = this.f59171q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
