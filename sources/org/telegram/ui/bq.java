package org.telegram.ui;
public final class bq extends v4.k {
    public final h2.f F = new h2.f((int[]) null);
    public final oq G;

    public bq(oq oqVar) {
        this.G = oqVar;
    }

    @Override
    public final void N() {
        this.F.e();
    }

    @Override
    public final void O() {
        this.G.f48475c.invalidate();
    }

    @Override
    public final void P(v4.d1 d1Var) {
        this.G.f48475c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57009p.isEmpty();
        boolean isEmpty2 = this.f57011r.isEmpty();
        boolean isEmpty3 = this.f57012s.isEmpty();
        boolean isEmpty4 = this.f57010q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
