package org.telegram.ui;
public final class m9 implements o1.f {
    public final int f39481a;
    public final Object f39482b;

    public m9(Object obj, int i10) {
        this.f39481a = i10;
        this.f39482b = obj;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f39481a) {
            case 0:
                u9 u9Var = (u9) this.f39482b;
                o1.j jVar2 = u9Var.D;
                if (jVar2 != null) {
                    jVar2.d();
                    u9Var.D = null;
                    return;
                }
                return;
            case 1:
                mm0 mm0Var = (mm0) this.f39482b;
                if (jVar == mm0Var.f39575c) {
                    mm0Var.f39575c = null;
                    return;
                }
                return;
            default:
                ((sr0) this.f39482b).E();
                return;
        }
    }
}
