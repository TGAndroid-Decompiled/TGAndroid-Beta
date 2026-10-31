package org.telegram.ui;
public final class m9 implements o1.f {
    public final int f39531a;
    public final Object f39532b;

    public m9(Object obj, int i10) {
        this.f39531a = i10;
        this.f39532b = obj;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f39531a) {
            case 0:
                u9 u9Var = (u9) this.f39532b;
                o1.j jVar2 = u9Var.D;
                if (jVar2 != null) {
                    jVar2.d();
                    u9Var.D = null;
                    return;
                }
                return;
            case 1:
                om0 om0Var = (om0) this.f39532b;
                if (jVar == om0Var.f40304c) {
                    om0Var.f40304c = null;
                    return;
                }
                return;
            default:
                ((tr0) this.f39532b).E();
                return;
        }
    }
}
