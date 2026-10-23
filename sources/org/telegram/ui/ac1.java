package org.telegram.ui;
public final class ac1 implements hc1 {
    public boolean f35647a;
    public final sn f35648b;

    public ac1(sn snVar, boolean z10) {
        this.f35648b = snVar;
        this.f35647a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f35647a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f35647a;
        this.f35647a = z11;
        qn qnVar = this.f35648b.f41654qa;
        qnVar.q(qnVar.f40871f, qnVar.f40872g, z10, Boolean.valueOf(z11), false);
    }
}
