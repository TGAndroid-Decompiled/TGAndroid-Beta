package org.telegram.ui;
public final class k9 implements q1.c {
    public final int f46831a;
    public final Object f46832b;

    public k9(Object obj, int i3) {
        this.f46831a = i3;
        this.f46832b = obj;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f46831a) {
            case 0:
                s9 s9Var = (s9) this.f46832b;
                q1.g gVar2 = s9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.E = null;
                    return;
                }
                return;
            case 1:
                zk0 zk0Var = (zk0) this.f46832b;
                if (gVar == zk0Var.f52695c) {
                    zk0Var.f52695c = null;
                    return;
                }
                return;
            default:
                ((zp0) this.f46832b).E();
                return;
        }
    }
}
