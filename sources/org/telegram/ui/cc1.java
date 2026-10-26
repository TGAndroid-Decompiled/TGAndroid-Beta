package org.telegram.ui;
public final class cc1 implements kc1 {
    public boolean f38427a;
    public final un f38428b;

    public cc1(un unVar, boolean z10) {
        this.f38428b = unVar;
        this.f38427a = z10;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38427a;
    }

    @Override
    public final void j1(boolean z10) {
        boolean z11 = !this.f38427a;
        this.f38427a = z11;
        sn snVar = this.f38428b.f44388qa;
        snVar.q(snVar.f43545f, snVar.f43546g, z10, Boolean.valueOf(z11), false);
    }
}
