package org.telegram.ui;
public final class dq extends v4.k {
    public final h2.f F = new h2.f((int[]) null);
    public final qq G;

    public dq(qq qqVar) {
        this.G = qqVar;
    }

    @Override
    public final void N() {
        this.F.e();
    }

    @Override
    public final void O() {
        this.G.f49121c.invalidate();
    }

    @Override
    public final void P(v4.d1 d1Var) {
        this.G.f49121c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f57113p.isEmpty();
        boolean isEmpty2 = this.f57115r.isEmpty();
        boolean isEmpty3 = this.f57116s.isEmpty();
        boolean isEmpty4 = this.f57114q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
