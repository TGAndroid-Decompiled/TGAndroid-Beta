package org.telegram.ui;
public final class o9 implements o1.f {
    public final int f39599a;
    public final Object f39600b;

    public o9(Object obj, int i10) {
        this.f39599a = i10;
        this.f39600b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f39599a) {
            case 0:
                v9 v9Var = (v9) this.f39600b;
                o1.j jVar = v9Var.f42066x;
                if (jVar != null) {
                    jVar.c();
                    v9Var.f42066x = null;
                    return;
                }
                return;
            case 1:
                ho0 ho0Var = (ho0) this.f39600b;
                if (hVar == ho0Var.f37436c) {
                    ho0Var.f37436c = null;
                    return;
                }
                return;
            default:
                ((au0) this.f39600b).D();
                return;
        }
    }
}
