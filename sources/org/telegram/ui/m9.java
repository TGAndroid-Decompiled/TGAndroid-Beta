package org.telegram.ui;

public final class m9 implements o1.f {

    public final int f40400a;

    public final Object f40401b;

    public m9(Object obj, int i10) {
        this.f40400a = i10;
        this.f40401b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f40400a) {
            case 0:
                t9 t9Var = (t9) this.f40401b;
                o1.j jVar = t9Var.f42828x;
                if (jVar != null) {
                    jVar.c();
                    t9Var.f42828x = null;
                }
                break;
            case 1:
                zn0 zn0Var = (zn0) this.f40401b;
                if (hVar == zn0Var.f45217c) {
                    zn0Var.f45217c = null;
                }
                break;
            default:
                ((nt0) this.f40401b).D();
                break;
        }
    }
}
