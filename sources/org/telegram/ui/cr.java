package org.telegram.ui;
public final class cr extends s4.j {
    public final e2.f F = new e2.f((int[]) null);
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
        this.G.f40531c.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        this.G.f40531c.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.f47957p.isEmpty();
        boolean isEmpty2 = this.f47959r.isEmpty();
        boolean isEmpty3 = this.f47960s.isEmpty();
        boolean isEmpty4 = this.f47958q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            this.F.d();
        }
        super.m();
    }
}
