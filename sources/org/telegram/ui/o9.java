package org.telegram.ui;
public final class o9 implements o1.f {
    public final int f36824a;
    public final Object f36825b;

    public o9(Object obj, int i10) {
        this.f36824a = i10;
        this.f36825b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f36824a) {
            case 0:
                v9 v9Var = (v9) this.f36825b;
                o1.j jVar = v9Var.f39117x;
                if (jVar != null) {
                    jVar.c();
                    v9Var.f39117x = null;
                    return;
                }
                return;
            case 1:
                fo0 fo0Var = (fo0) this.f36825b;
                if (hVar == fo0Var.f34297c) {
                    fo0Var.f34297c = null;
                    return;
                }
                return;
            default:
                ((tt0) this.f36825b).D();
                return;
        }
    }
}
