package org.telegram.messenger;
public final class z00 implements rc, qc {
    public final u10 f19651a;
    public final kj f19652b;
    public final c3.s f19653c;
    public final bi.i6 d;

    public z00(u10 u10Var, kj kjVar, c3.s sVar, bi.i6 i6Var) {
        this.f19651a = u10Var;
        this.f19652b = kjVar;
        this.f19653c = sVar;
        this.d = i6Var;
    }

    @Override
    public void a(String str) {
        i0.g3(new dn(this.f19651a, this.f19652b, str, this.f19653c, this.d, 18));
    }

    @Override
    public void p(Exception exc) {
        i0.g3(new vl(this.f19651a, this.f19652b, this.f19653c, this.d, 27));
    }
}
