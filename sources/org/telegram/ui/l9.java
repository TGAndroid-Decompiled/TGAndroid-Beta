package org.telegram.ui;
public final class l9 implements o1.f {
    public final int f39544a;
    public final Object f39545b;

    public l9(Object obj, int i10) {
        this.f39544a = i10;
        this.f39545b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39544a) {
            case 0:
                u9 u9Var = (u9) this.f39545b;
                o1.k kVar = u9Var.f42428y;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f42428y = null;
                    return;
                }
                return;
            case 1:
                qo0 qo0Var = (qo0) this.f39545b;
                if (hVar == qo0Var.f41213c) {
                    qo0Var.f41213c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f39545b).D();
                return;
        }
    }
}
