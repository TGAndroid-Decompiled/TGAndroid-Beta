package org.telegram.ui;
public final class m9 implements r1.c {
    public final int f50013a;
    public final Object f50014b;

    public m9(Object obj, int i7) {
        this.f50013a = i7;
        this.f50014b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f50013a) {
            case 0:
                t9 t9Var = (t9) this.f50014b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    return;
                }
                return;
            case 1:
                gl0 gl0Var = (gl0) this.f50014b;
                if (gVar == gl0Var.f48318c) {
                    gl0Var.f48318c = null;
                    return;
                }
                return;
            default:
                ((jq0) this.f50014b).E();
                return;
        }
    }
}
